package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StockLevelDTO {
        private Integer stockId;
        private Integer productId;
        private Integer warehouseId;
        private int quantity;
}
