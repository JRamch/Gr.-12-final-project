/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramcj7742
 */
public class Fahad {
    private int roomNum;
    private int difficulty;
    private long startTime;
    
    public Fahad(){
        roomNum = 0;
    }
    
    public void startTime(long time){
        this.startTime = time;
    }
    
    public int getRoom(){
        return this.roomNum;
    }
}
