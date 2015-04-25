/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
/**
 *
 * @author Alican
 */
public class simActionListener implements ActionListener {
  
    private static ArrayList<Knight> redKnights = Simulation.getRedTeam().getKnights();
    private static ArrayList<Knight> blueKnights= Simulation.getBlueTeam().getKnights();
    private static Strategy strategyRed;
    private static Strategy strategyBlue;
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        
       for(int i = 0; i<redKnights.size();i++)
       {
           if (redKnights.get(i).getStrategy() == null)
           {
               redKnights.get(i).setStrategy(new MoveRandom(redKnights.get(i)));
           }
           
           redKnights.get(i).takeTurn(Simulation.getStepNum());
           
         
       }
       
       
       
       for(int i = 0; i<blueKnights.size();i++)
       {
           if (blueKnights.get(i).getStrategy() == null)
           {
               blueKnights.get(i).setStrategy(new MoveRandom(blueKnights.get(i)));
           }
           
           blueKnights.get(i).takeTurn(Simulation.getStepNum());
       }
        
        Simulation.getRedTeam().refresh();
        Simulation.getBlueTeam().refresh();
        Simulation.getNewDisplay().getPaint().repaint();
        

  } 
}
