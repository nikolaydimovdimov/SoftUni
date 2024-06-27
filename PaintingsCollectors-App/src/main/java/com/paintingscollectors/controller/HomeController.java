package com.paintingscollectors.controller;

import com.paintingscollectors.service.CurrentUser;
import com.paintingscollectors.service.PaintingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        model.addAttribute("votedPaintings",this.paintingService.getTwoMostFavoritePaintings());
        return "home";
    }
}
