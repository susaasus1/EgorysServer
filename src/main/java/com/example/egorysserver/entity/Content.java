package com.example.egorysserver.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "content")
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer content_id;
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    public Content() {
    }
}
