package com.example.peerv2.exceptionHandler;

import com.example.peerv2.dto.exceptiondto.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@RestControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest webRequest) {
        ExceptionDto exceptionDto = new ExceptionDto(new Date(),ex.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity(exceptionDto, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({UserNotFoundException.class})
    public final ResponseEntity<Object> userNotFoundException(Exception ex, WebRequest webRequest) {
        ExceptionDto exceptionDto = new ExceptionDto(new Date(), ex.getMessage(), webRequest.getDescription(false));
        return new ResponseEntity(exceptionDto , HttpStatus.NOT_FOUND);
    }

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(ConflictTest.class)
    public static final ResponseEntity<Object> conflictException(Exception ex, WebRequest webRequest){
        ExceptionDto exceptionDto = new ExceptionDto(new Date() , ex.getMessage() , webRequest.getDescription(false));
        return new ResponseEntity(exceptionDto , HttpStatus.OK);
    }

//    @ExceptionHandler(UserNotFoundException.class)
//    public ResponseEntity<String> stringResponseEntity(UserNotFoundException exception){
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
//    }

}
