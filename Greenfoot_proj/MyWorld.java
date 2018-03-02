import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
   int x = Greenfoot.getRandomNumber(1150);
   int y = Greenfoot.getRandomNumber(600);
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1150, 600, 1); 

        prepare();
        getCounter();
    }
    
    public void act()
    {
        int numberOfFruit = getObjects(Fruit.class).size();
        if(numberOfFruit == 0)
        {
           showText("You Win", getWidth()/2, getHeight()/2);
           Greenfoot.delay(10);
        }
    }
    
    public Counter getCounter()
    {
        return counter;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(counter, 100,40);
        MainCha maincha = new MainCha();
        addObject(maincha,665,256);
        maincha.setLocation(548,285);
        Enemy2[] enemy2 = new Enemy2[5];
        for(int i=0;i < enemy2.length;i++){
            enemy2[i] = new Enemy2();
            int enemy2X = Greenfoot.getRandomNumber(getWidth());
            int enemy2Y = Greenfoot.getRandomNumber(getHeight());
            addObject(enemy2[i], enemy2X, enemy2Y);
        }
       /* Enemy2 enemy22 = new Enemy2();
        addObject(enemy22,217,146);
        Enemy2 enemy23 = new Enemy2();
        addObject(enemy23,282,484);
        Enemy2 enemy24 = new Enemy2();
        addObject(enemy24,818,506);
        Enemy2 enemy25 = new Enemy2();
        addObject(enemy25,524,104);*/
        Fruit[] fruit = new Fruit[5];
        for(int i=0;i < fruit.length;i++){
            fruit[i] = new Fruit();
            int fruitX = Greenfoot.getRandomNumber(getWidth());
            int fruitY = Greenfoot.getRandomNumber(getHeight());
            addObject(fruit[i], fruitX, fruitY);
        }
        /*Fruit fruit2 = new Fruit();
        addObject(fruit2,x,y);
        Fruit fruit3 = new Fruit();
        addObject(fruit3,80,552);
        Fruit fruit4 = new Fruit();
        addObject(fruit4,1084,352);
        Fruit fruit5 = new Fruit();
        addObject(fruit5,86,331);*/
        Reset reset = new Reset();
        addObject(reset,231,41);
        reset.setLocation(1061,46);
        reset.setLocation(204,43);
        Home home = new Home();
        addObject(home, 354, 45);
    }
}
