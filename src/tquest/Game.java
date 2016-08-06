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

import java.util.ArrayList;


/**
 *
 * @author david
 */

/**
 * Manages the main game
 * 
 * Singleton class
 */

public class Game {
    
    private Tweet selectedTweet;
    public ArrayList<Tweet> tweets = new ArrayList();
    
    private int round;
    
    /**************************************************************************/
    // Code for making this class a singleton
    
    private static final Game instance = new Game();
    
    // The private constructor ensures that this class will not be instanciable
    // from other classes
    private Game() { }
    
    public static Game getInstance() {
        return instance;
    }
    /**************************************************************************/
    
    
    
}
