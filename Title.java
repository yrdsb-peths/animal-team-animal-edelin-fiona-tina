import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * Edelin, Tina, Fiona 
 * @version May 2026
 */
public class Title extends World
{
    Label titleLabel = new Label("Learning Owl", 60);
    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 270, 150);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        // Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Owl owl = new Owl();
        addObject(owl,491,149);
        owl.setLocation(502,137);
        owl.setLocation(497,124);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label,266,275);
        label.setLocation(368,278);
        label.setLocation(294,260);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2,256,315);
        owl.setLocation(502,142);
        owl.setLocation(505,133);
        label.setLocation(379,223);
        label.setLocation(294,225);
        label2.setLocation(337,288);
        label2.setLocation(300,288);
    }
}
