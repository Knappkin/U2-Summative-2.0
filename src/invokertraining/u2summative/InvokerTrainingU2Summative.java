/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invokertraining.u2summative;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author SeKna6164
 */
public class InvokerTrainingU2Summative{
// The methods for each of the 10 spells
   public static boolean cSnap(char[] cast, int test, boolean rw){
       Scanner keyedInput = new Scanner(System.in);
     
       String castS;
       cast = new char[3];
       castS = keyedInput.nextLine();
       cast = castS.toCharArray();
       Arrays.sort(cast);
       if (cast[0]=='q' && cast[1]=='q'&&cast[2]=='q') {
     System.out.println("correct!");
    
       
       rw = true;
       return rw;
       }
       else {
           System.out.println("incorrect");
           rw = false;
           return rw;
       }    
   }
   public static boolean gWalk(char[] cast, int test, boolean rw){
       Scanner keyedInput = new Scanner(System.in);
       String castS;
       cast = new char[3];
       castS = keyedInput.nextLine();
       cast = castS.toCharArray();
       Arrays.sort(cast);
       if (cast[0]=='q' && cast[1]=='q'&& cast[2]=='w') {
           System.out.println("correct!");
       
           rw = true;
           return rw;
      }
       else {
           System.out.println("incorrect");
          rw = false;
          return rw;
       }     
       
   }
   public static boolean iWall(char[] cast, int test, boolean rw){
       Scanner keyedInput = new Scanner(System.in);
       String castS;
       cast = new char[3];
       castS = keyedInput.nextLine();
       cast = castS.toCharArray();
       Arrays.sort(cast);
       if (cast[0]=='e' && cast[1]=='q'&& cast[2]=='q') {
           System.out.println("correct!");
       
           rw = true;
           return rw;
      }
       else {
           System.out.println("incorrect");
          rw = false;
          return rw;
       }     
       
   }
   public static boolean emp(char[] cast, int test, boolean rw){
       Scanner keyedInput = new Scanner(System.in);
       String castS;
       cast = new char[3];
       castS = keyedInput.nextLine();
       cast = castS.toCharArray();
       Arrays.sort(cast);
       if (cast[0]=='w' && cast[1]=='w'&& cast[2]=='w') {
           System.out.println("correct!");
       
           rw = true;
           return rw;
      }
       else {
           System.out.println("incorrect");
          rw = false;
          return rw;
       }     
       
   }
   public static boolean tNado(char[] cast, int test, boolean rw){
       Scanner keyedInput = new Scanner(System.in);
       String castS;
       cast = new char[3];
       castS = keyedInput.nextLine();
       cast = castS.toCharArray();
       Arrays.sort(cast);
       if (cast[0]=='q' && cast[1]=='w'&& cast[2]=='w') {
           System.out.println("correct!");
       
           rw = true;
           return rw;
      }
       else {
           System.out.println("incorrect");
          rw = false;
          return rw;
       }     
       
   }
   public static boolean alac(char[] cast, int test, boolean rw){
       Scanner keyedInput = new Scanner(System.in);
       String castS;
       cast = new char[3];
       castS = keyedInput.nextLine();
       cast = castS.toCharArray();
       Arrays.sort(cast);
       if (cast[0]=='e' && cast[1]=='w'&& cast[2]=='w') {
           System.out.println("correct!");
       
           rw = true;
           return rw;
      }
       else {
           System.out.println("incorrect");
          rw = false;
          return rw;
       }     
       
   }
   public static boolean sStrike(char[] cast, int test, boolean rw){
       Scanner keyedInput = new Scanner(System.in);
       String castS;
       cast = new char[3];
       castS = keyedInput.nextLine();
       cast = castS.toCharArray();
       Arrays.sort(cast);
       if (cast[0]=='e' && cast[1]=='e'&& cast[2]=='e') {
           System.out.println("correct!");
       
           rw = true;
           return rw;
      }
       else {
           System.out.println("incorrect");
          rw = false;
          return rw;
       }     
       
   }
   public static boolean fSpirit(char[] cast, int test, boolean rw){
       Scanner keyedInput = new Scanner(System.in);
       String castS;
       cast = new char[3];
       castS = keyedInput.nextLine();
       cast = castS.toCharArray();
       Arrays.sort(cast);
       if (cast[0]=='e' && cast[1]=='e'&& cast[2]=='q') {
           System.out.println("correct!");
       
           rw = true;
           return rw;
      }
       else {
           System.out.println("incorrect");
          rw = false;
          return rw;
       }     
       
   }
   public static boolean cMeteor(char[] cast, int test, boolean rw){
       Scanner keyedInput = new Scanner(System.in);
       String castS;
       cast = new char[3];
       castS = keyedInput.nextLine();
       cast = castS.toCharArray();
       Arrays.sort(cast);
       if (cast[0]=='e' && cast[1]=='e'&& cast[2]=='w') {
           System.out.println("correct!");
       
           rw = true;
           return rw;
      }
       else {
           System.out.println("incorrect");
          rw = false;
          return rw;
       }     
       
   }
   public static boolean dBlast(char[] cast, int test, boolean rw){
       
       Scanner keyedInput = new Scanner(System.in);
       String castS;
       cast = new char[3];
       castS = keyedInput.nextLine();
       cast = castS.toCharArray();
       Arrays.sort(cast);
       if (cast[0]=='e' && cast[1]=='q'&& cast[2]=='w') {
           System.out.println("correct!");
       
           rw = true;
           return rw;
      }
       else {
           System.out.println("incorrect");
          rw = false;
          return rw;
       }     
       
   }
    public static void main(String[] args) {
    Scanner keyedInput = new Scanner(System.in);
    int spellR=0;
    double avgSpe, rAvgSpe, score = 0;
    long startT, endT;
    boolean rW;
       int start;
        char[] spellC = new char[3];
        rW = true;
      System.out.println("Enter 1 to start practice. Enter 2 to see spell list.");
    start = keyedInput.nextInt();
    //If they enter a character that is not specified
    if (start>2){
        System.out.println("Ummmm... if you can't even choose 1 or 2 you aren't ready for invoker");
    }
    //If they select to learn
    if (start==2){
        System.out.println("Quas = q    Wex = w    Exort = e");
        System.out.println();
        System.out.println("Cold Snap: Quas Quas Quas");
        System.out.println("Ghost Walk: Quas Quas Wex");
        System.out.println("Ice Wall: Quas Quas Exort");
        System.out.println("EMP: Wex Wex Wex");
        System.out.println("Tornado: Quas Wex Wex");
        System.out.println("Alacrity: Wex Wex Exort");
        System.out.println("Sun Strike: Exort Exort Exort");
        System.out.println("Forged Spirit: Quas Exort Exort");
        System.out.println("Chaos Meteor: Wex Exort Exort");
        System.out.println("Deafening Blast: Quas Wex Exort");
        System.out.println();
         System.out.println("Enter 1 to start the practice");
         System.out.println();
    start = keyedInput.nextInt();
    }
    System.out.println();
    //If they choose to start the practice
    if (start==1){     
    startT = System.currentTimeMillis();
      while (rW==true) {
             spellR = (int)Math.round(Math.random()*9);
      
    if (spellR==0){
        System.out.println("Cold Snap: ");
       
       rW = cSnap(spellC, spellR, rW); 
       
    
       }
      
    else if (spellR==1){
        System.out.println("Ghost Walk: ");
       rW = gWalk(spellC, spellR, rW);
     
       }
    else if (spellR==2){
        System.out.println("Ice Wall: ");
       rW = iWall(spellC, spellR, rW);
     
       }
    else if (spellR==3){
        System.out.println("EMP: ");
       rW = emp(spellC, spellR, rW);
     
       }
    else if (spellR==4){
        System.out.println("Tornado: ");
       rW = tNado(spellC, spellR, rW);
     
       }
    else if (spellR==5){
        System.out.println("Alacrity: ");
       rW = alac(spellC, spellR, rW);
     
       }
    else if (spellR==6){
        System.out.println("Sun Strike: ");
       rW = sStrike(spellC, spellR, rW);
     
       }
    else if (spellR==7){
        System.out.println("Forge Spirit: ");
       rW = fSpirit(spellC, spellR, rW);
     
       }
    else if (spellR==8){
        System.out.println("Chaos Meteor: ");
       rW = cMeteor(spellC, spellR, rW);
     
       }
    else if (spellR==9){
        System.out.println("Deafening Blast: ");
       rW = dBlast(spellC, spellR, rW);
     
       }
      if (rW==true){
            score = score +1;
            System.out.println(score + " in a row");
         }   
            else {
       //End display when they get a spell incorrect 
       endT = ((System.currentTimeMillis()) - startT)/1000;
       avgSpe = endT/score;
       rAvgSpe = Math.round(avgSpe*100.00)/100.00;
         System.out.println("You got " + score + " in " + endT + " seconds");
         System.out.println("Your average time spent on each spell was " + rAvgSpe + " seconds");
  }
      }
    }
}
}



