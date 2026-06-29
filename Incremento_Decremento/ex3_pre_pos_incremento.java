package Incremento_Decremento;

public class ex3_pre_pos_incremento {
    public static void main(String[] args) {
        int a = 5; int b = a++; 

        System.out.println("b = a++ -> a: " + a + " | b: " + b);

        a = 5; b = ++a;

        System.out.println("b = ++a -> a: " + a + " | b: " + b);
    }    
}
