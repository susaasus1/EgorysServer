package com.example.egorysserver.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ContentTagDTO implements Serializable {
    private String tag;
    private Integer content_id;

    public ContentTagDTO() {
    }
}
