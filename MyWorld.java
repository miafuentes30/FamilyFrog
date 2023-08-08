import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Punteo punteo = new Punteo();
    Vida vida = new Vida();
    GreenfootSound musicaJuego = new GreenfootSound("musicaJuego.wav");
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(626, 369, 1); 
        prepare();
    }
    public void started()
    {
        musicaJuego.setVolume(50);
        musicaJuego.playLoop();
    }
    public void act()
    {
        agregarMosca();
        agregarHormiga();
        agregarAbeja();
        agregarSerpiente();
        musicaJuego.setVolume(50);
        musicaJuego.play();
    }
    public void agregarHormiga()
    {
        if(Greenfoot.getRandomNumber(5)<1)
        {
            int x = Greenfoot.getRandomNumber(300) - 100;
            if((x >= 150) && (x <= 175)){
                addObject(new Hormiga(), 0, x);
            }
        }
    }
    public void agregarMosca()
    {
        if(Greenfoot.getRandomNumber(300)<1)
        {
            addObject(new Mosca(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(150));
        }
    }
    public void agregarAbeja()
    {
        if(Greenfoot.getRandomNumber(800)<1)
        {
            addObject(new Abeja(), Greenfoot.getRandomNumber(600), 0);
        }
    }
    public void agregarSerpiente()
    {
        if(Greenfoot.getRandomNumber(1500)<1)
        {
            addObject(new Serpiente(), Greenfoot.getRandomNumber(600), 80);
        }
    }
    public void pausa()
    {
        if(Greenfoot.isKeyDown("esc"))
        {
            Greenfoot.stop();
        }
    }
    public Punteo tomarPunteo()
    {
        return punteo;
    }
    public Vida tomarVida()
    {
        return vida;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rana rana = new Rana();
        addObject(rana,73,309);
        addObject(punteo, 50,15);
        addObject(vida, 150, 15);
    }
    public void stopped()
    {
        if(musicaJuego.isPlaying())
        {
            musicaJuego.setVolume(0);
            musicaJuego.pause();
        }
    }
}
