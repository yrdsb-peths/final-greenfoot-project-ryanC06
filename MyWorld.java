import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        creatCactus();
        creatDino();

    }
    public void creatCactus(){
        Cactus cactus = new Cactus();
        addObject(cactus,300,370);
        }
        
    public void creatDino(){
        Dino dino = new Dino();
        addObject(dino,200, 370);
    }
}
