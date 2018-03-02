import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reset extends Actor
{
    public Reset()
    {
        GreenfootImage image = getImage();
        image.scale(100,40);
    }
    public void act() 
    {
       if(Greenfoot.mouseClicked(this))
    {
       Greenfoot.setWorld(new MyWorld());
    }  
} 
}
