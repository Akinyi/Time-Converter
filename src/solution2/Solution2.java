/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution2;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author ägare
 */
public class Solution2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int T = 7500;
      // int result = (new Solution2()).hourconverter(T);
       String time = (new Solution2()).timeConverter(T);
      //System.out.println("Hour: " + result);
      System.out.println("Time" + time);
    }
    public static Integer hourconverter(int T){
        int hour= 0; int sec;
        sec = T%3600;
        hour = T /3600;
        return hour;
    }
    
     public static String timeConverter(int T){
        int sec;int min = 0;int hour =0; String time ="";
        if(T >= 3600)
           hour = T /3600;  
        sec = T%3600;
        if(sec >=60) min = sec/ 60;
        sec = sec - min*60;
        return time + hour + "Hour " + min + "Minutes" +  sec + "Sec";
    }
}
