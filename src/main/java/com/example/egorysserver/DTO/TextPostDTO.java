package com.example.egorysserver.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class TextPostDTO implements Serializable {
    private Integer symbol_number;
    private Integer text_post_id;
    private String post_name;
    private Integer content_id;
}
