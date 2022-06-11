package com.example.egorysserver.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class UserPlaylistDTO implements Serializable {
    private Integer uid;
    private Integer music_id;
}
