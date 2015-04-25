
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alican
 */
public class strategyChooser implements ActionListener {

private static ArrayList<Knight> redKnights = Simulation.getRedTeam().getKnights();
private static ArrayList<Knight> blueKnights= Simulation.getBlueTeam().getKnights();
private Random newRandom = new Random();
private int strategyKey = 0;

@Override
public void actionPerformed(ActionEvent e) {
    
    for(int i= 0;i<redKnights.size();i++){
        
        strategyKey = newRandom.nextInt(3);
        if(redKnights.get(i).getStrategy() == null)
        {
            redKnights.get(i).setStrategy(new MoveRandom(redKnights.get(i)));
        }
        else
        {
            if(strategyKey == 0)
            {
                redKnights.get(i).setStrategy(new MoveRandom(redKnights.get(i)));
                System.out.println(i + ". red knigth is moving random");
            }
            else if(strategyKey == 1)
            {
                redKnights.get(i).setStrategy(new AttackWeakest(redKnights.get(i)));
                System.out.println(i + ". red knigth is attacking weakest");
            }
            else
            {
                redKnights.get(i).setStrategy(new AttackClosest(redKnights.get(i)));
                System.out.println(i + ". red knigth is attacking closest");
            }
            
        }
    
       
      
        
    }
    for(int i= 0;i<blueKnights.size();i++){
        
        strategyKey = newRandom.nextInt(3);
        if(blueKnights.get(i).getStrategy() == null)
        {
            blueKnights.get(i).setStrategy(new MoveRandom(blueKnights.get(i)));
        }
        else
        {
            if(strategyKey == 0)
            {
                blueKnights.get(i).setStrategy(new MoveRandom(blueKnights.get(i)));
                System.out.println(i + ". blue knigth is moving random");
            }
            else if(strategyKey == 1)
            {
                blueKnights.get(i).setStrategy(new AttackWeakest(blueKnights.get(i)));
                System.out.println(i + ". blue knigth is attacking weakest");
            }
            else
            {
                blueKnights.get(i).setStrategy(new AttackClosest(blueKnights.get(i)));
                System.out.println(i + ". blue knigth is attacking closest");
            }
            
        }
    
       
      
        
    }
    
   
    
}
}
