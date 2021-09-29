package com.alxrdnvc.crudapp.repositories;

import com.alxrdnvc.crudapp.models.Nationality;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalityRepository extends CrudRepository<Nationality, Integer> {

}
