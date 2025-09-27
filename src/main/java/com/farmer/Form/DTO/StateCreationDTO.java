package com.farmer.Form.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StateCreationDTO {
    
    @NotBlank(message = "State name is required")
    @Size(max = 100, message = "State name must not exceed 100 characters")
    private String name;
    
    @NotNull(message = "Country ID is required")
    private Long countryId;
}
