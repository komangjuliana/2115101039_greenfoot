import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Widi) 
 * @version (a version number or a date)
 */
public class RobotWorld extends World
{
    int currentMaxTurnSpeed = 2;
    int currentLevel = 1;
    
    public RobotWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Robot(),48,50);
        
        addObject(new Block(2), 427, 145);    
        
        addObject(new Wall(), 52, 147);
        addObject(new Wall(), 159, 147);
        addObject(new Wall(), 266, 147);
        addObject(new Wall(), 587, 147);
        addObject(new Wall(), 692, 147);
        addObject(new Wall(), 791, 147);
        
        addObject(new Home(), 751, 552);
        
        addObject(new ScorePanel(), 71, 554);
        
        
        addObject(new Pizza(), 720, 46);
        addObject(new Pizza(), 433, 38);
        addObject(new Pizza(), 183, 302);
        addObject(new Pizza(), 682, 312);
        addObject(new Pizza(), 417, 537);
    }
    
    public void setUpLevel(){
        
        if(currentLevel==2){
            currentMaxTurnSpeed++;
            new Block(currentMaxTurnSpeed);
            for(int i=0; i<5; i++){
                int xCoord = Greenfoot.getRandomNumber(this.getWidth()-1);
                int yCoord = Greenfoot.getRandomNumber(this.getHeight()-1);
                addObject(new Pizza(), xCoord, yCoord);
            }
        } else if(currentLevel==3){
            currentMaxTurnSpeed++;
            new Block(currentMaxTurnSpeed);
            for(int i=0; i<5; i++){
                int xCoord = Greenfoot.getRandomNumber(this.getWidth()-1);
                int yCoord = Greenfoot.getRandomNumber(this.getHeight()-1);
                addObject(new Pizza(), xCoord, yCoord);
            }
        }
    }
    
    public void increaseLevel(){
        currentLevel++;
        setUpLevel();
    }
}
