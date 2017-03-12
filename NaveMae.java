import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NaveMae here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NaveMae extends Actor
{
    /**
     * Act - do whatever the NaveMae wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int Escudo;
    
    public NaveMae()
    {
        this.Escudo = 100;
    }
    
    private int Dano;
    
    public void act() 
    {
        if(Greenfoot.getKey() == "space"){
            tiro();

        }
        
        
        if(Greenfoot.isKeyDown("up")){
            this.setLocation(getX(), getY()- 3);
            this.setImage("ship_up.png");
        } else if(Greenfoot.isKeyDown("down")){
            this.setLocation(getX(),getY()+3);
            this.setImage("ship_down.png");
        } else {
            this.setImage("ship_neutral.png");
        } 
          if(Greenfoot.isKeyDown("right")){
              this.setLocation(getX()+3,getY());
            } else if(Greenfoot.isKeyDown("left")){
                this.setLocation(getX()-3,getY());
            }
        checarEscudo();
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
        }
    }
 
    private void tiro()
    {
                 FireShot tiro = new FireShot();
                 getWorld().addObject(tiro,getX()+45,getY());
           //      Greenfoot.playSound("Shot.mp3");
        //         tiro.setLocation(getX(),getY());
        //PalcoDoJogo.addObject(tiro,getX(),getY());
    }
}
