package com.example.egorysserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserPlaylistKey implements Serializable {
    @Column(name = "uid")
    private Integer uid;
    @Column(name = "music_id")
    private Integer music_id;

    public UserPlaylistKey() {

    }

    public UserPlaylistKey(Integer uid, Integer music_id) {
        this.uid = uid;
        this.music_id = music_id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getMusic_id() {
        return music_id;
    }

    public void setMusic_id(Integer music_id) {
        this.music_id = music_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPlaylistKey that = (UserPlaylistKey) o;
        return Objects.equals(uid, that.uid) && Objects.equals(music_id, that.music_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, music_id);
    }

    @Override
    public String toString() {
        return "UserPlaylistKey{" +
                "uid=" + uid +
                ", music_id=" + music_id +
                '}';
    }
}
