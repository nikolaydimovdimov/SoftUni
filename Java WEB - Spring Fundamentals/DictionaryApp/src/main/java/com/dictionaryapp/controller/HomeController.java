package com.dictionaryapp.controller;

import com.dictionaryapp.model.entity.LanguageEnum;
import com.dictionaryapp.repo.UserRepository;
import com.dictionaryapp.repo.WordRepository;
import com.dictionaryapp.service.CurrentLoggedUser;
import com.dictionaryapp.service.UserService;
import com.dictionaryapp.service.WordService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private final CurrentLoggedUser currentLoggedUser;
    private final UserService userService;
    private final UserRepository userRepository;
    private final WordService wordService;
    private final WordRepository wordRepository;


    public HomeController(CurrentLoggedUser currentLoggedUser, UserService userService, UserRepository userRepository, WordService wordService, WordRepository wordRepository) {
        this.currentLoggedUser = currentLoggedUser;
        this.userService = userService;
        this.userRepository = userRepository;
        this.wordService = wordService;
        this.wordRepository = wordRepository;
    }



    @GetMapping("/home")
    public String home(Model model) {
        if(!currentLoggedUser.isLogged()){
            return "redirect:/";
        }

        model.addAttribute("currentLoggedUser", currentLoggedUser);
        model.addAttribute("GermanWords",this.wordService.getWordsByLanguage(LanguageEnum.GERMAN));
        model.addAttribute("FrenchWords",this.wordService.getWordsByLanguage(LanguageEnum.FRENCH));
        model.addAttribute("SpanishWords",this.wordService.getWordsByLanguage(LanguageEnum.SPANISH));
        model.addAttribute("ItalianWords",this.wordService.getWordsByLanguage(LanguageEnum.ITALIAN));
        model.addAttribute("WordsCount",this.wordRepository.count());
        return "home";
    }

//    @GetMapping("/rate/{id}")
//    public String rateRecipe(@PathVariable Long id) {
//        if(!currentLoggedUser.isLogged()){
//            return "redirect:/";
//        }
//        this.userService.rateRecipe(id);
//        return "redirect:/home";
//    }

    @GetMapping("/remove-all-words")
    public String removeAllWords() {
        if(!currentLoggedUser.isLogged()){
            return "redirect:/";
        }
        this.wordRepository.deleteAll();

        return "redirect:/home";
    }

    @GetMapping("/remove/{id}")
    public String removeAllWords(@PathVariable Long id) {
        if(!currentLoggedUser.isLogged()){
            return "redirect:/";
        }
        this.wordRepository.deleteById(id);

        return "redirect:/home";
    }
}
