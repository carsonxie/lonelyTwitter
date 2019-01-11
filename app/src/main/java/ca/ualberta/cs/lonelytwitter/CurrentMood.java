//package ca.ualberta.cs.lonelytwitter;
import java.util.*;
import java.util.Date;

/*

Your new code should have examples of: classes, methods, attributes, access modifiers,

encapsulation, constructors, inheritance and abstract base classes.

 */

public class CurrentMood {

    int x = 2;
    String myStr = "this is a string attribute";

    public String mood1;
    private String mood2;

    private String date;

    public static void main(String[] args){

        Date date1 = new Date();
        System.out.println("happy");
        Date date = new Date();

        // display time and date using toString()
        System.out.println(date.toString());

    }

    public CurrentMood(){

        this.mood1 = "happy";
        this.mood2 = "sad";

    }

    public CurrentMood(String mood1, String mood2){

        this.mood1 = mood1;
        this.mood2 = mood2;
    }



    public void setdate(String date) {
        //this.x = x;
        this.date = date;
    }

    public String getdate(){
        return date;
    }
}
