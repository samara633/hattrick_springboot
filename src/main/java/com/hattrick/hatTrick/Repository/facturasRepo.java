package com.hattrick.hatTrick.Repository;

import com.hattrick.hatTrick.Entity.Facturas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface facturasRepo extends CrudRepository<Facturas, Integer> {
}
