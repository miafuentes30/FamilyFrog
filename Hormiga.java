import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hormiga here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hormiga extends Comida
{
    /**
     * Act - do whatever the Hormiga wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();         
    }
    public void mover()
    {
        if(Greenfoot.getRandomNumber(10) == 0){
            setLocation(getX() + 5, getY() + 5);
        }
        else if(Greenfoot.getRandomNumber(10) == 1){
            setLocation(getX() + 5, getY() - 5);
        }
        if(getY() <= 150){
            setLocation(getX(), getY() + 5);
        }
        if(getY() >= 175){
            setLocation(getX(), getY() - 5);
        }
        Actor disparo = getOneIntersectingObject(Disparo.class);
        if(disparo != null){
            getWorld().removeObject(disparo);
            World mundo = getWorld();
            MyWorld mimundo = (MyWorld) mundo;
            Punteo punteo = mimundo.tomarPunteo();
            punteo.sumar(1);
            getWorld().removeObject(this);
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
