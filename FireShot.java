import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireShot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireShot extends Actor
{
    /**
     * Act - do whatever the FireShot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int tiro;
    
    public FireShot(){
        Greenfoot.playSound("Laser.wav");
        
        }
           
    
    public void act() 
    {          
        
        
        move(5); 
        
        hitEnemy();
              
        
    }
    private void detectarColisao(){
        if (getX()==(getWorld().getWidth()-1))
        {
            getWorld().removeObject(this);
         
        }
    }
    
    private void hitEnemy(){
        Actor a = this.getOneIntersectingObject( Enemy.class );

        if(a != null ){
            this.getWorld().removeObject( a );
            Greenfoot.playSound("Shot.mp3");
            Hit hitenemy = new Hit();
            getWorld().addObject(hitenemy,getX(),getY());    
            getWorld().removeObject(this);   
            hitenemy.removerExplosao();
        }  else {
            detectarColisao();
        }       
        
        
            
        
    }
}
