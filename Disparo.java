import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends Actor
{
    /**
     * Act - do whatever the Disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
        borrar();
    }
    public void mover()
    {
        setLocation(getX(), getY() - 5);
    }

    public void borrar()
    {
        if(getY() == 0){
            getWorld().removeObject(this);
        }
    }
}
