import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Actor
{
    int rightScreen;
    int bottomScreen;
    
    public void addedToWorld(World MyWorld)
    {
        rightScreen = MyWorld.getWidth() -1;
        bottomScreen = MyWorld.getHeight() -1;
    }
    public void act() 
    {
        move(2);
        if(Greenfoot.getRandomNumber(20)==1)
        {
        setRotation(Greenfoot.getRandomNumber(360));
    }
        int x = getX();
        int y = getY();
        
        if(x <= 0 || y <= 0 || x >= rightScreen || y >= bottomScreen)
        {
            turn(180);
        }
    }    
}
