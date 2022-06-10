package com.example.egorysserver.controller;

import com.example.egorysserver.DTO.UserDTO;
import com.example.egorysserver.entity.User;
import com.example.egorysserver.entity.UserInfo;
import com.example.egorysserver.service.UserInfoService;
import com.example.egorysserver.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    UserInfoService userInfoService;

    @RequestMapping(value = "/getUserTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<UserDTO> getAllUsers() {
        List<User> users = userService.findAll();
        List<UserDTO> onlyUsers = new ArrayList<>();
        for (User i : users) {
            onlyUsers.add(new UserDTO(i.getU_name(), i.getU_surname(), i.getDate_of_birth(), i.getUid(), i.getGender(), i.getUserInfo().getInfo_id()));
        }
        return onlyUsers;
    }

    @RequestMapping(value = "/getUserInfoTable", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getAllUserInfo() {
        List<UserInfo> userInfos = userInfoService.findAll();
        return ResponseEntity.ok().body(userInfos);
    }

}
