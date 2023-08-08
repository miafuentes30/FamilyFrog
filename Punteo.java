import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Punteo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punteo extends Actor
{
    /**
     * Act - do whatever the Punteo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int puntos = 0;
    public Punteo(){
        setImage(new GreenfootImage("Puntos: " + puntos, 25, Color.BLACK, Color.WHITE));
    }
    public void act()
    {
        setImage(new GreenfootImage("Puntos: " + puntos, 25, Color.BLACK, Color.WHITE));
        if(puntos >= 5)
        {
            Greenfoot.setWorld(new Ganaste());
            //getWorld().addObject(new Control(), 0,0);
        }
    }
    public void sumar(int z)
    {
        puntos = puntos + z;
    }
    
}
