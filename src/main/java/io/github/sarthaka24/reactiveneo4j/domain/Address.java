package io.github.sarthaka24.reactiveneo4j.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.springframework.data.annotation.Id;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private int houseNumber;
    private String city;
    private String state;
}

