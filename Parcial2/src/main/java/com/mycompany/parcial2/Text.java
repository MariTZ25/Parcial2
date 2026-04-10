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
public class Text extends Publication {

    public Text(int id, User author, LocalDate publicationDate, String descriptiveText, ArrayList<Reaction> reactions, ArrayList<Comment> comments) {
        super(id, author, publicationDate, descriptiveText, reactions, comments);
    }
    
    
}
