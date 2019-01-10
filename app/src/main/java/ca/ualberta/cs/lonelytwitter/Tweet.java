package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Tweet {

    String message;
    int h;
    int w;
    int wings;

    Date date;

    public void Tweet(){

        message = "";
        date = null;
    }

    public void setMessage(String tweetmessage){

        message = tweetmessage;
    }

    public String getMessage(){

        return message;
    }











    public void Animal(){

        this.name = "default";  //arrtibute method
        h = 0;
        w = 0;
        wings = 0;

    }



}
