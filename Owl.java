import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * tHE OWL BECOMING SMARTER WITH MATH YAY
 * 
 * @author TINA, EDELIN, FIONA
 * @version MAY 2025
 */
public class Owl extends Actor
{
    GreenfootSound owlSound = new GreenfootSound("owlhooting.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[6];
    GreenfootImage[] idleLeft = new GreenfootImage[6];
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * constructor the code that gets run the first time when object created
     */
    public Owl()
    {
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/owlidle/idle" + i + ".png");
            idleRight[i].scale(100,100);
        }
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/owlidle/idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100,100);
        }
        
        animationTimer.mark();
        //intially facing right
        setImage(idleRight[0]);
    }
    
    /**
     * animate the owl
     */
    int imageIndex = 0;
    public void animateOwl()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length; 
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    /**
     * Act - do whatever the Owl wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-2);
            facing = "right";
        }
        else if(Greenfoot.isKeyDown("Right"))
        {
            move(2);
            facing ="left";
        }
        
        //check if its touchign any math books
        eat();
        // animate owl
        animateOwl();        
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
        world.increaseScore();
        owlSound.play();
       }
    }
}
