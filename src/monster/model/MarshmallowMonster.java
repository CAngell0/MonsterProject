package monster.model;

public class MarshmallowMonster {
   private String name;
   private double totalAppandageLength;
   private double tailLength;
   private int wingCount;
   private int eyeCount;
   private int earCount;
   private boolean hasHat;

   public MarshmallowMonster(){
      this.name = "Crawler";
      this.totalAppandageLength = 4.2;
      this.tailLength = 3.5;
      this.wingCount = 2;
      this.eyeCount = 2;
      this.earCount = 2;
      this.hasHat = true;
   }

   public MarshmallowMonster(String name, double totalAppandageLength, double tailLength, int wingCount, int eyeCount, int earCount, boolean hasHat){
      this.name = name;
      this.totalAppandageLength = totalAppandageLength;
      this.tailLength = tailLength;
      this.wingCount = wingCount;
      this.eyeCount = eyeCount;
      this.earCount = earCount;
      this.hasHat = hasHat;
   }

   public String getName(){
      return this.name;
   }
   public double getTotalAppandageLength(){
      return this.totalAppandageLength;
   }
   public double getTailLength(){
      return this.tailLength;
   }
   public int getWingCount(){
      return this.wingCount;
   }
   public int getEyeCount(){
      return this.eyeCount;
   }
   public int getEarCount(){
      return this.earCount;
   }
   public boolean getHasHat(){
      return this.hasHat;
   }
}

