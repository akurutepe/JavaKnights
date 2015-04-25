/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
/**
 *
 * @author Alican
 */
public class cdActionListener implements ActionListener{
    
    private Knight currentKnight;

    public cdActionListener(Knight currentKnight) {
        this.currentKnight = currentKnight;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        this.currentKnight.getCoolDownTimer().stop();
    
    } 
}
