package monster.controller;

import monster.model.MarshmallowMonster;

public class Controller {
   public Controller(){}

   public void start(){
      MarshmallowMonster demo = new MarshmallowMonster();
      System.out.println("The monster has:");
      System.out.println("\t- \"" + demo.getName() + "\" as a name");
      System.out.println("\t- " + demo.getTotalAppandageLength() + " appandage length");
      System.out.println("\t- " + demo.getTailLength() + " tail length");
      System.out.println("\t- " + demo.getWingCount() + " wings");
      System.out.println("\t- " + demo.getEyeCount() + " eyes");
      System.out.println("\t- " + demo.getEarCount() + " ears");
      System.out.println("\t- " + (demo.getHasHat() ? "A" : "No") + " hat");

      MarshmallowMonster myMonster = new MarshmallowMonster("Crawly", 4.7, 3.2, 6, 4, 2, false);
      System.out.println("The monster has:");
      System.out.println("\t- \"" + myMonster.getName() + "\" as a name");
      System.out.println("\t- " + myMonster.getTotalAppandageLength() + " appandage length");
      System.out.println("\t- " + myMonster.getTailLength() + " tail length");
      System.out.println("\t- " + myMonster.getWingCount() + " wings");
      System.out.println("\t- " + myMonster.getEyeCount() + " eyes");
      System.out.println("\t- " + myMonster.getEarCount() + " ears");
      System.out.println("\t- " + (myMonster.getHasHat() ? "A" : "No") + " hat");
   }
}
