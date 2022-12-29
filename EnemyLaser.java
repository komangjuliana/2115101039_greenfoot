import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyLaser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyLaser extends Enemy
{
    public EnemyLaser()
    {
        super();
        this.speed = speed;
    }
    
    public int speed = 5;
    
    public void act()
    {
    super.act();
    move(speed);
    laserShoot();
    }
    
    int laserTimer = 0;
    public void laserShoot(){
        if (laserTimer == 30){
            getWorld().addObject (new LaserEnemy(), getX() -5, getY());
            laserTimer = 0;
        }else{
            laserTimer++;
        }
    }
}
