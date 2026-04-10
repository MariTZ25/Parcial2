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
public class Video extends Publication{
    private int duration;
    private int resolution;
    private String filePath;

    public Video(int duration, int resolution, String filePath, int id, User author, LocalDate publicationDate, String descriptiveText, ArrayList<Reaction> reactions, ArrayList<Comment> comments) {
        super(id, author, publicationDate, descriptiveText, reactions, comments);
        this.duration = duration;
        this.resolution = resolution;
        this.filePath = filePath;
    }
    
    
    
}
