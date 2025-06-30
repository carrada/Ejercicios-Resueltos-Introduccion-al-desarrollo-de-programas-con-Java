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

### **7. ¿Cuáles de las siguientes cadenas no pueden ser identificadores en Java? ¿Por qué?**
   - a) `java.awt.Graphics`
   - b) `rayos-x`
   - c) `_123`
   - d) `valor calculado`
   - e) `valorCalculado`
   - f) `void`
   - g) `Void`
   - h) `2dias`
   - i) `segundaBase`
   - j) `x`


### **8. ¿Es verdadero o falso que en Java `1/3` es distinto de `1.0/3.0`? ¿Por qué?**


### **9. ¿Cuándo es verdadera la siguiente ecuación `(a/b)*b + (a%b) == a`?**


### **10. Dadas las siguientes declaraciones:**
    ```java
    int x, y;
    float z = 3.1313f;
    double w = 3.1212;
    boolean verdad = true;
    long l = 45L, m;
    ```
    Evaluar las siguientes expresiones (justificar si no es posible):
    - a) `x = 6;`
    - b) `y = 1000;`
    - c) `y = 2.33333;`
    - d) `25++;`
    - e) `w = 175,000;`
    - f) `verdad = 1;`
    - g) `z = 3.1416;`
    - h) `m = x * 250;`
    - i) `(x+y)++;`
    - j) `y = 1;`

### **11. Reescribir usando asignación combinada:**
    - a) `x = x + 3*y;`
    - b) `x = -b + x + 87;`
    - c) `x = x * y -10;`
    - d) `x = (3-y) * x;`
    - e) `x = (3-y) / x;`


### **12. ¿Qué valor tiene `complejo` después de ejecutar?**
    ```java
    final int FACTOR = 10;
    int a = 1;
    int b = 2;
    int complejo = a + b * 3 - a * b + 3;
    ```


### **13. ¿Qué valores tienen `c` y `d` después de ejecutar?**
    ```java
    final int FACTOR = 10;
    int a = 4;
    int b = 6;
    int c = (a + b) * FACTOR;
    int d = a + b * FACTOR;
    ```

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

