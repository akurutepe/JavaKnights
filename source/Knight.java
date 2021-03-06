
import java.awt.Graphics;
import java.awt.Color;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.math.*;
import java.util.Random;
import javax.swing.Timer;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : HW546 - Knight Offline
//  @ File Name : Knight.java
//  @ Date : 4/7/2015
//  @ Author : Alican Kurutepe - 1902618
//
//




public abstract class Knight {


        private int posX;
        private int posY;
        private double currentHeading;
        private int speed;
        private int hitPoint;
        private int score;
        private int scoreTotal;
        private int kills = 0;
        private int dmg = 0;
        private Timer coolDownTimer;
        private Knight target;
        private Color knightColor;
        private cdActionListener coolDownReset;
        private boolean normalAttackDone;
        private boolean specialAttackDone;
        

	private Strategy strategy;
        
        Knight(){
            System.out.println("a knight instantiated");
            this.coolDownReset = new cdActionListener(this);
            this.coolDownTimer = new Timer(1000,this.coolDownReset);
             
        }
        
        public abstract void draw(Graphics g, Color newColor);
        public abstract void attackNormal();
        public abstract void attackSpecial();
        public void takeTurn(int stepTime){
            
            double diffX, diffY;
            int newPosX,newPosY;
            int selectSkill;
            Random newRand = new Random();
            selectSkill = newRand.nextInt(4);
            
            
            
            
            
            
            this.currentHeading = this.strategy.strategyCommand();
            
            
            diffX = (double)(( this.getSpeed())/(double) (Simulation.getStepNum()*1.0))*cos(this.currentHeading);
            diffY = (double)(( this.getSpeed())/(double) (Simulation.getStepNum()*1.0))*sin(this.currentHeading);
            
            newPosX = (int)(this.getPosX() + diffX);
            newPosY = (int)(this.getPosY() + diffY);
            
            if (newPosX <= 255)
            {
                newPosX = 1000;
            }    
            else if(newPosX >= 1000)
            {
                newPosX = 255;
            }
            if (newPosY <= 0)
            {
                newPosY = 715;
            }    
            else if(newPosY >= 715)
            {
                newPosY = 0;
            }
            
            if( this.getTarget()  != null)
            {
                 
                if(this.coolDownTimer.isRunning() == false)
                {   
                    if(selectSkill == 0)
                    {
                        this.attackSpecial();
                    }
                    else{
                        this.attackNormal();
                    }
                    this.coolDownTimer.start(); 
                }
            }
            
            
            
            
            this.setPosX(newPosX);
            this.setPosY(newPosY);
            
        }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

   

    public Knight getTarget() {
        return target;
    }

    public void setTarget(Knight target) {
        this.target = target;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Color getKnightColor() {
        return knightColor;
    }

    public void setKnightColor(Color knightColor) {
        this.knightColor = knightColor;
    }

    public double getCurrentHeading() {
        return this.currentHeading;
    }
    
    public boolean isDead(){
        if(this.hitPoint <= 0)
        {
            return true;
        }
        else{
            return false;
        }
            
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
       
    public  Timer getCoolDownTimer() {
        return coolDownTimer;
    }

    public void setCoolDownTimer(Timer aCoolDownTimer) {
        coolDownTimer = aCoolDownTimer;
    }

    public boolean isNormalAttackDone() {
        return normalAttackDone;
    }

    public void setNormalAttackDone(boolean normalAttackDone) {
        this.normalAttackDone = normalAttackDone;
    }

    public boolean isSpecialAttackDone() {
        return specialAttackDone;
    }

    public void setSpecialAttackDone(boolean specialAttackDone) {
        this.specialAttackDone = specialAttackDone;
    }

    public int getScoreTotal() {
        return scoreTotal;
    }

    public void setScoreTotal(int scoreTotal) {
        this.scoreTotal = scoreTotal;
    }
    
        
        
        
	
}
