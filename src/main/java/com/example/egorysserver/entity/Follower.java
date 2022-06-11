package com.example.egorysserver.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "follower")
public class Follower {
    @EmbeddedId
    private FollowerKey followerKey;
    @ManyToMany
    @MapsId("uid")
    @JoinColumn(name = "uid", nullable = false)
    private List<User> uid;

    @ManyToMany
    @MapsId("author_id")
    @JoinColumn(name = "author_id", nullable = false)
    private List<Author> author_id;

    public Follower() {
    }

}
