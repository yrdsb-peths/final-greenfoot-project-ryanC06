import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Actor
{
    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image = new GreenfootImage("cloud7.jpg");
    public Cloud(){
       image.scale(100,100);
       setImage(image);
    }
    public void act()
    {
        move(-5);
        if(atWorldEdge())
        {
            MyWorld world = (MyWorld) getWorld();
            world.creatCloud();
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
}
