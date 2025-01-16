import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {0,0,0,0,0};
        int[] numbers2 = new int[1000000000];

        for (int i = 0; i < numbers2.length; i++){
            numbers2[i] = i;
        }
        System.out.print("Viimeinen numero on: " + numbers2[numbers2.length - 1]);
/*
        for (int i = 0; i <5; i++) {
            System.out.println("Anna "+ (i+1) + ". luku: ");
            numbers[i] = sc.nextInt();

        }
        System.out.println("Eka luku: "+ numbers[0]); */
    }
}
