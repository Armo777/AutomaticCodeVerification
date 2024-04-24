package com.example.automaticcodeverification;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@RestController
public class Controller {

   @GetMapping(path = "/example", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String handleJsonRequest(@RequestBody String jsonRequest) {
        System.out.println("Получен запрос JSON: " + jsonRequest);
        return "Ответ от сервера" + jsonRequest;
    }
}
