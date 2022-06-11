package com.example.egorysserver.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class AuthorDTO implements Serializable {
    private Integer author_id;
    private String a_nickname;
    private Integer uid;
}
