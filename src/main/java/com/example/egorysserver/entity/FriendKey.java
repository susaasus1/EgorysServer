package com.example.egorysserver.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class FriendKey implements Serializable {
    @Column(name="uidFriend")
    Integer uidFriend;

    @Column(name="uid")
    Integer uid;

    public FriendKey(Integer uidFriend, Integer uid) {
        this.uidFriend = uidFriend;
        this.uid = uid;
    }

    public FriendKey() {
    }

    public Integer getUidFriend() {
        return uidFriend;
    }

    public void setUidFriend(Integer uidFriend) {
        this.uidFriend = uidFriend;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
