package com.example.demo.controller;

import com.example.demo.model.Card;
import com.example.demo.model.Client;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @RequestMapping("/")
    public String getClient(){
        Client client = new Client("Josecito", "Lopez", "juanitoElLopez@gmail.com",
                new Card("123456789123456", "123", "LOPEZ", "9", "21", "visa"));
        Gson gson = new Gson();
        String json = gson.toJson(client.getCard());
        return json;
    }
}
