public class MiPerfil {
    public static void main(String[] args) {
        int edad = 18;
        double estatura = 1.75;
        char inicial = 'C';
        boolean licenciaConductor = false;
        final int iva = 16;

        // autoincremento
        edad++;

        // costo coche
        double precioBase = 100000;
        double precioFinal = precioBase + (precioBase * iva / 100);
        

        //evaluar condición
        boolean puedeConducir = (edad >= 18 && licenciaConductor);

        // imprimir perfil
        System.out.println("Mi perfil:");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Estatura: " + estatura + " metros");
        System.out.println("Inicial del nombre: " + inicial);
        System.out.println("Tiene licencia de conducir: " + (licenciaConductor ? "Sí" : "No"));
        System.out.println("IVA: " + iva + "%");
        System.out.println("Precio del coche: $" + precioFinal);
        System.out.println("Puede conducir: " + (puedeConducir ? "Sí" : "No"));
        System.out.println("¡Gracias por conocerme!");


    }
}
