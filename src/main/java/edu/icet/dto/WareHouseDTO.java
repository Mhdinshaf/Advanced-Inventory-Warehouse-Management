package edu.icet.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WareHouseDTO {

    private Integer warehouseId;
    private String name;
    private String address;
    private String userId;
}
