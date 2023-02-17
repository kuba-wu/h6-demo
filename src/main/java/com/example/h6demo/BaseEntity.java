package com.example.h6demo;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

@Getter
@Setter
@EqualsAndHashCode(of = "someAttribute")
@MappedSuperclass
public class BaseEntity<T extends GenericValue> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bigserial")
    private Long id;

    @Embedded
    private T someAttribute;
}
