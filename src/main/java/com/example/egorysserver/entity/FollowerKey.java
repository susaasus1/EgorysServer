package com.example.egorysserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FollowerKey implements Serializable {
    @Column(name = "uid")
    private Integer uid;
    @Column(name = "author_id")
    private Integer author_id;
}
