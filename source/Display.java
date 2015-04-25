/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Component;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
/**
 *
 * @author Alican
 */
public class Display extends JFrame {
    
    private Painter paint = new Painter();
    
     public Display() {

        initUI();
    }
    
    private void initUI() {
        
        setTitle("Knight Offline");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
        add(paint);
        
        setSize(1029, 786);
        this.setResizable(false);
      
        setLocationRelativeTo(null);        
    }

    public Painter getPaint() {
        return paint;
    }
    
    
    
}
