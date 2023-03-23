package com.example.onlinedostavka.services;

import com.example.onlinedostavka.entities.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> getAllClients();
    Optional<Client> getClientById (long id);

    Client createClient (Client client);

    Client updateClient (Client client);

    void deleteClient (Client client);
}
