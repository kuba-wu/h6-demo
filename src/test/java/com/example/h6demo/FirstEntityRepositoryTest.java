package com.example.h6demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class FirstEntityRepositoryTest {

    @Autowired private FirstEntityRepository repository;

    @Test
    void shouldGetBySomeAttribute() {
        repository.findBySomeAttribute(new FirstEntityAttribute("first"));
    }
}
