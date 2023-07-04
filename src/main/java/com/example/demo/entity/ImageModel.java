package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ImageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;
    @Column(columnDefinition = "LONGBLOB")
    @Lob
    private byte[] imageByte;
    @JsonIgnore
    private long userId;
    @JsonIgnore
    private long postId;
}
