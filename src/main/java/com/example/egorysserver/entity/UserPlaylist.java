package com.example.egorysserver.entity;



import javax.persistence.*;

@Entity
@Table(name = "user_playlist")
public class UserPlaylist {
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "uid", nullable = false)
    private User uid;

    @ManyToOne(optional = false)
    @JoinColumn(name = "music_id", nullable = false)
    private Music music;

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public User getUid() {
        return uid;
    }

    public void setUid(User uid) {
        this.uid = uid;
    }
}