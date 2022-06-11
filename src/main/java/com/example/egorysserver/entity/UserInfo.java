package com.example.egorysserver.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity

@Table(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer info_id;

    @Column
    private String education;
    @Column
    private String hometown;
    @Column
    private String work;
    public UserInfo() {
    }

    public UserInfo(String education, String hometown, String work) {
        this.education = education;
        this.hometown = hometown;
        this.work = work;
    }
}
