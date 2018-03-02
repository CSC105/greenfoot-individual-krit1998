import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tilte here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tilte extends World
{

    /**
     * Constructor for objects of class Tilte.
     * 
     */
    public Tilte()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,290,528);
        start.setLocation(290,513);
        start.setLocation(903,272);
        start.setLocation(287,513);
        How how = new How();
        addObject(how,882,513);
        how.setLocation(906,514);
        how.setLocation(927,499);
    }
}
