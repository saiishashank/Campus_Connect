package com.CampusConect.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "college")
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String domain;

    @CreationTimestamp
    private Instant createdAt;

    @OneToMany(mappedBy = "college")
    private List<User> users = new ArrayList<>();

    @OneToMany(mappedBy = "college")
    private List<Question> questions = new ArrayList<>();
}