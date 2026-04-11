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
public class User {
    private ConnectUs net;
    private String username;
    private String fullname;
    private String email;
    private LocalDate registrationDate;
    private ArrayList<User> followers;
    private ArrayList<User> following;
    private ArrayList<Publication> publications;
    private ArrayList<Comment> comments;
    private ArrayList<Reaction> reactions;
    
    
    public User(ConnectUs net, String username, String fullname, String email, LocalDate registrationDate) {
        this.net = net;
        this.username = username;
        this.fullname = fullname;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public User(ConnectUs net, String username, String fullname, String email, LocalDate registrationDate, ArrayList<User> followers, ArrayList<User> following, ArrayList<Publication> publications, ArrayList<Comment> comments, ArrayList<Reaction> reactions) {
        this.net = net;
        this.username = username;
        this.fullname = fullname;
        this.email = email;
        this.registrationDate = registrationDate;
        this.followers = followers;
        this.following = following;
        this.publications = publications;
        this.comments = comments;
        this.reactions = reactions;
    }

    public ConnectUs getNet() {
        return net;
    }

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public ArrayList<User> getFollowers() {
        return followers;
    }

    public ArrayList<User> getFollowing() {
        return following;
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public ArrayList<Reaction> getReactions() {
        return reactions;
    }

    public void setNet(ConnectUs net) {
        this.net = net;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setFollowers(ArrayList<User> followers) {
        this.followers = followers;
    }

    public void setFollowing(ArrayList<User> following) {
        this.following = following;
    }

    public void setPublications(ArrayList<Publication> publications) {
        this.publications = publications;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public void setReactions(ArrayList<Reaction> reactions) {
        this.reactions = reactions;
    }
    

    
    
}
