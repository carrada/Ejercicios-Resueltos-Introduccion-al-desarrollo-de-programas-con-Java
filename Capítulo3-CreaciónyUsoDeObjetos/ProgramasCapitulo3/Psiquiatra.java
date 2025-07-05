
// ### **9. Escribir un programa que modele un psiquiatra. El programa debe preguntar al usuario, que tomará 
//el papel de paciente, cuál es su problema. Con la respuesta debe preguntar por qué y después de su respuesta 
//decir "Muy interesante, hablaremos de ello con más detalle en la siguiente sesión". Por ejemplo:**

//¿Cómo se encuentra?
//Estoy deprimido.
//¿Por qué dice 'estoy deprimido'?
//No dije que usted estuviera deprimido; dije que yo estoy deprimido.
//Muy interesante, hablaremos de ello con más detalle en la siguiente
//sesión.

import java.util.Scanner;

public class Psiquiatra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        System.out.println("¿Cómo se encuentra?");
        respuesta = scanner.nextLine(); 
        System.out.println("¿Por qué dice '" + respuesta + "'?");
        respuesta = scanner.nextLine();
        System.out.println("Muy interesante, hablaremos de ello con más detalle en la siguiente sesión.");

    }
}
