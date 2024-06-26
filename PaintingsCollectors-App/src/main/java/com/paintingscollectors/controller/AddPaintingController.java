package com.paintingscollectors.controller;

import com.paintingscollectors.model.dto.AddPaintingDto;
import com.paintingscollectors.model.entity.StyleEnum;
import com.paintingscollectors.service.CurrentUser;
import com.paintingscollectors.service.PaintingService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class AddPaintingController {

    private final CurrentUser currentUser;
    private final PaintingService paintingService;

    public AddPaintingController(CurrentUser currentUser, PaintingService paintingService) {
        this.currentUser = currentUser;
        this.paintingService = paintingService;
    }

    @ModelAttribute("addPaintingDto")
    public AddPaintingDto addPaintingDto() {
        return new AddPaintingDto();
    }


    @GetMapping("/add")
    public String addPainting(Model model) {
        if (!currentUser.isLogged()){
            return "redirect:/";
        }

        model.addAttribute("allStyles", StyleEnum.values());

        return "add-painting";
    }

    @PostMapping("/add")
    public String addPainting(@Valid AddPaintingDto addPaintingDto,
                              BindingResult bindingResult,
                              RedirectAttributes redirectAttributes) {
        if (!currentUser.isLogged()){
            return "redirect:/";
        }
        if(bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("addPaintingDto", addPaintingDto);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.addPaintingDto", bindingResult);
            return "redirect:/add";
        }
        this.paintingService.addPainting(addPaintingDto);
        return "home";
    }


}
