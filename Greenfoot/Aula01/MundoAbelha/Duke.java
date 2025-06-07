import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duke here.
 * 
 * Dec0Dex
 * 2025-06-06
 */
public class Duke extends Actor
{
    /**
     * Act - do whatever the Duke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("ouch.wav");
        }
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse!=null && mouse.getButton()==3){
            setLocation(mouse.getX(),mouse.getY());
    
    }
}
}
