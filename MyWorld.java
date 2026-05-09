import greenfoot.*;
/**
 * The world where the owl gets smarter and better
 * 
 * Edelin, Tina, Fiona
 * May 2025
 */

public class MyWorld extends World {
    public int score = 0;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1);
        
        //Create the owl object
        Owl owl = new Owl();
        addObject(owl, 300, 200);
        
        //Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createMath();
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    /**
     * create new math for our owl to get smarter YAY at the top
     */
    public void createMath()
    {
        Math math = new Math();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(math, x, y);
    }
}
