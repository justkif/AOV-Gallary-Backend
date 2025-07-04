package dev.justkif.gallary.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.justkif.gallary.models.Hero;
import dev.justkif.gallary.services.HeroService;

@RestController
@RequestMapping("/hero")
public class HeroController {

    private final HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("")
    List<Hero> getAll() {
        return heroService.getAll();
    }

}
