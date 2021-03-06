
import java.awt.Color;

//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : HW546 - Knight Offline
//  @ File Name : MageFactory.java
//  @ Date : 4/7/2015
//  @ Author : Alican Kurutepe - 1902618
//
//




public class MageFactory extends SoldierFactory {
    public MageFactory (Color teamColor, int basePosX, int basePosY) {
        this.setTeamColor(teamColor);
        this.setBasePosX(basePosX);
        this.setBasePosY(basePosY);
    }
    
    @Override
    public Knight CreateKnight()
    {
        Mage newMage;
        newMage = new Mage(this.getTeamColor(),this.getBasePosX(),this.getBasePosY());
        
        return newMage;
                   
    }
}
