package edu.icet.dto;

import edu.icet.util.Status;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PurchaseDto {
    private Integer purchaseId;
    private String supplierId;
    private String userId;
    private String orderdate;
    private Status status;
}
