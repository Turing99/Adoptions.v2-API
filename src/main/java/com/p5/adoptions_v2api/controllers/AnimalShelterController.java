package com.p5.adoptions_v2api.controllers;

import com.p5.adoptions_v2api.reopository.cats.Cat;
import com.p5.adoptions_v2api.reopository.dogs.Dog;
import com.p5.adoptions_v2api.reopository.shelter.AnimalShelter;
import com.p5.adoptions_v2api.service.AnimalShelterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shelters")
public class AnimalShelterController {


    AnimalShelterService animalShelterService;

    public AnimalShelterController(AnimalShelterService animalShelterService) {
        this.animalShelterService = animalShelterService;
    }

    @GetMapping()
    public ResponseEntity<List<AnimalShelter>> getShelters() {
        return ResponseEntity.ok(animalShelterService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimalShelter> getShelter(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(animalShelterService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<AnimalShelter> createShelter(@RequestBody AnimalShelter animalShelter) {
        return ResponseEntity.ok(animalShelterService.createShelter(animalShelter));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnimalShelter> updateShelter(@PathVariable("id") Integer id, @RequestBody AnimalShelter animalShelter) {
        return ResponseEntity.ok(animalShelterService.updateShelter(id, animalShelter));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteShelter(@PathVariable("id") Integer id) {
        animalShelterService.deleteShelter(id);
        return ResponseEntity.status(HttpStatus.GONE).build();
    }

    @GetMapping("/{shelterId}/cats")
    public ResponseEntity<List<Cat>> getCatsForShelter(@PathVariable("shelterId") Integer shelterId) {
        return ResponseEntity.ok(animalShelterService.findAllCatsByShelter(shelterId));
    }

    @PutMapping("/{shelterId}/cats")
    public ResponseEntity<List<Cat>> addNewCatToShelter(@PathVariable("shelterId") Integer shelterId, @RequestBody Cat cat) {
        return ResponseEntity.ok(animalShelterService.addNewCatToShelter(shelterId, cat));
    }

    @PatchMapping("/{shelterId}/cats/{catId}")
    public ResponseEntity<Cat> updateCatInShelter(@PathVariable("shelterId") Integer shelterId, @PathVariable("catId") Integer catId, @RequestBody Cat cat) {
        return ResponseEntity.ok(animalShelterService.updateCatInShelter(shelterId, catId, cat));
    }

    @DeleteMapping("/{shelterId}/cats/{catId}")
    public ResponseEntity<Object> deleteCatInShelter(@PathVariable("shelterId") Integer shelterId, @PathVariable("catId") Integer catId) {
        animalShelterService.deleteCatInShelter(shelterId, catId);
        return ResponseEntity.status(HttpStatus.GONE).build();
    }

    @GetMapping("/{shelterId}/dogs")
    public ResponseEntity<List<Dog>> getDogsForShelter(@PathVariable("shelterId") Integer shelterId) {
        return ResponseEntity.ok(animalShelterService.findAllDogsByShelter(shelterId));
    }

    @PutMapping("/{shelterId}/dogs")
    public ResponseEntity<List<Dog>> addNewDogToShelter(@PathVariable("shelterId") Integer shelterId, @RequestBody Dog dog) {
        return ResponseEntity.ok(animalShelterService.addNewDogToShelter(shelterId, dog));
    }

    @PatchMapping("/{shelterId}/dogs/{dogId}")
    public ResponseEntity<Dog> updateDogInShelter(@PathVariable("shelterId") Integer shelterId, @PathVariable("dogId") Integer dogId, @RequestBody Dog dog) {
        return ResponseEntity.ok(animalShelterService.updateDogInShelter(shelterId, dogId, dog));
    }

    @DeleteMapping("/{shelterId}/dogs/{dogId}")
    public ResponseEntity<Object> deleteDogInShelter(@PathVariable("shelterId") Integer shelterId, @PathVariable("dogId") Integer dogId) {
        animalShelterService.deleteDogInShelter(shelterId, dogId);
        return ResponseEntity.status(HttpStatus.GONE).build();
    }


}
