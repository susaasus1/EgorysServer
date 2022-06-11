package com.example.egorysserver.DTO;

import com.example.egorysserver.entity.UserDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class FriendDto implements Serializable {
    private Integer uid;
    private Integer uidFriend;
}
