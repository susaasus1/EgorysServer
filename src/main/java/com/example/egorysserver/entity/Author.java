package com.example.egorysserver.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "author")
public class Author {
    public Author() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer author_id;

    @Column
    private String a_nickname;

    @ManyToOne
    @JoinColumn(name = "uid", nullable = false)
    private User user;
}
