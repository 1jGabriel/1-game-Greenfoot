import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NaveMae here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the NaveMae wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int Escudo;
    
    public Enemy()
    {
        this.Escudo = 100;
    }
    
    private int Dano;
    
    public void act() 
    {
        move(-3);
        //checarEscudo();        
        receiveDamage();
        
    }    
    
    private void detectarFim(){
        if (getX()<=(getWorld().getWidth()-630))
        {
         //   System.out.println(getWorld().getWidth());
            getWorld().removeObject(this);
         //   Greenfoot.stop();
        }
    }
    public void setEscudo(int Escudo){
        this.Escudo = Escudo;       
    }
    
     public void setDano(int Dano){
        this.Dano = Dano;       
    }
    
    public int getEscudo()
    {  
        return Escudo;
    }
    
    public void causaDano(int _dano)
    {
     Escudo -= _dano;   
    }
    
    private void checarEscudo()
    {
            if (Escudo <= 0){
                getWorld().removeObject(this);
                Greenfoot.stop();
        }
    }
 
    private void tiro()
    {
                 FireShot tiro = new FireShot();
                 getWorld().addObject(tiro,getX()+45,getY());
    }
    private void receiveDamage(){
       Actor a;
       a = getOneObjectAtOffset (0, 0, FireShot.class);
       if (a != null)
      {
          Escudo -= 10;
          Greenfoot.playSound("Shot.mp3");
          if (Escudo <= 0){
          World world;
          world = getWorld();
          world.removeObject (a);
        }
          
        }else 
        {
            detectarFim();
        }
            
            
      /*      Actor a = this.getOneIntersectingObject(FireShot.class );
            
            if(a != null){
                this.getWorld().removeObject( a );
                //getWorld().removeObject(this);
                Escudo -= 10;
                Hit hitenemy = new Hit();
                     getWorld().addObject(hitenemy,getX(),getY());    
                       
        */              
        
        }
}
