package com.example.onlinedostavka.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table (name = "Client_Order")
public class Client_Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private long id;
    @Column (name = "title")
    private String title;
    @ManyToOne (cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JoinColumn (name = "client_id")
    private Client client;

    public Client_Order() {
    }

    public Client_Order(String title, Client client) {
        this.title = title;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client_Order that = (Client_Order) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(client, that.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, client);
    }
}
