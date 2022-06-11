package com.example.egorysserver.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class ContentInteractionDTO implements Serializable {
    private Integer contentinteraction_id;
    private Integer uid;
    private Integer content_id;
    private Integer reaction_type_id;

    public ContentInteractionDTO() {
    }
}
