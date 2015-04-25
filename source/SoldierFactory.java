//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : HW546 - Knight Offline
//  @ File Name : SoldierFactory.java
//  @ Date : 4/7/2015
//  @ Author : Alican Kurutepe - 1902618
//
//
import java.awt.Color;

public abstract class SoldierFactory {
    
	private Color teamColor;
        private int basePosX;
        private int basePosY;
        
        SoldierFactory(){
        System.out.println("soldier factory instantiated");
        }
        
        
	public abstract Knight CreateKnight();

    public Color getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(Color teamColor) {
        this.teamColor = teamColor;
    }

    public int getBasePosX() {
        return basePosX;
    }

    public void setBasePosX(int basePosX) {
        this.basePosX = basePosX;
    }

    public int getBasePosY() {
        return basePosY;
    }

    public void setBasePosY(int basePosY) {
        this.basePosY = basePosY;
    }
        
        
        
}