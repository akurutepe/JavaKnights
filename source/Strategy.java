//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : HW546 - Knight Offline
//  @ File Name : Strategy.java
//  @ Date : 4/7/2015
//  @ Author : Alican Kurutepe - 1902618
//
//
import java.awt.Color;
import java.util.*;


public abstract class Strategy {
        
        private Knight currentKnight;

        public Strategy(Knight currentKnight) {
            this.currentKnight = currentKnight;
        }
    
        
	public abstract double strategyCommand();

        public Knight getCurrentKnight() {
        return currentKnight;
        }

       
        
}
