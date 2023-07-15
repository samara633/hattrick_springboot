package com.hattrick.hatTrick.Repository;
import com.hattrick.hatTrick.Entity.Empresa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empresaRepo extends CrudRepository<Empresa, Integer> {
}
