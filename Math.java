import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Math books for the owl to get smarter YAY * 
 * Tina, Edelin, fiona
 * @version may 2026
 */
public class Math extends Actor
{
    /**
     * Act - do whatever the Math wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Math()
    {
        GreenfootImage image = getImage();
        image.scale(50, 50);
        setImage("mathbook.jpg");
    }
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + 1);
        
        // Remove book and draw game over when book gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
