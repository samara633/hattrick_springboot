package com.hattrick.hatTrick.Repository;

import com.hattrick.hatTrick.Entity.Pagos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface pagosRepo extends CrudRepository<Pagos, Integer> {
}
