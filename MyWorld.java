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
    int level = 1;
    public MyWorld() {
        super(600, 400, 1, false);
        setBackground("forest.jpg");
        //Create the owl object
        Owl owl = new Owl();
        addObject(owl, 300, 200);
        
        //Create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createMath();
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    /**
     * create new math for our owl to get smarter YAY at the top
     */
    public void createMath()
    {
        Math math = new Math();
        math.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(math, x, y);
    }
}
