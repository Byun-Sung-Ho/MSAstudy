package com.example.userserviceapplication.vo;

import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class RequestLogin {
    private String email;

    private String password;
}
