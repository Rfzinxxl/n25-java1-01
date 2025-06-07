import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Está é uma Classe que representará uma Abelha.
 * 
 * @author Dec0dex
 * @version 2025-06-04
 */
public class Abelha extends Actor
{
    int vidas;
    int score;
    int PONTOS=100;
/**
 * Constructor da Classe Abelha
 */
    public Abelha(){
        vidas=3;
        score=0;
        
    }
    
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if (Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown("right")){
        turn(5);
    }
    verificarPosicao();
    capturarMosca();
  serCapturadopelaAranha();
  
    }
    /**
     * Método que verifica posição da Abelha.
     */
    
    public void verificarPosicao(){
        if (estaNoTopo()){
            setLocation(getX(),getWorld().getHeight()-10);
            
        }
        if(estaNaBase()){
            setLocation(getX(),10);
        }
        if(estaNaDireita()){
            setLocation(10,getY());
        }
        if(estaNaEsquerda()){
            setLocation(getWorld().getWidth()-10,getY());
        }
        
    }

    /**
     * Método que verifica se a abelha está no topo.
     */
    public boolean estaNoTopo(){ 
        if(getY()<10){
            return true;
        } else {
            return false;
        }
    }
    /**
     * Método que verifica se a abelha está na base
     */
    public boolean estaNaBase(){
        return getY()>getWorld().getHeight()-10;
    }
    /**
     * Método que verifica se a abelha está na esquerda
     */
    public boolean estaNaEsquerda(){
        return getX()<10;
    }
    /**
     * Método que verifica se a abelha está na direita
     */
    public boolean estaNaDireita(){
        return getX()>getWorld().getWidth()-10;
    }
    
    /**
     * Metodo de Captura
     */
    public void capturarMosca(){
     if(isTouching(Mosca.class)){
         removeTouching(Mosca.class);
         Greenfoot.playSound("slurp.wav");
         atualizarScore();
         int posX=Greenfoot.getRandomNumber(getWorld().getWidth())+1;
         int posY=Greenfoot.getRandomNumber(getWorld().getHeight())+1;
         Mosca mosca = new Mosca();
         getWorld().addObject(mosca,posX,posY);     
         
     }
    }
    
    /**
     * Ser capturado pela Aranha
     */
    public void serCapturadopelaAranha(){
        if(isTouching(Aranha.class)){
          int posX=Greenfoot.getRandomNumber(getWorld().getWidth())+1;
         int posY=Greenfoot.getRandomNumber(getWorld().getHeight())+1;  
         setLocation(posX,posY);
         Greenfoot.playSound("ouch.wav");
         vidas--;
         if(vidas<=0){
             getWorld().showText("GAME OVER",400,300);
             Greenfoot.stop();
         }
        }
    }
    
    public void atualizarScore(){
        score+=PONTOS;
        getWorld().showText("Score:"+score,100,10);
    }
    
 
}