package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SalesOrdersDTO {
    private Integer salesOrderId;
    private String warehouseId;
    private String customerInfo;
    private String orderDate;
}
