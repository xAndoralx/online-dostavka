package com.example.onlinedostavka.repositories;

import com.example.onlinedostavka.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
        Optional<Client> findById(long id);
    }

