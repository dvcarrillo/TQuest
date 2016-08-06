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
