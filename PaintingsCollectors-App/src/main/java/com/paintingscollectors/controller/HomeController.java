package com.paintingscollectors.controller;

import com.paintingscollectors.service.CurrentUser;
import com.paintingscollectors.service.PaintingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    private final CurrentUser currentUser;
    private final PaintingService paintingService;

    public HomeController(CurrentUser currentUser, PaintingService paintingService) {
        this.currentUser = currentUser;
        this.paintingService = paintingService;
    }

    @GetMapping("/home")
    public String home(Model model) {
        if (!currentUser.isLogged()){
            return "redirect:/";
        }
        model.addAttribute("myPaintings", this.paintingService.getMyPaintings());
        model.addAttribute("otherPaintings", this.paintingService.getOtherPaintings());
        model.addAttribute("favoritePaintings", this.paintingService.getMyFavoritePaintings());
        model.addAttribute("votedPaintings",this.paintingService.getTwoMostVotedPaintings());
        return "home";
    }

    @GetMapping("/paintings/remove/{id}")
    public String removePainting(@PathVariable Long id) {
        if (!currentUser.isLogged()){
            return "redirect:/";
        }
        this.paintingService.removePaintingById(id);
        return "redirect:/home";
    }

    @GetMapping("/paintings/add-to-favorites/{id}")
    public String addToFavorites(@PathVariable Long id) {
        if (!currentUser.isLogged()){
            return "redirect:/";
        }
        this.paintingService.addToFavoritePainting(id);
        return "redirect:/home";
    }

    @GetMapping("/paintings/remove-favorites/{id}")
    public String removeFromFavorites(@PathVariable Long id) {
        if (!currentUser.isLogged()){
            return "redirect:/";
        }
        this.paintingService.removeFromFavoritePainting(id);
        return "redirect:/home";
    }

    @GetMapping("/paintings/vote/{id}")
    public String votePainting(@PathVariable Long id){
        if (!currentUser.isLogged()){
            return "redirect:/";
        }
        this.paintingService.votePainting(id);
        return "redirect:/home";
    }
}
