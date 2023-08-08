import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Abeja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Abeja extends Enemigos
{
    /**
     * Act - do whatever the Abeja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setRotation(90);
        mover(4);
        choque();
    }
    public void mover(int x){
        move(x);
        setRotation(-45);
        move(x);
        setRotation(-90);
        setLocation(getX(), getY() + x);
        /*if(Greenfoot.getRandomNumber(5) == 1){
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
            setRotation(-90);
            move(5);
        }*/
    }
    int x = 2;
    public void choque()
    {
        Actor disparo = getOneIntersectingObject(Disparo.class);
        Actor rana = getOneIntersectingObject(Rana.class);
        if(disparo != null){
            getWorld().removeObject(disparo);
            x--;
        }
        if(x == 0){
            World mundo = getWorld();
            MyWorld mimundo = (MyWorld) mundo;
            Punteo punteo = mimundo.tomarPunteo();
            punteo.sumar(3);
            Vida vida = mimundo.tomarVida();
            vida.subirVida();
            getWorld().removeObject(this);
        }
        
        else if(rana != null){
            World mundo = getWorld();
            MyWorld mimundo = (MyWorld) mundo;
            Vida vida = mimundo.tomarVida();
            vida.perderVida(2);
            getWorld().removeObject(this);
        }
        else if(isAtEdge()){
            getWorld().removeObject(this);
        }
        /*else if(getX() == 599 || getX() == 0 || getY() == 349 || getY() == 0){
            getWorld().removeObject(this);
        }*/
    }
}
