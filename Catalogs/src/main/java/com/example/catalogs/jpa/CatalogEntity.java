package com.example.catalogs.jpa;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "catalog")
public class CatalogEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productId;
    private String productName;
    private Integer stock;
    private Integer unitPrice;

    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private Date createAt;
}
