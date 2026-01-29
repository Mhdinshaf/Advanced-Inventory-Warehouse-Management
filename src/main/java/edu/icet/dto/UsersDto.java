package edu.icet.dto;

import edu.icet.util.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsersDto {
    private Integer userId;
    private String userName;
    private String password;
    private Role role;
    private String warehouseId;
    private Integer phoneNumber;

}
