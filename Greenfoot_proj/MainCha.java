import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class maincha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCha extends Actor
{
    GreenfootImage[] images = new GreenfootImage[36];
    int ImgNum = 0;
    
    public MainCha()
    {
        GreenfootImage image = getImage();
        for(int i = 0; i < images.length; i++) {
        images[i] = new GreenfootImage( "Flamingo" + i + ".png" );
        images[i].scale(60,60);
    
    }
        setImage( images[ImgNum] );
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("left"))
        {
            animation();
         setLocation(getX()-4, getY());
    }    
        if(Greenfoot.isKeyDown("right"))
        {
            animation();
          setLocation(getX()+4, getY());
    }
        if(Greenfoot.isKeyDown("up"))
        {
            animation();
          setLocation(getX(), getY()-4);
    }
        if(Greenfoot.isKeyDown("down"))
        {
            animation();
          setLocation(getX(), getY()+4);
    }
    hitEnemy2();
}
    public void animation(){
        ImgNum = (ImgNum + 1)%images.length;
        setImage(images[ImgNum]);
    }
    public void animation2(){
        ImgNum = (ImgNum + 1)%images.length;
        setImage(images[ImgNum]);
    }
    public void hitEnemy2()
    {
        Actor Enemy2 = getOneIntersectingObject(Enemy2.class);
        if(Enemy2 != null)
        {
            World MyWorld = getWorld();
            GameOver gameover = new GameOver();
            MyWorld.addObject(gameover, MyWorld.getWidth()/2 , MyWorld.getHeight()/2);
            MyWorld.removeObject(this);
        }
    }
}
