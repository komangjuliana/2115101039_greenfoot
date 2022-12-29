import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dying here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dying extends Actor
{
    /**
     * Act - do whatever the Dying wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turn(3);
        dyingAnimation();
    }
    private int dyingTimer = 0;
    
    public void dyingAnimation(){
        if (dyingTimer==30){
            getWorld().removeObject(this);
        }else {
            dyingTimer++;
        }
}
}
