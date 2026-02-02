package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionDto {
    private Integer transactionId;
    private String productId;
    private String warehouseid;
    private String type;
    private String qty;
    private String time;
}
