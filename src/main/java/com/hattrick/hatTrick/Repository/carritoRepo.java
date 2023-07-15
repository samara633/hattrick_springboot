package com.hattrick.hatTrick.Repository;

import com.hattrick.hatTrick.Entity.Carrito;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface carritoRepo extends CrudRepository<Carrito, Integer> {
}
