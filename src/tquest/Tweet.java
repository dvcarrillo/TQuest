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
public class Tweet {
    
    private User user;          // The user that published the message
    private Message message;    // The message the tweet contains
    private String URL;         // The URL on Twitter of this tweet
    
    // CONSTRUCTOR
    public Tweet(User user, Message message, String URL) {
        this.user = user;
        this.message = message;
        this.URL = URL;
    }

    // SET METHODS
    public void setUser(User user) {
        this.user = user;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    // GET METHODS
    public User getUser() {
        return user;
    }

    public Message getMessage() {
        return message;
    }

    public String getURL() {
        return URL;
    }
    
    
    
}
