# Ejercicios Capitulo 2

### **1. ¿Cuántos tipos de datos hay para representar números enteros? ¿En qué difieren?**

Hay 8 tipos de datos que son: byte, short, int, long, float, double, char, boolean y difieren en el espacio en la memoria que ocupa cada uno, por ejemplo, byte es un entero de 8 bits y se diferencia del tipo short porque este tiene 16 bits

### **2. ¿Cuál es el objetivo de una declaración?**

el objetivo es que el compilador reserve un espacio para cada uno de los datos y para que se puedan manipular en el programa

### **3. Si se tiene la declaración `final int UNO = 1;` ¿es posible tener la siguiente instrucción `int negativo = -UNO;`?**

No, no es posible porque al declarar final quiere decir que no es una variable, es una constante, es decir, su valor no puede cambiar, al declarar int negativo = -UNO; va a dar error porque una constante final no se puede manipular


### **4. Indicar tres formas distintas de incrementar en 1 el valor de una variable.**

- `x = x + 1;`
- `x += 1;`
- `x++;`


### **5. ¿Es correcta la siguiente línea de código? ¿Por qué?**  
   `int posición // Indica la posición del objeto ;`

No es correcta porque le falta el punto y coma (`;`) al final de la instrucción. El punto y coma es necesario para que compile correctamente. La forma correcta sería:  
`int posición;`

### **6. ¿Existe alguna diferencia entre tener `bancario` y `"bancario"`?**

Sí, hay una diferencia importante. `"bancario"` (entre comillas) es una cadena de texto (tipo `String`), y se puede imprimir o usar como texto literal en el programa. En cambio, `bancario` (sin comillas) se interpreta como un identificador, es decir, el nombre de una variable, constante o clase. Si no ha sido declarado previamente, causará un error de compilación.

### **7. ¿Cuáles de las siguientes cadenas no pueden ser identificadores en Java? ¿Por qué?**
- a) `java.awt.Graphics` | ❌ No. Es un nombre de paquete/clase, no un identificador simple. Además, contiene puntos (`.`), que no están permitidos en identificadores.
- b) `rayos-x` | ❌ No. El guion medio (`-`) no está permitido en los identificadores.
- c) `_123` | ✅ Sí. Aunque no es recomendable usar solo guiones bajos y números, es válido.
- d) `valor calculado` | ❌ No. Los espacios en blanco no están permitidos en los identificadores.
- e) `valorCalculado` | ✅ Sí. Es un identificador válido con estilo camelCase.
- f) `void` | ❌ No. Es una palabra reservada del lenguaje.
- g) `Void` | ✅ Sí. Aunque empieza con mayúscula, no es una palabra reservada. De hecho, es el nombre de una clase en Java.
- h) `2dias` | ❌ No. Los identificadores no pueden empezar con un número.
- i) `segundaBase` | ✅ Sí. Es un identificador válido.
- j) `x` | ✅ Sí. Es un identificador válido, aunque corto.


### **8. ¿Es verdadero o falso que en Java `1/3` es distinto de `1.0/3.0`? ¿Por qué?**

si, porque los valores 1 y 3 en la primera expresion son valores ENTEROS, y 1.0 y 3.0 son valores double porque tienen decimal

### **9. ¿Cuándo es verdadera la siguiente ecuación `(a/b)*b + (a%b) == a`?**

Es verdadera siempre que `b ≠ 0`. Esto se debe a que en Java, como en matemáticas, para enteros `a` y `b`, se cumple que:

\[
a = (a / b) * b + (a \% b)
\]

Es decir, el cociente por el divisor más el residuo da como resultado el número original. Si `b = 0`, la operación no es válida porque no se puede dividir entre cero.

### **10. Dadas las siguientes declaraciones:**
    ```java
    int x, y;
    float z = 3.1313f;
    double w = 3.1212;
    boolean verdad = true;
    long l = 45L, m;
    ```
    Evaluar las siguientes expresiones (justificar si no es posible):

    - a) x = 6; | si, porque 6 es int
    - b) y = 1000; | si, porque 1000 es int
    - c) y = 2.33333; | no, porque 2.3 es un tipo double
    - d) 25++; | No. No se puede hacer incremento a una constante. Solo se puede hacer ++ a una variable, no a un número literal.
    - e) w = 175,000; | No. En Java no se permiten comas para separar los miles en números. Debería ser 175000.
    - f) verdad = 1; | no, boolean solo acepta true o false
    - g) z = 3.1416; | No directamente. 3.1416 es double, y z es float. Deberías escribir: z = 3.1416f; o hacer cast.
    - h) m = x * 250; | si, porque 250 y x son del mismo tipo
    - i) (x+y)++; | No. No se puede aplicar ++ a una expresión como (x+y). Solo se puede usar ++ en variables.
    - j) y = 1; | si




### **11. Reescribir usando asignación combinada:**
    - a) `x = x + 3*y;` | Se puede reescribir como: `x += 3*y;`

    - b) `x = -b + x + 87;` | No se puede reescribir fácilmente con asignación combinada, porque `x` no está justo como `x + ...` o `x * ...`. El orden y los signos afectan.

    - c) `x = x * y -10;` | No se puede reescribir directamente con asignación combinada porque no es exactamente `x = x * algo`. Hay una resta al final. Aunque se puede descomponer, no sería una asignación combinada directa.

    - d) `x = (3-y) * x;` | No. El valor `x` está **al final**, no se repite como `x = x * algo`. Así que no aplica asignación combinada.

    - e) `x = (3-y) / x;` | Tampoco. `x` está en el denominador. No es posible usar asignación combinada con esa forma.


### **12. ¿Qué valor tiene `complejo` después de ejecutar?**
    ```java
    final int FACTOR = 10;
    int a = 1;
    int b = 2;
    int complejo = a + b * 3 - a * b + 3;
    ```

    el valor final es 8


### **13. ¿Qué valores tienen `c` y `d` después de ejecutar?**
    ```java
    final int FACTOR = 10;
    int a = 4;
    int b = 6;
    int c = (a + b) * FACTOR;
    int d = a + b * FACTOR;
    ```
    c = 100 y d = 64

### **14. Para convertir un valor `val` entre 0-10 a 0-100, ¿cuál instrucción es correcta?**
    - `double calculado = (val /10) * 100;`
    - `double calculado = (val /100) * 10;`


### **15. Escribir en Java:**
    - a) $a^3(a + 1)(a - 7)$
    - b) $\frac{1}{1+x^2}$
    - c) $q = \left( \frac{t_1 \times t_2}{d - k} \right) + t_2$


### **16. Definir constantes/variables para:**
    - a) Lado de cuadrado (4.5m)
    - b) Cien metros
    - c) Número de llantas de bicicleta
    - d) Número primo
    - e) Raíz cuadrada de 2
    - f) Signo de interrogación
    - g) Área de un cuadrado


### **17. Expresión para calcular costo de gasolina ($7.50/litro) por `n` litros.**

