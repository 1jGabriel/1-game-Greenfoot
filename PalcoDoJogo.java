import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PalcoDoJogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PalcoDoJogo extends World
{
    GreenfootSound BG_music = new GreenfootSound("Through_Space.mp3");
    
    /**
     * Constructor for objects of class PalcoDoJogo.
     * 
     */ 
    public PalcoDoJogo()
    {    

        super(640, 480, 1);  
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        NaveMae navemae = new NaveMae();
        addObject(navemae,64,240);
        //Enemy enemy = new Enemy();
        //addObject(enemy,576,240);     
    }
    
    public void act (){
        if (Greenfoot.getRandomNumber(300)<2){
            addObject(new Enemy(), 630, Greenfoot.getRandomNumber(480));
        }
    }
    
    public void started() {
        BG_music.setVolume(65);
        BG_music.playLoop();
    }
    
    public void stopped() {
BG_music.pause();
    }
    
}
