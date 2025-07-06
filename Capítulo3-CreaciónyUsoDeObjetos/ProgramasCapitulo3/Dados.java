//14. Escribir un programa que juegue dados con las siguientes reglas: se tiran dos dados y se suma el valor de la cara superior 
//de cada uno. Si la suma es 7 u 11 el jugador gana. Si la suma es 2, 3 o 12 el jugador pierde. Si la suma es 4, 5, 6, 8, 9 o 10, 
//esta se convierte en los puntos del jugador quien, para ganar, debe volver a tirar los dados y que la suma de esta tirada sea 
//igual a la anterior o bien igual a 7, en otro caso pierde.


import java.util.Scanner;
import java.util.Random;
public class Dados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Declarar variables
        String nombreJugador;
        int dado1, dado2;
      

        //Bienvenida
        System.out.println("Bienvenido al programa de dados, presiona cualquier tecla para comenzar y lanzar los dados");
        String x = scanner.nextLine();


        //Instruccion para lanzar dados
        dado1 = random.nextInt(6) + 1;
        dado2 = random.nextInt(6) + 1;

        //Mostrar resultado de cada dados
        System.out.println("El dado 1 dió: " + dado1);
        System.out.println("El dado 2 dió: " + dado2);


        int sumaDados = dado1 + dado2;

        //Mostrar suma de dados
        System.out.println("La suma de las caras es: " + sumaDados);
        System.out.println(" ");

        if(sumaDados == 7 || sumaDados == 11){
            System.out.println("Felicidades! Has ganado!");
            System.out.println(" ");
            System.out.println("Fin del juego :)");
        } 

        if(sumaDados == 2 || sumaDados == 3 || sumaDados == 12){
            System.out.println("Chanfle :( Perdiste!!");
            System.out.println(" ");
            System.out.println("Fin del juego");
        }

        if(sumaDados == 4 || sumaDados == 5 || sumaDados == 6 || sumaDados == 8 || sumaDados == 9 || sumaDados == 10){
           int puntosSumaDados = sumaDados;
           System.out.println("Debes volver a tirar los dados! Tus puntos son: " + puntosSumaDados);

           System.out.println("Presiona cualquier tecla para volver a tirar los dados...");
           scanner.nextLine(); // Espera entrada del usuario

           dado1 = random.nextInt(6) + 1;
           dado2 = random.nextInt(6) + 1;
           int nuevaSuma = dado1 + dado2;

           System.out.println("El dado 1 dió: " + dado1);
           System.out.println("El dado 2 dió: " + dado2);
           System.out.println("La suma de las caras es: " + nuevaSuma);

           if(nuevaSuma == puntosSumaDados || nuevaSuma == 7){
           System.out.println("¡Felicidades! Has ganado!");
           } else {
           System.out.println("Chanfle :( Perdiste!!");
           }
           System.out.println("Fin del juego");
        }

    }
}
