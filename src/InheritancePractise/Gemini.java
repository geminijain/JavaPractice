package InheritancePractise;

public class Gemini extends Tanmay {

    public static void main(String[] args) {
        System.out.println("I have Gemini's properties");
        
        Gemini objct = new Gemini();
        objct.exercise();
        objct.cook();
     
    }
    
    public void exercise(){
        System.out.println("I like to exercise");
    }
    
    public void cook() {
        System.out.println("I like to cook good meal");
    }

}
