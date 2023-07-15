package com.hattrick.hatTrick.Repository;

import com.hattrick.hatTrick.Entity.Usuarios;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuariosRepo extends CrudRepository<Usuarios, Integer> {

}
