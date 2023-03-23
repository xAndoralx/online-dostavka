package com.example.onlinedostavka.repositories;

import com.example.onlinedostavka.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MenuRepository extends JpaRepository <Menu, Long> {

    Optional<Menu> findById(long id);
}
