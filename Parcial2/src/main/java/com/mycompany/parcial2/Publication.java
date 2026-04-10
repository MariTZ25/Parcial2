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
public abstract class Publication {
    
    protected int id;
    protected User author;
    protected LocalDate publicationDate;
    protected String descriptiveText;
    protected ArrayList<Reaction> reactions;
    protected ArrayList<Comment> comments;

    public Publication(int id, User author, LocalDate publicationDate, String descriptiveText, ArrayList<Reaction> reactions, ArrayList<Comment> comments) {
        this.id = id;
        this.author = author;
        this.publicationDate = publicationDate;
        this.descriptiveText = descriptiveText;
        this.reactions = reactions;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public User getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public String getDescriptiveText() {
        return descriptiveText;
    }

    public ArrayList<Reaction> getReactions() {
        return reactions;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setDescriptiveText(String descriptiveText) {
        this.descriptiveText = descriptiveText;
    }

    public void setReactions(ArrayList<Reaction> reactions) {
        this.reactions = reactions;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }
        public void postImage(){};
    
    
    
}
