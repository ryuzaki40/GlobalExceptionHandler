package com.example.GlobalExceptionHandler.controller;

import com.example.GlobalExceptionHandler.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
    
    @GetMapping("/item/{id}")
    public String getItem(@pathVariable int id)
    {
        if(id !=1)
        {
            throw new ResourceNotFoundException("Item with ID "+id+ "not found");
        }

        return "Item data for ID 1";
    }

}
