package dev.justkif.gallary.repositories;

import org.springframework.data.repository.ListCrudRepository;

import dev.justkif.gallary.models.Hero;

public interface HeroRepository extends ListCrudRepository<Hero, Integer> {

}
