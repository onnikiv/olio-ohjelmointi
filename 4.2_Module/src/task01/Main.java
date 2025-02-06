package task01;


public class Main {
    public static void main(String[] args) {
        
        Calculator laskutin = new Calculator();

        laskutin.add(-1);
        laskutin.add(0);
        laskutin.add(5003);
        laskutin.add(24);
        
        System.out.println(laskutin.getCurrent());

        laskutin.reset();
        System.out.println(laskutin.getCurrent());
        System.out.println("-----------------");


        // Tässä kohtaa rupesin kuiskimaan Copilotille
        
        
        
        
    }

}
