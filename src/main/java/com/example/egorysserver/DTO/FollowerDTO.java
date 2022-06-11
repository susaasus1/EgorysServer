package com.example.egorysserver.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class FollowerDTO implements Serializable {
    private Integer uid;
    private Integer author_id;
}
