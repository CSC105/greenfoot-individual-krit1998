import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends Actor
{
    public Home()
    {
        GreenfootImage image = getImage();
        image.scale(200,50);
    }
    public void act() 
    {
       if(Greenfoot.mouseClicked(this))
    {
       Greenfoot.setWorld(new Tilte());
    }  
} 
}
