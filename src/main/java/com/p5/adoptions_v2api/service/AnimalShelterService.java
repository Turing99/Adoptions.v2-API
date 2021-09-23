package com.p5.adoptions_v2api.service;

import com.p5.adoptions_v2api.reosotory.animal.AnimalRepository;
import com.p5.adoptions_v2api.reosotory.shelter.AnimalShelterRepository;
import org.springframework.stereotype.Service;


@Service
public class AnimalShelterService {

    private final AnimalShelterRepository animalShelterRepository;
    private final AnimalRepository animalRepository;

    public AnimalShelterService(AnimalShelterRepository animalShelterRepository, AnimalRepository animalRepository)
    {
        this.animalShelterRepository = animalShelterRepository;
        this.animalRepository = animalRepository;
    }

    //....
}
