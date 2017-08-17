package InheritancePractise;

public class Tiya extends Gemini {

    public static void main(String[] args) {
       System.out.println("I have Tiya's properties");
       
       Tiya testObjt = new Tiya();
       testObjt.creative();
       
     
    }

    public void creative(){
        System.out.println("I am very creative and active baby");
        
        Gemini testObject = new Gemini();
        testObject.coding();
        testObject.cook();
        testObject.exercise();
        testObject.walk();
    }
    
   
}
