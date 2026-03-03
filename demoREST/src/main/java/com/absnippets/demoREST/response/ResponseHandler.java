package com.absnippets.demoREST.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public static ResponseEntity<Object> responseBuilder
            (String message, HttpStatus httpStatus, Object object)
    {
        Map<String , Object> response = new HashMap<>();
        response.put("Message", message);
        response.put("HttpStatus",httpStatus);
        response.put("Data",object);

        return new ResponseEntity<>(response, httpStatus);
    }
}
