package com.example.userserviceapplication.dto;

import com.example.userserviceapplication.vo.ResponseOrder;
import com.example.userserviceapplication.vo.ResponseUser;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDto {
    private String email;
    private String name;
    private String pwd;

    private String userId;
    private Date createAt;

    private String encryptedPwd;


    private List<ResponseOrder> orders;
}
