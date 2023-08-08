import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mosca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mosca extends Comida
{
    /**
     * Act - do whatever the Mosca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mover();
        choque();
    }
    public void mover()
    {
        if(Greenfoot.getRandomNumber(5) == 1){
            setLocation(getX() + 10, getY() + 5);
        }
        else if(Greenfoot.getRandomNumber(5) == 2){
            setLocation(getX() + 5, getY() - 5);
        }
        else if(Greenfoot.getRandomNumber(5) == 3){
            setLocation(getX() - 5, getY() + 5);
        }
        else if(Greenfoot.getRandomNumber(5) == 4){
            setLocation(getX() - 5, getY() - 5);
        }
        else if(Greenfoot.getRandomNumber(5) == 5){
            setLocation(getX() + 2, getY() - 8);
        }
    }
    public void choque()
    {
        int huidos = 10;
        Actor disparo = getOneIntersectingObject(Disparo.class);
        if(disparo != null){
            getWorld().removeObject(disparo);
            World mundo = getWorld();
            MyWorld mimundo = (MyWorld) mundo;
            Punteo punteo = mimundo.tomarPunteo();
            punteo.sumar(2);
            getWorld().removeObject(this);
        }
        else if(isAtEdge()){
            World mundo = getWorld();
            MyWorld mimundo = (MyWorld) mundo;
            Vida vida = mimundo.tomarVida();
            vida.perderVida(1);
            getWorld().removeObject(this);
            huidos--;
        }
        /*if(huidos == 0)
            {
                World mundo = getWorld();
                MyWorld mimundo = (MyWorld) mundo;
                Vida vida = mimundo.tomarVida();
                vida.perderVida();
                huidos = 10;
            }*/
    }
    
}
