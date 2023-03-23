package com.example.onlinedostavka.controller;

import com.example.onlinedostavka.entities.Client;
import com.example.onlinedostavka.repositories.ClientRepository;
import com.example.onlinedostavka.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Id;
import java.util.List;

@Controller
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @GetMapping("/clients")
    public String menuPage(Model model) {
        List<Client> clientList = clientService.getAllClients();
        model.addAttribute("clients", clientList);
        return "clients";
    }
    @GetMapping("/client")
    public String editPage(@RequestParam("id") long id, Model model) {

        Client client = clientService.getClientById(id).get();
        model.addAttribute("id", id);
        return "car";
    }
}
