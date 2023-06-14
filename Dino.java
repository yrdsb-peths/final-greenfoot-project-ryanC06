import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dino extends Actor 
    {
    
    GreenfootImage[]idle = new GreenfootImage[5];
    public Dino(){
       for(int i = 0 ; i <5; i++){
           idle[i] = new GreenfootImage("idle"+ i + ".png");
           idle[i].scale(80,80);
       }
       setImage(idle[0]);
    }
    int imageIndex = 0 ;
    public void animateDino(){
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
    private int ySpeed;
    public void act(){
        MyWorld world = (MyWorld) getWorld();
        world.increaseScore();
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == groundLevel);  
        if (!onGround) 
        {
            ySpeed++; //gravity 
            setLocation(getX(), getY()+ySpeed); 
            if (getY()>=groundLevel) 
            {
                setLocation(getX(), groundLevel); 
                Greenfoot.getKey(); 
            }
        }else{
            if ("space".equals(Greenfoot.getKey())) 
            {
                ySpeed = -25; // add jump speed
                setLocation(getX(), getY()+ySpeed);
            }
        }
        if (isTouching(Cactus.class)){
            //MyWorld world = (MyWorld) getWorld();
            world.gameOver();
            //world.bestScore();
          }
          
        animateDino();
     
    }

}

