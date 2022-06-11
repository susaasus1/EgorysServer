package com.example.egorysserver.entity;

import javax.persistence.*;

@Entity
@Table(name = "music")
public class Music {
    @Id
    @Column(name = "music_id", nullable = false)
    private Integer music_id;


    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "genre", nullable = false, length = 30)
    private String genre;

    @Column(name = "artist", nullable = false, length = 30)
    private String artist;


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMusic_id() {
        return music_id;
    }

    public void setMusic_id(Integer id) {
        this.music_id = id;
    }
}