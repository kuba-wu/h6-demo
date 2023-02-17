package com.example.h6demo;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstEntityRepository extends CrudRepository<FirstEntity, Long> {

    Optional<FirstEntity> findBySomeAttribute(FirstEntityAttribute value);
}
