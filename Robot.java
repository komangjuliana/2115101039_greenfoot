import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Actor
{
    private GreenfootImage robotimage1;
    private GreenfootImage robotimage2;
    private GreenfootImage gameoverimage;
    private int lives;
    private int pizzaEaten;
    private int score;
    
    public Robot(){
        robotimage1= new GreenfootImage("man01.png");
        robotimage2= new GreenfootImage("man02.png");
        gameoverimage= new GreenfootImage("gameover.png");
        lives = 3;
        pizzaEaten = 0;
        score = 0;
    }
    
    public void act()
    {
        robotMovement();
        detectWallCollision();
        detectBlockCollision();
        detectHome();
        eatPizza();
    }
    
    public void robotMovement(){
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+3, getY());
            animate();
        }
        
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-3, getY());
            animate();
        }
        
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+3);
            animate();
        }
        
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-3);
            animate();
        }
    }
    
    public void detectWallCollision(){
        if(isTouching(Wall.class)){
            setLocation(48, 50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    
    public void detectBlockCollision(){
        if(isTouching(Block.class)){
            setLocation(48, 50);
            Greenfoot.playSound("hurt.wav");
            removeLife();
        }
    }
    
    public void detectHome(){
        if(isTouching(Home.class)){
            setLocation(48, 50);
            Greenfoot.playSound("yipee.wav");
            if(pizzaEaten==5){
                Greenfoot.stop();
                pizzaEaten = 0;
            }
            increaseScore();
        }
    }
    
    public void eatPizza(){
        if(isTouching(Pizza.class)){
            removeTouching(Pizza.class);
            Greenfoot.playSound("eat.wav");
            pizzaEaten++;
        }
    }
    
    public void animate(){
        if(getImage()==robotimage1){
            setImage(robotimage2);
        } else
            setImage(robotimage1);
    }
    
    public void removeLife(){
        lives--;
        showStatus();
        testEndGame();
    }
    
    public void testEndGame(){
        if(lives<=0){
            setImage(gameoverimage);
            Greenfoot.stop();
        }
    }
    
    public void increaseScore(){
       score++;
       showStatus();
    }
    
    public void showStatus(){
        getWorld().showText("Score : " + score, 70, 540);
        getWorld().showText("Lives : " + lives, 70, 570);
    }
}
