package com.example.egorysserver.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "video")
public class Video {
    @Column
    private Integer duration_minutes;
    @Column
    private String short_description;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer video_id;
    @Column
    private String genre;
    @Column
    private String video_name;

    public Video() {
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "content_id", referencedColumnName = "content_id")
    private Content content;
}
