package io.github.sarthaka24.reactiveneo4j.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@NodeEntity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    @Relationship(type = "LIVES_IN")
    private Address address;
}
