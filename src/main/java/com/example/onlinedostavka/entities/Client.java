package com.example.onlinedostavka.entities;
import javax.persistence.*;

@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "fullname")
    private String fullname;

    public Client() {

    }
    public Client(String fullName) {
        this.fullname = fullName;
    }
    public Client(long id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullname;
    }

    public void setFullName(String fullName) {
        this.fullname = fullName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                '}';
    }
}
