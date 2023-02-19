package com.example.onlinedostavka.repositories;

import com.example.onlinedostavka.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository  extends JpaRepository<Menu, Long> {

}
