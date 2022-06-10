package com.example.egorysserver.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "music")
public class Music {
    public Music() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer music_id;

    @Column
    private String name;
    @Column
    private String genre;
    @Column
    private String artist;


}
