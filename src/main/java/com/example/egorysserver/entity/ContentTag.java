package com.example.egorysserver.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "content_tag")
public class ContentTag {

    @EmbeddedId
    private ContentTagKey contentTagKey;
    @Column
    private String tag;

    @ManyToMany
    @MapsId("content_id")
    @JoinColumn(name = "content_id", nullable = false)
    private List<Content> content;

    public ContentTag() {
    }
}
