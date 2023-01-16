package com.example.peerv2.dto.exceptiondto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDto {

    private Date timestamp;
    private String message;
    private String details;

}
