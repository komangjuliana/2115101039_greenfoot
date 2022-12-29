import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Block here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block extends Actor
{
    int turnspeed;
    
    public void act()
    {
        turn(turnspeed);
    }
    
    public Block(int maxturnspeed){
        turnspeed = (Greenfoot.getRandomNumber(maxturnspeed) + -maxturnspeed);
        if(turnspeed==0){
            turnspeed = 1;
        }
    }
}
