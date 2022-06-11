package com.example.egorysserver.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ContentDTO implements Serializable {
    private Integer content_id;
    private Integer author_id;
}
