/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ft.epsi.mtp.i42.ws.rest;

import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Geoffroy
 */

@XmlRootElement(name = "booktrain")
public class BookTrain {
    
    private String bookNumber;
    private Train currentTrain;
    private int numberPlaces;
    
    public String getBookNumber(){
        return this.bookNumber;
    }
    
    public void setBookNumber(String bookNumber){
        this.bookNumber = bookNumber;
    }
    
    public Train getCurrentTrain(){
        return this.currentTrain;
    }
    
    public void setCurrentTrain(Train currentTrain){
        this.currentTrain = currentTrain;
    }
    
    public int getNumberPlaces(){
        return this.numberPlaces;
    }
    
    public void setNumberPlaces(int numberPlaces){
        this.numberPlaces = numberPlaces;
    }
}
