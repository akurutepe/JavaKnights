
import java.awt.Color;
import static java.lang.Math.atan2;
import java.util.ArrayList;
import java.util.Random;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : HW546 - Knight Offline
//  @ File Name : AttackClosest.java
//  @ Date : 4/7/2015
//  @ Author : Alican Kurutepe - 1902618
//
//




public class AttackClosest extends Strategy {
    AttackClosest(Knight newKnigt){
        super(newKnigt);
    }
    @Override
    public double strategyCommand(){
        
        double headingDeg;
        double diffY,diffX;
        double tempX,tempY;
        ArrayList<Knight> enemyKnights;
        double closest = 10000.0;
        double[] dist = new double[8];
        Knight closestKnight = null;
        
      
        
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
            tempX = Math.pow(enemyKnights.get(i).getPosX()-this.getCurrentKnight().getPosX(),2);
            tempY = Math.pow(enemyKnights.get(i).getPosY()-this.getCurrentKnight().getPosY(),2);
            dist[i] = Math.sqrt(tempX+tempY);
            if(dist[i]<closest)
            {
                closestKnight = enemyKnights.get(i);
                closest = dist[i];
            }
            
        }
        
        this.getCurrentKnight().setTarget(closestKnight);
        diffY = (double)closestKnight.getPosY() - this.getCurrentKnight().getPosY();
        diffX = (double)closestKnight.getPosX() - this.getCurrentKnight().getPosX();
        
     
        headingDeg = (double) atan2(diffY,diffX);
        
 
        return headingDeg;
    }
}
