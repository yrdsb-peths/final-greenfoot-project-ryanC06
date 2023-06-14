import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int Score = 0; 
    //private int highScore = 0;
    Label scoreLabel;
    //Label highScoreLabel;
    int level = 1;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);         
        creatCactus();
        creatDino();
        //creatCloud();
        
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 500 , 50);
        
        
    }
    
    public void creatCactus(){
        Cactus cactus = new Cactus();
        addObject(cactus,590,370);
        }
        
    public void creatDino(){
        Dino dino = new Dino();
        addObject(dino,150, 350);
    }
    
    
    
       public void gameOver(){
        Greenfoot.setWorld(new endWorld());
        //bestScore();
        
        
    }
    public void increaseScore(){
        
        Score++;
        scoreLabel.setValue(Score);
         if(Score % 500 == 0){
            level += 1;
        }
    }

}
