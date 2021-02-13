package com.example.petclinic.services;

import com.example.petclinic.model.Owner;

import java.util.Set;

/**
 * @author sankalpa on 2/13/21
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
