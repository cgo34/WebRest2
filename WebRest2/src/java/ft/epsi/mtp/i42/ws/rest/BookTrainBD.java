/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ft.epsi.mtp.i42.ws.rest;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geoffroy
 */
public class BookTrainBD {
    
    private static List<Train> trains = new ArrayList<Train>();
    private static List<BookTrain> bookTrains = new ArrayList<BookTrain>();
    
    static {
        trains.add(new Train("TR123", "Poitiers", "Paris", 1250));
        trains.add(new Train("TR127", "Poitiers", "Paris", 1420));
        trains.add(new Train("TR129", "Poitiers", "Paris", 1710));
    }
    
    public static List<Train> getTrains(){
        return trains;
    }
    
    public static List<BookTrain> getBookTrains(){
        return bookTrains;
    }
    
}
