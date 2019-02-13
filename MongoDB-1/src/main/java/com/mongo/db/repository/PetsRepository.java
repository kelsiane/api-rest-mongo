package com.mongo.db.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.mongo.db.Pets;
//@Repository
//@RepositoryRestResource(collectionResourceRel = "pets", path = "pets")
@RestResource(rel = "pets", path = "pets")
public interface PetsRepository extends MongoRepository<Pets, String> {

	
//	Page<List<Pets>> findByName(@Param("name") String name, Pageable pageable);
//	  PagingAndSortingRepository
//	  @Query(value="{ 'name' : ?0 }", fields="{ 'name' : 1, 'species' : 1}")
//	  List<Pets> findByThename(String name);
//	
//	@Query(" {$or: 	[	{ 'name': { $regex:?0, $options: 'i' } }, { 'species': { $regex:?0, $options: 'i' } }, { 'breed': { $regex:?0, $options: 'i' } }, { 'carrapato.nome': { $regex:?0, $options: 'i' } }  ]}")
//	List<Pets> findBySearch(@Param("search") String search);	
//	
}