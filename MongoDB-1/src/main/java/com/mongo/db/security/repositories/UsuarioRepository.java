package com.mongo.db.security.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.mongo.db.security.entities.Usuario;

@Transactional(readOnly = true)
public interface UsuarioRepository extends MongoRepository<Usuario, String> {
	Usuario findByEmail(String email);
}
