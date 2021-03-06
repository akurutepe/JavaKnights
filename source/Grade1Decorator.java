
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : HW546 - Knight Offline
//  @ File Name : Grade1Decorator.java
//  @ Date : 4/7/2015
//  @ Author : Alican Kurutepe - 1902618
//
//




public class Grade1Decorator extends KnightDecorator {

    public Grade1Decorator(Knight decoratedKnight) {
        this.decoratedKnight = decoratedKnight;
    }
    
    
   @Override
   public  void attackNormal(){}
   @Override
   public void attackSpecial(){}
   @Override
   public void takeTurn(int stepTime){}
   @Override
   public void draw(Graphics g, Color teamColor){
   
         Graphics2D g2d = (Graphics2D) g;
		
	g2d.setRenderingHint (RenderingHints.KEY_ANTIALIASING,   RenderingHints.VALUE_ANTIALIAS_ON);
		
        g2d.setPaint(teamColor);
		
        if(this.decoratedKnight.getScoreTotal()>300)
        {    
            g2d.fillOval((int) this.decoratedKnight.getPosX() +13, (int) this.decoratedKnight.getPosY()-6, 3, 3);
        }
    
   }
}
