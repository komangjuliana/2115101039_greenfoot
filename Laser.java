import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    private int timer = 10;
    public void act()
    {
        move (5);
        laserHit();
    }
    public void laserHit(){
        if (isTouching(Enemy.class)){
            getWorld().addObject(new Dying(), getX(), getY());
            removeTouching(Enemy.class);
            getWorld().removeObject(this);
        } else if(isAtEdge())
            getWorld().removeObject(this);
}
}
