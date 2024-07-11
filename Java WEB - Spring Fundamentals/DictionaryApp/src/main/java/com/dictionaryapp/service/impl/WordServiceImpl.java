package com.dictionaryapp.service.impl;

import com.dictionaryapp.model.dto.WordAddDto;
import com.dictionaryapp.model.entity.LanguageEnum;
import com.dictionaryapp.model.entity.Word;
import com.dictionaryapp.repo.LanguageRepository;
import com.dictionaryapp.repo.UserRepository;
import com.dictionaryapp.repo.WordRepository;
import com.dictionaryapp.service.CurrentLoggedUser;
import com.dictionaryapp.service.WordService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    private final WordRepository wordRepository;
    private final LanguageRepository languageRepository;
    private final ModelMapper modelMapper;
    private final CurrentLoggedUser currentLoggedUser;
    private final UserRepository userRepository;

    public WordServiceImpl(WordRepository wordRepository, LanguageRepository languageRepository, ModelMapper modelMapper, CurrentLoggedUser currentLoggedUser, UserRepository userRepository) {
        this.wordRepository = wordRepository;
        this.languageRepository = languageRepository;
        this.modelMapper = modelMapper;
        this.currentLoggedUser = currentLoggedUser;
        this.userRepository = userRepository;
    }

    @Override
    public List<Word> getWordsByLanguage(LanguageEnum languageEnum) {
        return this.wordRepository
                .findAllByLanguage(this.languageRepository
                        .findFirstByLanguageName(languageEnum).get());
    }

    @Override
    public void addWord(WordAddDto wordAddDto) {
        Word wordMapped = this.modelMapper.map(wordAddDto, Word.class);
        wordMapped.setLanguage(this.languageRepository.findFirstByLanguageName(wordAddDto.getLanguageEnum()).get());
        wordMapped.setAddedBy(this.userRepository.findFirstById(this.currentLoggedUser.getId()).get());
        this.wordRepository.save(wordMapped);
    }
}
