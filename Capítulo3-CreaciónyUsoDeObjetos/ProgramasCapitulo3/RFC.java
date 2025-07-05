// 10. Escribir un programa para obtener el RFC de una persona. El RFC se obtiene tomando las dos primeras letras 
//del apellido paterno, la inicial del apellido materno y la inicial del nombre, seguido de los dos dígitos finales 
//del año de nacimiento, los dos dígitos del mes de nacimiento y dos dígitos para el día de nacimiento. Por ejemplo, 
//si la persona se llama Andrea López López y nació el 14-04-1992, su RFC es lola920414.

import java.util.Scanner;

public class RFC {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String apellidoPaterno, apellidoMaterno, nombre;
    int anoNacimiento, mesNacimiento, diaNacimiento;
    
    System.out.print("Ingrese el apellido paterno: ");
    apellidoPaterno = scanner.nextLine();

    System.out.print("Ingrese el apellido Materno: ");
    apellidoMaterno = scanner.nextLine();

    System.out.print("Ingresa tu primer nombre: ");
    nombre = scanner.nextLine();

    System.out.print("Ingresa tu año de nacimiento: ");
    anoNacimiento = scanner.nextInt();

    System.out.print("Inresa los dos digitos de tu mes de nacimiento: ");
    mesNacimiento = scanner.nextInt();

    System.out.print("Ingresa los dos digitos para tu dia de nacimiento: ");
    diaNacimiento = scanner.nextInt();

    String dosDigitosAno = String.format("%02d", anoNacimiento % 100);
    String dosDigitosMes = String.format("%02d", mesNacimiento);
    String dosDigitosDia = String.format("%02d", diaNacimiento);
    
    System.out.print("Tu RFC es: " + apellidoPaterno.substring(0, 2) + apellidoMaterno.substring(0, 1) + nombre.substring(0, 1)
        + dosDigitosAno + dosDigitosMes + dosDigitosDia);


    
    }
}
