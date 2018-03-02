import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int a =0;
    public void act() 
    {
        move(0);

        if(a == 5)
        {
            RandomMove();
            a = 0;
        }
        a++;
        
    }
    public void RandomMove()
    {
     int rnd = Greenfoot.getRandomNumber(5);
        if(rnd == 1)
        {
            setLocation(getX()-10, getY());
        }
        else if(rnd == 2)
        {
            setLocation(getX()+10, getY());
        }
        else if(rnd == 3)
        {
            setLocation(getX(), getY()+10);
        }
        else if(rnd == 4)
        {
            setLocation(getX(), getY()-10);
        }   
    }
}
