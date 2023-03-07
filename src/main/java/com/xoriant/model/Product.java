package com.xoriant.model;


import lombok.*;

import java.util.Date;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer pId;
    private String pName;
    private String pCode;
    private Double pCost;
    private String address;
    private Date date;
}
