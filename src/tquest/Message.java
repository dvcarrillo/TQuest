/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tquest;

/**
 *
 * @author davidvargascarrillo
 */
public class Message {
    
    private Tweet tweet;            // The tweet that this message belongs to
    private String message;         // The message itself
    
    // CONSTRUCTORS
    public Message(Tweet tweet, String message) {
        this.tweet = tweet;
        this.message = message;
    }
    
    // SET METHODS
    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    // GET METHODS
    public Tweet getTweet() {
        return tweet;
    }
    
    public String getMessage() {
        return message;
    }
    
}
