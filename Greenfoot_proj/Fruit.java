import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fruit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruit extends Actor
{
    public Fruit(){
        GreenfootImage image = getImage();
        getImage().scale(40,40);
    }
    public void act() 
    {
       hitMainCha(); 
    }
    
    public void hitMainCha()
    {
        Actor MainCha = getOneIntersectingObject(MainCha.class);
        if(MainCha != null)
        {
           World myWorld = getWorld();
           MyWorld world = (MyWorld)myWorld;
           Counter counter = world.getCounter();
           counter.addScore();
           myWorld.removeObject(this);
        }
    
    }
}
