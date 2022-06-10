package com.example.egorysserver.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
public class UserDTO {
    private String u_name;
    private String u_surname;
    private String date_of_birth;
    private Integer uid;
    private char gender;
    private Integer info_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDTO userDTO = (UserDTO) o;
        return gender == userDTO.gender && Objects.equals(u_name, userDTO.u_name) && Objects.equals(u_surname, userDTO.u_surname) && Objects.equals(date_of_birth, userDTO.date_of_birth) && Objects.equals(uid, userDTO.uid) && Objects.equals(info_id, userDTO.info_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(u_name, u_surname, date_of_birth, uid, gender, info_id);
    }
}
