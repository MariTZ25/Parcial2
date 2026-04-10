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
public class Image extends Publication {
    private int resolution;
    private String filePath;

    public Image(int resolution, String filePath, int id, User author, LocalDate publicationDate, String descriptiveText, ArrayList<Reaction> reactions, ArrayList<Comment> comments) {
        super(id, author, publicationDate, descriptiveText, reactions, comments);
        this.resolution = resolution;
        this.filePath = filePath;
    }

    

    public int getResolution() {
        return resolution;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
    @Override
        public void postImage(){
        
    }
    
    
}
