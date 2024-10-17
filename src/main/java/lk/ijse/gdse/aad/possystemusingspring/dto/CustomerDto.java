package lk.ijse.gdse.aad.possystemusingspring.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import lk.ijse.gdse.aad.possystemusingspring.customObj.CustomerResponse;
import lk.ijse.gdse.aad.possystemusingspring.dto.SuperDto;
import lk.ijse.gdse.aad.possystemusingspring.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDto implements SuperDto, CustomerResponse {
    private String customerId;
    @NotBlank(message = "Customer Name is mandatory")
    private String customerName;
    private String customerAddress;
    private double customerSalary;
}
