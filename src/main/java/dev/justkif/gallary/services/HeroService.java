package dev.justkif.gallary.services;

import org.springframework.stereotype.Service;

import dev.justkif.gallary.repositories.HeroRepository;

@Service
public class HeroService {

    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

}
