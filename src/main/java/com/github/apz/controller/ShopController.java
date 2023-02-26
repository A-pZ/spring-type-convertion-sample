package com.github.apz.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
@AllArgsConstructor
@Slf4j
public class ShopController {

    @GetMapping
    public String display(Model model, @Validated ShopForm shopForm, BindingResult bindingResult) {
        log.info("shopForm: {}", shopForm);
        if (bindingResult.hasErrors()) {
            log.info("error: {}" , bindingResult.getFieldError());
            return "field error: " + bindingResult.getFieldError();
        }
        return "success";
    }
}
