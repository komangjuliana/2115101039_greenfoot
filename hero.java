import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hero extends Actor
{
  
    public void act()
    {
       superHero();
    }
    
    public void superHero(){
         
        if (Greenfoot.isKeyDown("w"))
            setLocation(getX(),getY()-3);  
        if (Greenfoot.isKeyDown("s")) 
            setLocation(getX(),getY()+3);
                
            
        if (Greenfoot.isKeyDown("d")) 
            setLocation(getX()+3,getY());      
        if (Greenfoot.isKeyDown("a")) 
            setLocation(getX()-3,getY());
               
    }
}