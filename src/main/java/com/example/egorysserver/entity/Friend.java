package com.example.egorysserver.entity;

import javax.persistence.*;

@Entity
@Table(name = "friends")
public class Friend {
    @ManyToOne(optional = false)
    @JoinColumn(name = "uid_friend", nullable = false)
    private User uidFriend;
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "uid", nullable = false)
    private User uid;

    public User getUid() {
        return uid;
    }

    public void setUid(User uid) {
        this.uid = uid;
    }

    public User getUidFriend() {
        return uidFriend;
    }

    public void setUidFriend(User uidFriend) {
        this.uidFriend = uidFriend;
    }
}