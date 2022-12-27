import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleátórios (entre 0 e 100) armazen-os num vetor.
Ao final mostre os números e seus sucessores.
 */
public class Ex3_NumeroAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1) + " ");
        }
    }

}

