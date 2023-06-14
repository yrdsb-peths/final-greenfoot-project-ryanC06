import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class endWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class endWorld extends World
{

    /**
     * Constructor for objects of class endWorld.
     * 
     */
    private int highScore = 0;
    Label highScoreLabel;
    public endWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage image = new GreenfootImage("resetButton.png");
    }
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            Greenfoot.setWorld(new MyWorld());
        }
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 100);
        Label restGame = new Label("Press <space> to Restart", 50);
        addObject(restGame, 300,250);
       
    }
    
    
}
