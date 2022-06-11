package com.example.egorysserver.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "friends")
public class Friend {

    @EmbeddedId
    FriendKey id;

    @ManyToMany
    @MapsId("uidFriend")
    @JoinColumn(name = "uid_friend", nullable = false)
    private List<User> uidFriend;
    @ManyToMany
    @MapsId("uid")
    @JoinColumn(name = "uid", nullable = false)
    private List<User> uid;

    public Friend() {
    }
}