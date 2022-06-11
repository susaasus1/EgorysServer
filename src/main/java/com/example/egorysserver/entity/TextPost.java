package com.example.egorysserver.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "text_post")
public class TextPost {
    @Column
    private Integer symbol_number;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer text_post_id;
    @Column
    private String post_name;

    public TextPost() {
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "content_id", referencedColumnName = "content_id")
    private Content content;
}
