import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoheteD2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoheteD2 extends FuegosArtificiales
{
    /**
     * Act - do whatever the CoheteD2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
    }
    public void mover()
    {
        setLocation(getX() + 1, getY() - 5);
        if(getY() <= 100)
        {
            setImage("Fuego1.png");
            Greenfoot.delay(1000);
            getWorld().removeObject(this);
        }
    }
}
