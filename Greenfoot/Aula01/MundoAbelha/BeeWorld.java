import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Definição da Classe BeeWorld.
 * 
 * @author Dec0dex 
 * @version 2025-06-04
 */
public class BeeWorld extends World
{
  private  int score;
  private final int PONTOS=100;
  private Abelha abelha;
    
    
    /**
     * Constructor for objects of class BeeWorld.
     * 
     */
    public BeeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
        score++;
    
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,208,211);
        Abelha abelha = new Abelha();
        addObject(abelha,491,195);

        for(int qtd=0;qtd<20;qtd++){
            int posX=Greenfoot.getRandomNumber(800);
            int posY=Greenfoot.getRandomNumber(600);
            int vel=Greenfoot.getRandomNumber(3)+1;
            int rot=Greenfoot.getRandomNumber(360)+1;
            Mosca mosca = new Mosca();
            addObject(mosca,posX,posY);

        }
        TextoColorido txt = new TextoColorido("Mensagem Teste",500,50,25,Color.BLUE,Color.GRAY);
        addObject(txt,500, 50);
    }
    public void updateScore(){
        score+= PONTOS;
        showText("Score:"+score,100,10);
    }
    
    public Abelha getAbelha(){
        return abelha;
    }
}
