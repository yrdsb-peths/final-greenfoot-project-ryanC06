import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus extends Actor
{
     int speed = -4;
    GreenfootImage image = new GreenfootImage("cactus1.png");
    public Cactus(){
       image.scale(70,70);
       setImage(image);
    }
    public void act()
    {
        move(speed); //-5
        if(atWorldEdge())
        {
            MyWorld world = (MyWorld) getWorld();
            world.creatCactus();
            getWorld().removeObject(this);
            
        }

    }
    public boolean atWorldEdge()
    {
        if(getX() < 10 || getX() > getWorld().getWidth()-10)
        {
            return true;
        }
        if(getX() < 10 || getY() > getWorld().getHeight()-10)
        {
           return true;
        }
        if(getX() < 10 || getY() < 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void setSpeed(int spd){
        speed=spd;
    }
}
