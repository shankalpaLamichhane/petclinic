package com.example.petclinic.services;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Vet;

import java.util.Set;

/**
 * @author sankalpa on 2/13/21
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
