import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rana extends Actor
{
    /**
     * Act - do whatever the Rana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
        disparo();
    }
    public void mover()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + 5, getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - 5, getY());
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 5);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 5);
        }
        if(getY() <= 280)
        {
            setLocation(getX(), getY() + 5);
        }
    }
    boolean disparar = true;
    public void disparo(){
        if(Greenfoot.isKeyDown("space") && disparar == true){
            getWorld().addObject(new Disparo(), getX() + 18, getY() - 26);
            disparar = false;
        }
        else if(!Greenfoot.isKeyDown("space")){
            disparar = true;
        }
    }
}
