package com.bonappetit.init;

import com.bonappetit.model.dto.CategorySeedDto;
import com.bonappetit.model.entity.Category;
import com.bonappetit.model.entity.CategoryEnum;
import com.bonappetit.repo.CategoryRepository;
import com.bonappetit.vallidation.ValidationUtil;
import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class InitDataBaseCategory implements CommandLineRunner {

    private final String PATH_TO_FILE_CATEGORY = "src/main/resources/categories.json";
    private final Set<String> categoryEnums= Arrays.stream(CategoryEnum.values()).map(Enum::name).collect(Collectors.toSet());
    private final CategoryRepository categoryRepository;
    private final Gson gson;
    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;

    public InitDataBaseCategory(CategoryRepository categoryRepository, Gson gson, ModelMapper modelMapper, ValidationUtil validationUtil) {
        this.categoryRepository = categoryRepository;
        this.gson = gson;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
    }

    boolean isValidDto(CategorySeedDto categorySeedDto) {
        return this.validationUtil.isValid(categorySeedDto)
                && categoryEnums.contains(categorySeedDto.getCategoryName())
                && this.categoryRepository.findFirstByCategoryName(CategoryEnum.valueOf(categorySeedDto.getCategoryName())).isEmpty();
    }


    private void seedCategoriesDataBase() throws IOException {
        if (this.categoryRepository.count() == 0) {
            StringBuilder result = new StringBuilder();
            String dataFromFile = new String(Files.readAllBytes(Path.of(PATH_TO_FILE_CATEGORY)));
            CategorySeedDto[] categorySeedDtos = this.gson.fromJson(dataFromFile, CategorySeedDto[].class);
            for (CategorySeedDto categorySeedDto : categorySeedDtos) {
                if (isValidDto(categorySeedDto)) {
                    Category categoryMapped = this.modelMapper.map(categorySeedDto, Category.class);
                    this.categoryRepository.save(categoryMapped);
                    result.append(String.format("Successfully added category %s\n", categoryMapped.getCategoryName()));
                }else {
                    result.append(String.format("ERROR when add category %s\n", categorySeedDto.getCategoryName()));
                }
            }
            System.out.println(result);
        } else {
            System.out.println("There are categories in the database!!!");
        }
    }

    @Override
    public void run(String... args) throws Exception {
        seedCategoriesDataBase();
    }
}
