package ca.ualberta.cs.lonelytwitter;
import java.util.*;


/*

Your new code should have examples of: classes, methods, attributes, access modifiers,

encapsulation, constructors, inheritance and abstract base classes.

 */

public abstract class CurrentMood {

    int x = 2;
    String myStr = "this is a string attribute";

    String mood1;
    String mood2;

    public static void main(String[] args){

        Date date1 = new Date();
        System.out.println("Hello World");

    }

    public CurrentMood(){

        this.mood1 = "happy";
        this.mood2 = "sad";

    }

    public CurrentMood(String mood1, String mood2){

        this.mood1 = mood1;
        this.mood2 = mood2;
    }



}
