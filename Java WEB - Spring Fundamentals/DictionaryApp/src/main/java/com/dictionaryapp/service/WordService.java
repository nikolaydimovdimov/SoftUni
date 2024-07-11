package com.dictionaryapp.service;

import com.dictionaryapp.model.dto.WordAddDto;
import com.dictionaryapp.model.entity.LanguageEnum;
import com.dictionaryapp.model.entity.Word;

import java.util.List;

public interface WordService {
    List<Word> getWordsByLanguage(LanguageEnum languageEnum);
    void addWord(WordAddDto wordAddDto);
}
