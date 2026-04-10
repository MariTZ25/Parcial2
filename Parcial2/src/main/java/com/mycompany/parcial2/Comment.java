/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Zedanc
 */
public class Comment {
    private User author;
    private String text;
    private LocalDate date;
    private Publication publications;
    private ArrayList<Comment> responses;
    
    
    public Comment(User author, String text, LocalDate date, Publication publications, ArrayList<Comment> responses) {
        
        this.author = author;
        this.text = text;
        this.date = date;
        this.publications = publications;
        this.responses = responses;
    }

    public User getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDate() {
        return date;
    }

    public Publication getPublications() {
        return publications;
    }

    public ArrayList<Comment> getResponses() {
        return responses;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setPublications(Publication publications) {
        this.publications = publications;
    }

    public void setResponses(ArrayList<Comment> responses) {
        this.responses = responses;
    }
    
    
    
    
}
