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
        //creatCloud();
        

    }
    public void creatCactus(){
        Cactus cactus = new Cactus();
        addObject(cactus,590,370);
        }
        
    public void creatDino(){
        Dino dino = new Dino();
        addObject(dino,150, 350);
    }
    
    public void creatCloud(){
        Cloud cloud = new Cloud();
        addObject(cloud, 590,50);
    }
    
       public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        Greenfoot.stop();
    }
}
