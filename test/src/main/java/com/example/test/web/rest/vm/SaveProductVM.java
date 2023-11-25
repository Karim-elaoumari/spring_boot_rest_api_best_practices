package com.example.test.web.rest.vm;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.bridge.IMessage;

import javax.persistence.Id;
import javax.validation.constraints.*;

@Data @NoArgsConstructor @AllArgsConstructor
public class SaveProductVM {
    @NotBlank(message = "Name can't be empty")
    private String name;
    @NotNull(message = "Id can't be null")
//    validate category id is number
    @Min(value = 1,message = "Id must be positive")
    @JsonProperty("category_id")
    private Long category;
}
