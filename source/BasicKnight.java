
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : HW546 - Knight Offline
//  @ File Name : BasicKnight.java
//  @ Date : 4/7/2015
//  @ Author : Alican Kurutepe - 1902618
//
//




public abstract class BasicKnight extends Knight {
    
   BasicKnight (){}
   
   @Override
   public abstract void attackNormal();
   @Override
   public abstract void attackSpecial();
 
   @Override
    public abstract void draw(Graphics g, Color newColor);
}