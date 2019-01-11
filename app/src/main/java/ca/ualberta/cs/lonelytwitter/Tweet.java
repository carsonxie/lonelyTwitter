//package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Tweet {

    public static String message = new String();



    public void Tweet(){

        message = "first tweet message";


    }

    public void setMessage(String tweetmessage){

        message = tweetmessage;
    }

    public String getMessage(){

        return message;
    }

    public static void main(String[] args){

        Date date1 = new Date();
        System.out.println(message);




    }



}
