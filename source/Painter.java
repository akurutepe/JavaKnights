
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.net.URL;
import java.util.*;
import javax.imageio.ImageIO;
import javax.rmi.CORBA.Util;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alican
 */
public class Painter extends JPanel{
    
      private BufferedImage gameMap ;
      private BufferedImage gameLogo;
      
      
      
      public Painter(){
          loadImages();
      }
      
      private void Draw(Graphics g) {
          
        
        ArrayList<Knight> redKnights = Simulation.getRedTeam().getKnights();
        ArrayList<Knight> blueKnights = Simulation.getBlueTeam().getKnights();

        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        rh.put(RenderingHints.KEY_RENDERING,
               RenderingHints.VALUE_RENDER_QUALITY);

        g2d.setRenderingHints(rh);
        
 
        
        g2d.drawImage(this.gameMap, 255,0,null );
        g2d.drawImage(this.gameLogo,2,480,null);
   
        
        
        for(int i = 0; i<redKnights.size();i++){
            redKnights.get(i).draw(g, Simulation.getRedTeam().getTeamColor());
            
        }
        for(int i = 0; i<Simulation.getRedTeam().getGrade3DecoratorList().size();i++)
        {
            Simulation.getRedTeam().getGrade3DecoratorList().get(i).draw(g, Color.WHITE);
        }
         for(int i = 0; i<Simulation.getRedTeam().getGrade2DecoratorList().size();i++)
        {
            Simulation.getRedTeam().getGrade2DecoratorList().get(i).draw(g, Color.PINK);
        }
          for(int i = 0; i<Simulation.getRedTeam().getGrade1DecoratorList().size();i++)
        {
            Simulation.getRedTeam().getGrade1DecoratorList().get(i).draw(g, Color.ORANGE);
        }
         
        for(int i = 0; i<blueKnights.size();i++){
            blueKnights.get(i).draw(g, Simulation.getBlueTeam().getTeamColor());
        }
        for(int i = 0; i<Simulation.getBlueTeam().getGrade3DecoratorList().size();i++)
        {
            Simulation.getBlueTeam().getGrade3DecoratorList().get(i).draw(g, Color.WHITE);
        }
         for(int i = 0; i<Simulation.getBlueTeam().getGrade2DecoratorList().size();i++)
        {
            Simulation.getBlueTeam().getGrade2DecoratorList().get(i).draw(g, Color.PINK);
        }
          for(int i = 0; i<Simulation.getBlueTeam().getGrade1DecoratorList().size();i++)
        {
            Simulation.getBlueTeam().getGrade1DecoratorList().get(i).draw(g, Color.ORANGE);
        }
        
        g2d.setPaint(Color.BLUE);
        g2d.drawString("El Morad", 10, 15);
        g2d.drawString("Teamscore  : "+ String.valueOf(Simulation.getBlueTeam().getTeamScore()), 10, 30);
        g2d.drawString("Team Kill  : "+ String.valueOf(Simulation.getBlueTeam().getTeamKills()), 10, 45);
        g2d.drawString("Tot. damage: "+ String.valueOf(Simulation.getBlueTeam().getTotalDmg()), 10, 60);
        for(int i = 0; i <Simulation.getBlueTeam().getKnights().size();i++)
        {
            g2d.drawString(i+". Knight -- " + String.valueOf(Simulation.getBlueTeam().getKnights().get(i).getStrategy()),10,(75+(i*15)));
        }
        g2d.setPaint(Color.RED);
        g2d.drawString("Karus", 10, 220);
        g2d.drawString("Teamscore  : "+ String.valueOf(Simulation.getRedTeam().getTeamScore()), 10, 235);
        g2d.drawString("Team Kill  : "+ String.valueOf(Simulation.getRedTeam().getTeamKills()), 10, 250);
        g2d.drawString("Tot. damage: "+ String.valueOf(Simulation.getRedTeam().getTotalDmg()), 10, 265);
        for(int i = 0; i <Simulation.getRedTeam().getKnights().size();i++)
        {
            g2d.drawString(i+". Knight -- " + String.valueOf(Simulation.getRedTeam().getKnights().get(i).getStrategy()),10,(280+(i*15)));
        }
       
   }
    private void loadImages(){
        
        
     
        try{
       
        this.gameMap = ImageIO.read(this.getClass().getResourceAsStream("/asset/gameMap.jpg"));
        this.gameLogo = ImageIO.read(this.getClass().getResourceAsStream("/asset/logo.png"));
        } catch (IOException ex) {

            Logger.getLogger(Painter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        Draw(g);
    }    

    
    
}
