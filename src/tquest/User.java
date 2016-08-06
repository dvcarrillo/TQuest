/*
 * Copyright (C) 2016 david
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
