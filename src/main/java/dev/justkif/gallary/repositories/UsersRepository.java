package dev.justkif.gallary.repositories;

import org.springframework.data.repository.ListCrudRepository;

import dev.justkif.gallary.models.Users;

public interface UsersRepository extends ListCrudRepository<Users, Integer> {

}
