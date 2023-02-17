package com.example.h6demo;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondEntityRepository extends CrudRepository<SecondEntity, Long> {

    Optional<SecondEntity> findBySomeAttribute(SecondEntityAttribute value);

}
