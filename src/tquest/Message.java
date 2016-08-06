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
