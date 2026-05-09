import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * tHE OWL BECOMING SMARTER WITH MATH YAY
 * 
 * @author TINA, EDELIN, FIONA
 * @version MAY 2025
 */
public class Owl extends Actor
{
    /**
     * Act - do whatever the Owl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Owl()
    {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("Right"))
        {
            move(1);
        }
        
        //check if its touchign any math books
        eat();
    }
    
    /**
     * Eat the math book and spawns a new book if book is eaten
     */
    public void eat()
    {
       if(isTouching(Math.class))
       {
        removeTouching(Math.class); 
        MyWorld world = (MyWorld) getWorld();
        world.createMath();
       }
    }
}
