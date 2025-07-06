# Ejercicios Capitulo 3

### **1. ¿En qué difiere una variable para un tipo primitivo de una variable para referencias?**

una de tipo primitivo es la que contiene un dato dentro de el , y la de variable para referencias es un tipo de dato usado para trabajar con objetos 

### **2. ¿En qué difiere un tipo primitivo de una clase?**

Una clase es un "molde" en la que contiene objetos y metodos dentro de ella, los metodos son los comportamientos de los objetos. Y un tipo primitivo es un tipo de dato que contiene un dato dentro de el 

### **3. Responde con verdadero o falso:**
- **(a)** ¿Es posible que con una variable se haga referencia a más de un objeto a la vez?  

Falso, una variable de referencia solo puede apuntar a un objeto a la vez, aunque ese objeto pueda ser compartido por varias variables

- **(b)** ¿Es posible que con una variable se haga referencia a más de un objeto en diferentes momentos?

Verdadero, una variable de referencia puede apuntar a diferentes objetos en distintos momentos

- **(c)** ¿Es posible crear objetos sin utilizar el operador `new`?

Verdadero, si es posible en algunos casos por ejemplo usando literales de cadenas (String s = "hola"); o metodos que devuelven objetos

- **(d)** ¿Es posible eliminar objetos sin utilizar la instrucción `System.gc()`?

Verdadero, el recolector de basura de java elimina objetos automaticamente cuando ya no hay referencias a ellos, sin tener que llamar a System.gc()

### **4. ¿Cuántos objetos hay en cada segmento de código? ¿Cuántas y cuáles referencias tiene cada uno?**

1. Objeto t, s;
t = new Objeto();
s = t;

Hay 1 objeto, y t y s apuntan al mismo objeto

2. Objeto t, s;
t = new Objeto();
s = t;
t = null;

Hay 1 objeto, s apunta al objeto y t no apunta a nada porque es null

3. Objeto t, s;
t = new Objeto();
s = new Objeto();

Hay 2 objetos, t apunta al primero y s al segundo

### **5. ¿Es correcto el siguiente código para intercambiar dos valores? ¿Por qué?**

public class Duda {
  public static void main (String[] pps) {
    int x = 25, y = 18;
    y = x;
    x = y;
    System.out.println("Ahora x = " + x + " y = " + y);
  }
}

No, despues de ejecutar ambas variables tendran el valor de x y el valor de y se pierde

### **6. Dada la instrucción if ((valorNuevo >= 0) && (valorNuevo < limite)) { valor = valorNuevo; }: **

**(a) ¿Cuál es el rango de valores válidos para asignar valorNuevo?**

los numeros reales, los mayores o iguales a 0 y menores que limite

**(b) ¿Cuál sería el rango si se cambia >= por >?**

Los numeros mayores que cero y menores que limite

**(c) ¿Cuál sería el rango si se cambia && por ||?**

el rango serian numeros mayores o iguales a cero o todos los valores que limite


### **7. ¿Qué imprime el siguiente programa?**

class UsoDeCadenas{

public static void main (String [] pps) {

String frase = "Una mosca parada en la pared";

System.out.println("La frase :\"" + frase + "\" tiene "+ frase.length(
+" letras");
System.out.println("Extraje la palabra :" + frase.substring(4,10));

String otra =frase.toUpperCase().replace('E','A').replace('I',’A’);
otra = otra.replace('0', 'A').replace('U','А');

System.out.println("En mayúsculas y con A: "+otra);
otra = otra.replace('A', '0').toLowerCase();

System.out.println("Ahora en minúsculas y con o: "+otra);
String larga =frase.concat(" roja");

System.out.println(larga + "\n"+ frase);
}
}


La frase "Una mosca parada en la pared" tiene 28 letras
Extraje la palabra mosca
ANA MASCA PARADA AN LA PARAD
0n0 m0sc0 p0r0d0 0n l0 p0r0d
Una mosca parada en la pared roja
Una mosca parada en la pared


### **8. Escribir un programa para rotular sobres de cartas dirigidas a James Bond, con la siguiente dirección:**

J. Bond
"Agente 007"
Apt. #645 N.Y.
USA.

el programa se encuentra en el archivo Cartas.java

### **9. Escribir un programa que modele un psiquiatra. El programa debe preguntar al usuario, que tomará el papel de paciente, cuál es su problema. Con la respuesta debe preguntar por qué y después de su respuesta decir "Muy interesante, hablaremos de ello con más detalle en la siguiente sesión". Por ejemplo:**

¿Cómo se encuentra?
Estoy deprimido.
¿Por qué dice 'estoy deprimido'?
No dije que usted estuviera deprimido; dije que yo estoy deprimido.
Muy interesante, hablaremos de ello con más detalle en la siguiente
sesión.


El programa se encuentra en Psiquiatra.java

### **10. Escribir un programa para obtener el RFC de una persona. El RFC se obtiene tomando las dos primeras letras del apellido paterno, la inicial del apellido materno y la inicial del nombre, seguido de los dos dígitos finales del año de nacimiento, los dos dígitos del mes de nacimiento y dos dígitos para el día de nacimiento. Por ejemplo, si la persona se llama Andrea López López y nació el 14-04-1992, su RFC es lola920414.**

El programa se encuentra en RFC.java



### **11.  Escribir un programa para que jueguen disparejos entre tres jugadores; uno de ellos es la computadora. El juego consiste en que cada jugador lanza su moneda al aire y gana el jugador cuya cara visible de la moneda sea distinta de la cara visible de cada una de las otras dos monedas.**

El programa se encuentra en Disparejos.java

### **14. Escribir un programa que juegue dados con las siguientes reglas: se tiran dos dados y se suma el valor de la cara superior de cada uno. Si la suma es 7 u 11 el jugador gana. Si la suma es 2, 3 o 12 el jugador pierde. Si la suma es 4, 5, 6, 8, 9 o 10, ´esta se convierte en los puntos del jugador quien, para ganar, debe volver a tirar los dados y que la suma de esta tirada sea igual a la anterior o bien igual a 7, en otro caso pierde.**

El programa esta en Dados.java
