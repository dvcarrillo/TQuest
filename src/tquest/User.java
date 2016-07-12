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
public class User {
    
    private Tweet tweet;        // The tweet that this user belongsto
    
    private String name;        // The name set on the user that posts a tweet
    private String user;        // The username of the user that posts a tweet
    
    // CONSTRUCTOR
    public User(Tweet tweet, String name, String user) {
        this.name = name;
        this.user = user;
    }
    
    // SET METHODS
    public void setName(String name) {
        this.name = name;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
    
    public void setTweet(Tweet tweet) {
        this.tweet = tweet;
    }
    
    // GET METHODS
    public String getName() {
        return name;
    }
    
    public Tweet getTweet() {
        return tweet;
    }
    
    public String getUser() {
        return user;
    }
    
}
