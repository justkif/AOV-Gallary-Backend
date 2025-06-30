package dev.justkif.gallary.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.justkif.gallary.models.Hero;
import dev.justkif.gallary.repositories.HeroRepository;
import dev.justkif.gallary.utils.CheckEmpty;

@Service
public class HeroService {

    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public List<Hero> getAll() {
        return CheckEmpty.checkList(
            heroRepository.findAll(), 
            "No heros found."
        );
    }

}
