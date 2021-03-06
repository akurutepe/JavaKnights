
import java.awt.Color;
import static java.lang.Math.atan;
import static java.lang.Math.atan2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : HW546 - Knight Offline
//  @ File Name : AttackWeakest.java
//  @ Date : 4/7/2015
//  @ Author : Alican Kurutepe - 1902618
//
//




public class AttackWeakest extends Strategy {
    AttackWeakest(Knight newKnigt){
        super(newKnigt);
    }
    @Override
    public double strategyCommand(){
        
        double headingDeg;
        double diffY,diffX;
        ArrayList<Knight> enemyKnights;
        int weakest = 1000;
        Knight weakestKnight = null;
        
        if(this.getCurrentKnight().getKnightColor() == Color.RED)
        {
            enemyKnights = Simulation.getBlueTeam().getKnights();
        }
        else
        {
            enemyKnights = Simulation.getRedTeam().getKnights();
        }
        
        
        for(int i = 0; i < enemyKnights.size();i++)
        {
            if(enemyKnights.get(i).getHitPoint()<weakest)
            {
                weakestKnight = enemyKnights.get(i);
                weakest = enemyKnights.get(i).getHitPoint();
            }
            
        }
        
        this.getCurrentKnight().setTarget(weakestKnight);
        diffY = (double)weakestKnight.getPosY() - this.getCurrentKnight().getPosY();
        diffX = (double)weakestKnight.getPosX() - this.getCurrentKnight().getPosX();
        
     
        headingDeg = (double) atan2(diffY,diffX);
        
 
        return headingDeg;
    }
}
