package com.example.egorysserver.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class VideoDTO implements Serializable {
    private Integer duration_minutes;
    private String short_description;
    private Integer video_id;
    private String genre;
    private String video_name;
    private Integer content_id;
}
