package com.example.h6demo;

import jakarta.persistence.Embeddable;

@Embeddable
public interface GenericValue {
    String getAttributeValue();

    void setAttributeValue(String value);
}
