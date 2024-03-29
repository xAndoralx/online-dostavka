package com.example.onlinedostavka.shell;

import com.example.onlinedostavka.entities.Client;
import com.example.onlinedostavka.services.ClientService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
//import org.h2.tools.Console;

import java.sql.SQLException;

@ShellComponent
public class AppEventsCommands {
    private final ClientService clientService;

    public AppEventsCommands(ClientService clientService) {
        this.clientService = clientService;
    }

//    @ShellMethod(value = "Start console H2", key = {"c", "console"})
//    public void startConsoleH2() {
//        try {
//            Console.OnlineDostavkaApplication();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
    @ShellMethod(value = "Create a new Client of Menu in the library", key = {"cc", "createclient"})
    public  String createNewClient(@ShellOption(defaultValue = "Stephen Edwin king") String fullName) {
        return clientService.createClient(new Client(fullName)).toString();
    }
    @ShellMethod(value = "Get All Clients", key = {"gac", "getallclients"})
    public void getAllClients() {
        System.out.println(clientService.getAllClients().toString());
    }

    @ShellMethod(value = "Get Client By Id", key = {"gcb", "getclientbyid"})
    public void getClientById(@ShellOption(defaultValue = "1") long id) {
        System.out.println(clientService.getClientById(id).toString());
    }
    @ShellMethod(value = "Get upgate Client", key = {"guc", "getupgateclient"})
    public void getUpgateClient(
            @ShellOption(defaultValue = "1") long id,
            @ShellOption(defaultValue = "Gianni Rodari") String fullName) {
        clientService.updateClient(new Client(id, fullName));
    }
    @ShellMethod(value = "Get delete Client", key = {"gdc", "getdeleteclient"})
    public void getDeleteClient(
            @ShellOption(defaultValue = "1") long id,
            @ShellOption(defaultValue = "Gianni Rodari") String fullName) {
        clientService.deleteClient(new Client(id, fullName));
    }
}
