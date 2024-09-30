package monster.controller;

import monster.model.MarshmallowMonster;

public class Controller {
   public Controller(){}

   public void start(){
      MarshmallowMonster demo = new MarshmallowMonster();
      System.out.println("The moster has:");
      System.out.println("\t- \"" + demo.getName() + "\" as a name");
      System.out.println("\t- " + demo.getTotalAppandageLength() + " appandage length");
      System.out.println("\t- " + demo.getTailLength() + " tail length");
      System.out.println("\t- " + demo.getWingCount() + " wings");
      System.out.println("\t- " + demo.getEyeCount() + " eyes");
      System.out.println("\t- " + demo.getEarCount() + " ears");
      System.out.println("\t- " + (demo.getHasHat() ? "A" : "No") + " hat");
   }
}
