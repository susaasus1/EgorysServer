package com.example.egorysserver.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Column
    private String u_name;
    @Column
    private String u_surname;
    @Column
    private String date_of_birth;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    @Column(nullable = false)
    private char gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "info_id", referencedColumnName = "info_id")
    private UserInfo userInfo;
//    @OneToMany(mappedBy = "author_id")
//    private List<Author> authors;

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "u_name='" + u_name + '\'' +
                ", u_surname='" + u_surname + '\'' +
                ", date_of_birth='" + date_of_birth + '\'' +
                ", uid=" + uid +
                ", gender=" + gender +
                ", userInfoId=" + userInfo.getInfo_id() +
                '}';
    }
}
