package com.example.h6demo;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class SecondEntityAttribute implements GenericValue {

    private String attributeValue;
}
