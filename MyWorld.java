import greenfoot.*;
/**
 * The world where the owl gets smarter and better
 * 
 * Edelin, Tina, Fiona
 * May 2025
 */

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Owl owl = new Owl();
        addObject(owl, 300, 200);
        
        Math math = new Math();
        addObject(math, 300, 0);
    }
}
