import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int vida = 20;
    int barraAncho = 80;
    int barraAlto = 10;
    int vidaPuntos = (int)barraAncho/vida;
    public Vida()
    {
        barra();
    }
    public void act()
    {
        barra();
        perder();
    }
    public void barra()
    {
        setImage(new GreenfootImage(barraAncho + 2, barraAlto + 2));
        GreenfootImage imagen = getImage();
        imagen.setColor(Color.BLACK);
        imagen.drawRect(0, 0, barraAncho + 1, barraAlto + 1);
        imagen.setColor(Color.RED);
        imagen.fillRect(1, 1, vida * vidaPuntos, barraAlto);
    }
    public void perderVida(int x)
    {
        vida = vida - x;
    }
    public void subirVida()
    {
        if(vida <20){
            vida++;
        }
    }
    public void perder()
    {
        if(vida <= 0)
        {
            getWorld().addObject(new GameOver(), 313, 369 / 2);
            Greenfoot.stop();
        }
    }
}
