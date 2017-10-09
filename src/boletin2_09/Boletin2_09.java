package boletin2_09;

import java.util.Scanner;

public class Boletin2_09 {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int b100, b20, b5, m1, Total;
        System.out.println("Introduce Total en €");
        Total=teclado.nextInt();
        b100=Total/100;
        b20=(Total%100)/20;
        b5=((Total%100)%20)/5;
        m1=(((Total%100)%20)%5)/1;
        System.out.println("Tiene ud.\n"+b100+" billetes de 100€\n"+b20+" billetes de 20€\n"+b5+" billetes de 5€\n"+m1+" monedas de €");
    
    }
    
}
