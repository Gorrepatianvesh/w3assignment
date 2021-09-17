public class VaccumCleanerTest {
    public static void main(String[] args) {
    
       //create object of clean class
       Clean clean = new Clean();
       // create object of vacuum cleaner class
       VaccumCleanerController vcc = new VaccumCleanerController();

       //Command vacuum to clean the water
       vcc.execute(new CleanWater(clean));
       vcc.doCommand();
       
       //Command vacuum to clean the dirt
       vcc.execute(new CleanDirt(clean));
       vcc.doCommand();
       
       //Command vacuum to clean the carpet
       vcc.execute(new CleanCarpet(clean));
       vcc.doCommand();
    }
}
