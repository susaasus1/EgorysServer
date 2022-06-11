package com.example.egorysserver.entity;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user_playlist")
public class UserPlaylist {

    @EmbeddedId
    UserPlaylistKey id;

    @ManyToMany
    @MapsId("uid")
    @JoinColumn(name = "uid", nullable = false)
    private List<User> uid;

    @ManyToMany
    @MapsId("music_id")
    @JoinColumn(name = "music_id", nullable = false)
    private List<Music> music_id;

    public UserPlaylist() {
    }
}