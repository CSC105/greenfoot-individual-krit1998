import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    public Start()
    {
    }
    public void act() 
    {
       if (Greenfoot.mouseClicked(this))
       {
           Greenfoot.setWorld(new MyWorld());
        }
    }    
}
