package com.example.petclinic.services;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Pet;

import java.util.Set;

/**
 * @author sankalpa on 2/13/21
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
