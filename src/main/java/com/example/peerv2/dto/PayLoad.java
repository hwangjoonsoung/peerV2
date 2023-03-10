package com.example.peerv2.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PayLoad<T> {

    private boolean success = true;
    private String message;
    private T data;

    public PayLoad(T data) {
        if (data == null) {
            this.message = "fail";
        } else {
            this.message = "success";
            this.data = data;
        }
    }
}
