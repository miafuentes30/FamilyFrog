import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Acerca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Acerca extends World
{

    /**
     * Constructor for objects of class Acerca.
     * 
     */
    GreenfootSound musicaAcerca = new GreenfootSound("musicaMenu.wav");
    public Acerca()
    {    
        super(626, 369, 1);  
        prepare();
    }
    public void started()
    {
        musicaAcerca.setVolume(50);
        musicaAcerca.playLoop();
    }
    public void act()
    {
        started();
        if(Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("enter"))
        {
            stopped();
            Greenfoot.setWorld(new Menu()); 
        }
    }
    private void prepare()
    {
        Puntero puntero = new Puntero();
        addObject(puntero,535,18);
        puntero.setLocation(536,19);
    }
    public void stopped()
    {
        if(musicaAcerca.isPlaying())
        {
            musicaAcerca.setVolume(0);
            musicaAcerca.pause();
        }
    }
}
