import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Serpiente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Serpiente extends Enemigos
{
    /**
     * Act - do whatever the Serpiente wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
    }
    int x = 0;
    boolean si = true;
    public void mover()
    {
        Actor rana = getOneIntersectingObject(Rana.class);
        if(si == true){
            move(4);
            turn(Greenfoot.getRandomNumber(40)-20);
            if(getY() >= 175){
                setRotation(0);
                setLocation(getX(),getY() - 5);
            }
            if(getY() <= 75){
                setRotation(0);
                setLocation(getX(),getY() + 5);
            }
            Actor disparo = getOneIntersectingObject(Disparo.class);
            if(disparo != null){
                getWorld().removeObject(disparo);
                
                si = false;
            }
            /*else if(isAtEdge()){
                getWorld().removeObject(this);
            }*/
        }
        if(si == false){
        setRotation(90);
        move(5);
        }
        if(rana != null){
            World mundo = getWorld();
            MyWorld mimundo = (MyWorld) mundo;
            Vida vida = mimundo.tomarVida();
            vida.perderVida(4);
            getWorld().removeObject(this);
        }
        else if(isAtEdge()){
                getWorld().removeObject(this);
            }
    }
}
