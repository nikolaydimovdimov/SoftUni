package com.bonappetit.init;

import com.bonappetit.model.dto.CategorySeedDto;
import com.bonappetit.model.entity.Category;
import com.bonappetit.repo.CategoryRepository;
import com.bonappetit.vallidation.ValidationUtil;
import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class InitDataBaseCategory implements CommandLineRunner {

    private final String PATH_TO_FILE_CATEGORY = "src/main/resources/categories.json";
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

    private String dataFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Path.of(filePath)));
    }

    private boolean isValidDto(CategorySeedDto categorySeedDto) {
        return this.validationUtil.isValid(categorySeedDto)
                && this.categoryRepository.findFirstByCategoryName(categorySeedDto.getCategoryName()).isEmpty();
    }


    private void seedCategoriesDataBase() throws IOException {
        if (this.categoryRepository.count() == 0) {
            StringBuilder result = new StringBuilder();
            CategorySeedDto[] categorySeedDtos = this.gson.fromJson(dataFromFile(PATH_TO_FILE_CATEGORY), CategorySeedDto[].class);
            for (CategorySeedDto categorySeedDto : categorySeedDtos) {
                if (isValidDto(categorySeedDto)) {
                    Category categoryMapped = this.modelMapper.map(categorySeedDto, Category.class);
                    this.categoryRepository.save(categoryMapped);
                    result.append(String.format("***** Successfully added category %s ! *******\n", categoryMapped.getCategoryName()));
                } else {
                    result.append("***** ERROR while add category ! *******\n");
                }
            }
            System.out.println(result);
        } else {
            System.out.println("\n\n ******* There are categories in the database!!! ********\n\n");
        }
    }

    @Override
    public void run(String... args) throws Exception {
        seedCategoriesDataBase();
    }
}
