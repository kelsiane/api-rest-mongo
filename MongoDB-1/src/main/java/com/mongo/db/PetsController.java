package com.mongo.db;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.db.repository.PetsRepository;

@RestController
@RequestMapping("/pets")
public class PetsController {
 
  @Autowired
  private PetsRepository repository;
  
  @GetMapping(value="/")
  public List<Pets> getAllPets() {
    return repository.findAll();
  }

//  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//  public Pets getPetById(@PathVariable("id") ObjectId id) {
//    return repository.findBy_id(id);
//  }
  
  @GetMapping("/{id}")
  public Optional<Pets> buscarId(@PathVariable("id") String id){
	  return repository.findById(id);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public void modifyPetById(@PathVariable("id") ObjectId id, @Valid @RequestBody Pets pets) {
    pets.set_id(id);
    repository.save(pets);
  }
  
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public Pets createPet(@Valid @RequestBody Pets pets) {
    repository.save(pets);
    return pets;
  }
  
 
  
//  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//  public void deletePet(@PathVariable ObjectId id) {
//    repository.delete(repository.findBy_id(id));
//  }
  @DeleteMapping("/{id}")
  public void deletePet(@PathVariable String id) {
	  repository.deleteById(id);
	  
  }
}
