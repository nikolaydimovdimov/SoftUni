package com.paintingscollectors.init;

import com.google.gson.Gson;
import com.paintingscollectors.model.dto.StyleSeedDto;
import com.paintingscollectors.model.entity.Style;
import com.paintingscollectors.repository.StyleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.xml.validation.Validator;
import java.io.FileNotFoundException;
import java.io.FileReader;

@Component
public class InitDataBaseStyles implements CommandLineRunner {

    private final String PATH_TO_FILE_STYLES="src/main/resources/styles.json";
    private final StyleRepository styleRepository;
    private final Gson gson;
    private final ModelMapper modelMapper;


    public InitDataBaseStyles(StyleRepository styleRepository, Gson gson, ModelMapper modelMapper) {
        this.styleRepository = styleRepository;
        this.gson = gson;
        this.modelMapper = modelMapper;
    }


    private void seedStyleDataBase() throws FileNotFoundException {
        if(this.styleRepository.count() == 0){
            StringBuilder result = new StringBuilder();
            FileReader dataFromFile =new  FileReader(PATH_TO_FILE_STYLES);
            StyleSeedDto[] styleSeedDtos=this.gson.fromJson(dataFromFile, StyleSeedDto[].class);
            for(StyleSeedDto styleSeedDto : styleSeedDtos){
                Style styleMapped = this.modelMapper.map(styleSeedDto, Style.class);
                this.styleRepository.save(styleMapped);
                result.append(String.format("Successfully added style %s\n",styleMapped.getStyleName().toString()));
            }
            System.out.println(result.toString());
        } else {
            System.out.println("There are styles in the database!!!");
        }
    }


    @Override
    public void run(String... args) throws Exception {
        seedStyleDataBase();
    }
}
