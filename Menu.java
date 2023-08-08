import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    GreenfootSound musicaMenu = new GreenfootSound("musicaMenu.wav");
    Puntero puntero = new Puntero();
    int opcion = 0;
    public Menu()
    {    
        super(626, 369, 1); 
        prepare();
    }

    public void started()
    {
        musicaMenu.setVolume(50);
        musicaMenu.playLoop();
    }

    public void act(){
        started();
        mover();
    }

    private void prepare()
    {
        addObject(puntero, 265, 100);
    }
    boolean tecla = true;
    private void mover()
    {
        /*if(Greenfoot.isKeyDown("down")  && tecla && opcion != 3){
        opcion++;
        //opcion--;
        tecla = false;
        }
        else if(!Greenfoot.isKeyDown("down")){
        tecla = true;
        }
        if(Greenfoot.isKeyDown("up") && tecla && opcion != 0){
        opcion--;
        //opcion++;
        tecla = false;
        }
        else if(!Greenfoot.isKeyDown("up")){
        tecla = true;
        }

        if(opcion < 0){
        opcion = 3;
        }
        if(opcion > 3){
        opcion = 0;
        }*/
        if(Greenfoot.isKeyDown("up") && opcion != 0 && tecla) { 
            opcion--; 
            tecla = false; 
        }

        if(Greenfoot.isKeyDown("down") && opcion != 3 && tecla){ 
            opcion++; 
            tecla = false; 
        }
        if(!Greenfoot.isKeyDown("down") && !Greenfoot.isKeyDown("up")){
            tecla = true;    
        }
        if(opcion >= 4) opcion = 0;
        if(opcion < 0) opcion = 3;
        int y = 100 + (opcion * 28);
        puntero.setLocation(265, y);
        if(Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("enter")){
            /*if(musicaMenu.isPlaying())
            {
            musicaMenu.pause();
            }*/
            if(opcion == 0){
                //musicaMenu.setVolume(0);
                //musicaMenu.pause();
                stopped();
                Greenfoot.setWorld(new MyWorld());
            }
            else if(opcion == 1){
                stopped();
                Greenfoot.setWorld(new Controles());
                /*Puntero puntero = new Puntero();
                //GreenfootImage controles = new GreenfootImage("Controles.png");
                Actor control = new Control();
                addObject(puntero,535,18);
                addObject(control,313,184);
                //getBackground().drawImage(controles,313,184);
                puntero.setLocation(536,19);
                if(Greenfoot.isKeyDown("esc") || Greenfoot.isKeyDown("space") || Greenfoot.isKeyDown("enter"))
                {
                //removeObject(control);
                //removeObject(puntero);
                }*/
            }
            else if(opcion == 2){
                stopped();
                Greenfoot.setWorld(new Acerca());
            }
            else if(opcion == 3){
                stopped();
                Greenfoot.stop();
            }
        }
    }

    public void stopped()
    {
        if(musicaMenu.isPlaying())
        {
            musicaMenu.setVolume(0);
            musicaMenu.pause();
        }
    }
}
