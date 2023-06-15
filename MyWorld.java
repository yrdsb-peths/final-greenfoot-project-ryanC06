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
    Label scoreLabel;
    int level = 1;
    Label levelLabel;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);         
        creatCactus();
        creatDino();
        
        
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 500 , 50);
        
        levelLabel = new Label(0, 50);
        addObject(levelLabel, 100 , 50);
        levelLabel.setValue(level);
        Label levelTitle = new Label("lvl", 50);
        addObject(levelTitle, 55, 50);
        
        
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
        
        
        
    }
    public void increaseScore(){
        
        Score++;
        scoreLabel.setValue(Score);
         if(Score % 500 == 0){
            level += 1;
            levelLabel.setValue(level);
        }
        
    }

}
