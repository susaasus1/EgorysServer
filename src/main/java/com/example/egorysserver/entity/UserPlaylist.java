package com.example.egorysserver.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user_playlist")
public class UserPlaylist {
    public UserPlaylist() {
    }

    @Id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "uid", referencedColumnName = "uid")
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "music_id", referencedColumnName = "music_id")
    private Music Music;
}
