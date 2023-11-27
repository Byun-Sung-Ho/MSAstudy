package com.example.catalogs.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCatalog {
    private Long id;
    private String productName;

    private Integer unitPrice;
    private Integer stock;

    private Date createAt;
}
