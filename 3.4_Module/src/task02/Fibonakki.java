package task02;

public class Fibonakki {

    public static void main(String[] args) {
        

        int edellinen = 0;
        int seuraava = 1;
        int nykyinen = 0;

        

        for (int i = 0; i < 10; i++) {
            
            edellinen = seuraava;
            seuraava = nykyinen;

            System.out.println(nykyinen);
            

        
        }
    }
}
