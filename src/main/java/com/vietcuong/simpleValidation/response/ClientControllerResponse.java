package com.vietcuong.simpleValidation.response;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class ClientControllerResponse<T> {
    private String statusCode;
    private String description;
    private T content;
}
