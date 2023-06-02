import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dino here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dino extends Actor 
    {
    GreenfootImage image = new GreenfootImage("dinoGreen1.gif");
    public Dino(){
       image.scale(90,90);
       setImage(image);
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
                ySpeed = -15; // add jump speed
                setLocation(getX(), getY()+ySpeed); // leave ground
            }
        }
    }
}

