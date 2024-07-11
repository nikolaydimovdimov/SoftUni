package com.dictionaryapp.controller;

import com.dictionaryapp.model.dto.WordAddDto;
import com.dictionaryapp.model.entity.LanguageEnum;
import com.dictionaryapp.service.CurrentLoggedUser;
import com.dictionaryapp.service.WordService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class WordAddController {

    private final CurrentLoggedUser currentLoggedUser;
    private final WordService wordService;

    public WordAddController(CurrentLoggedUser currentLoggedUser, WordService wordService) {
        this.currentLoggedUser = currentLoggedUser;
        this.wordService = wordService;
    }

    @ModelAttribute("wordAddDto")
    public WordAddDto wordAddDto() {
        return new WordAddDto();
    }

    @GetMapping("/word-add")
    public String wordAdd(Model model) {
        if(!currentLoggedUser.isLogged()){
            return "redirect:/";
        }
        model.addAttribute("allLanguages", LanguageEnum.values());
        return "word-add";
    }

    @PostMapping("/word-add")
    public String wordAdd(@Valid WordAddDto wordAddDto,
                          BindingResult bindingResult,
                          RedirectAttributes redirectAttributes) {
        if(!currentLoggedUser.isLogged()){
            return "redirect:/";
        }
        if(bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("wordAddDto", wordAddDto);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.wordAddDto", bindingResult);
            return "redirect:/word-add";
        }

        this.wordService.addWord(wordAddDto);

        return "redirect:/home";
    }



}
