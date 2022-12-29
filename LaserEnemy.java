import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LaserEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserEnemy extends Actor
{
    /**
     * Act - do whatever the LaserEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move (3);
        setRotation(180);
        laserHit();
    }
    public void laserHit(){
        if (isTouching(Hero.class)){
            getWorld().addObject(new Dying(), getX(), getY());
            getWorld().addObject(new Hero(), (200), (200));
            removeTouching(Hero.class);
            getWorld().removeObject(this);
        } else if(isAtEdge())
            getWorld().removeObject(this);
    }
}
