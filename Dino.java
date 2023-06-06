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
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == groundLevel);  
        if (!onGround) // in middle of jump
        {
            ySpeed++; // adds gravity effect
            setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)
            if (getY()>=groundLevel) // has landed (reached ground level)
            {
                setLocation(getX(), groundLevel); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
            }
        }else{
            if ("space".equals(Greenfoot.getKey())) // jump key detected
            {
                ySpeed = -23; // add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
            }
        }
        if (isTouching(Cactus.class)){
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
          }
          
        animateDino();
     
    }

}

