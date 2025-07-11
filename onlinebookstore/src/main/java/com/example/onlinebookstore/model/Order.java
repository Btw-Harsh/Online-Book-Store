package com.example.onlinebookstore.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")  // Because "Order" is a reserved keyword in many DBs
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Many orders belong to one user
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private LocalDateTime orderDate;

    private double totalAmount;
    @ManyToMany
    private List<Book> books;


    // No-argument constructor
    public Order() {
    }

    // Parameterized constructor
    public Order(User user, LocalDateTime orderDate, double totalAmount) {
        this.user = user;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }
    public Order(User user, LocalDateTime orderDate, double totalAmount, List<Book> books) {
        this.user = user;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.books = books;
    }


    // Getters & Setters
    public Long getId() {
        return id;
    }
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
