package com.dictionaryapp.init;

import com.dictionaryapp.model.dto.LanguageSeedDto;
import com.dictionaryapp.model.entity.Language;
import com.dictionaryapp.repo.LanguageRepository;
import com.dictionaryapp.validation.ValidationUtil;
import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class InitDataBaseLanguages implements CommandLineRunner {

    private final String PATH_TO_FILE_LANGUAGES = "src/main/resources/languages.json";
    private final LanguageRepository languageRepository;
    private final Gson gson;
    private final ModelMapper modelMapper;
    private final ValidationUtil validationUtil;

    public InitDataBaseLanguages(LanguageRepository languageRepository, Gson gson, ModelMapper modelMapper, ValidationUtil validationUtil) {
        this.languageRepository = languageRepository;
        this.gson = gson;
        this.modelMapper = modelMapper;
        this.validationUtil = validationUtil;
    }


    private String dataFromFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Path.of(filePath)));
    }

    private boolean isValidDto(LanguageSeedDto languageSeedDto) {
        return this.validationUtil.isValid(languageSeedDto)
                && this.languageRepository.findFirstByLanguageName(languageSeedDto.getLanguageName()).isEmpty();
    }


    private void seedCategoriesDataBase() throws IOException {
        if (this.languageRepository.count() == 0) {
            StringBuilder result = new StringBuilder();
            LanguageSeedDto[] languageSeedDtos= this.gson.fromJson(dataFromFile(PATH_TO_FILE_LANGUAGES), LanguageSeedDto[].class);
            for (LanguageSeedDto languageSeedDto : languageSeedDtos) {
                if (isValidDto(languageSeedDto)) {
                    Language languageMapped = this.modelMapper.map(languageSeedDto, Language.class);
                    this.languageRepository.save(languageMapped);
                    result.append(String.format("***** Successfully added language %s ! *******\n", languageMapped.getLanguageName()));
                } else {
                    result.append("***** ERROR while add language ! *******\n");
                }
            }
            System.out.println(result);
        } else {
            System.out.println("\n\n ******* There are languages in the database!!! ********\n\n");
        }
    }

    @Override
    public void run(String... args) throws Exception {
        seedCategoriesDataBase();
    }
}
