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
public class ConnectUs {
    
    private ArrayList<User> users;
    private ArrayList<Publication> publications;


    public ConnectUs() {
    }
    
    public ConnectUs(ArrayList<User> users, ArrayList<Publication> publications) {
        this.users = users;
        this.publications = publications;
    }

    public ArrayList<User> getUser(String name) {
        
        for(User u: users){
            if(name==u.getUsername()){
                 return users;
            }
        }
        return null;
    }

    public ArrayList<Publication> getPublications() {
        return publications;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void setPublications(ArrayList<Publication> publications) {
        this.publications = publications;
    }
    
    
    public void addUser(User user){
        users.add(user);
        
    }
    
    public void busquedaPorIndex(int index){
        
        for (User u: users){
                return u(index);
        }
        
       
        
    }
    
    
    
    
}
