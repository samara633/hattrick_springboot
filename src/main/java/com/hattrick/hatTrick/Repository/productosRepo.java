package com.hattrick.hatTrick.Repository;

import com.hattrick.hatTrick.Entity.Productos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productosRepo extends CrudRepository<Productos, Integer> {

}
