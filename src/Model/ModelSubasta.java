/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import java.util.Timer;

/**
 *
 * @author gabri
 */
public class ModelSubasta {
    private final String description;
    private List<String> pictureList;
    private int currentPrice;
    private int pujasCounter;
    private Timer remainingTime;

    public ModelSubasta(String description, List<String> pictureList, int currentPrice, int pujasCounter, Timer remainingTime) {
        this.description = description;
        this.pictureList = pictureList;
        this.currentPrice = currentPrice;
        this.pujasCounter = pujasCounter;
        this.remainingTime = remainingTime;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getPictureList() {
        return pictureList;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public int getPujasCounter() {
        return pujasCounter;
    }

    public Timer getRemainingTime() {
        return remainingTime;
    }
    
}
