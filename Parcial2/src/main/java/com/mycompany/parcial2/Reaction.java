/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2;

import java.time.LocalDate;

/**
 *
 * @author Zedanc
 */
public class Reaction {
    private User user;
    private ReactionType type;
    private LocalDate date;
    private Publication publication;

    public Reaction(User user, ReactionType type, LocalDate date, Publication publication) {
        this.user = user;
        this.type = type;
        this.date = date;
        this.publication = publication;
    }

    public User getUser() {
        return user;
    }

    public ReactionType getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setType(ReactionType type) {
        this.type = type;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }
    
    
}
