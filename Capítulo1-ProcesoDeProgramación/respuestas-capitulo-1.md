### Ejercicios del Capítulo 1  

---

#### **1. ¿Qué ventajas tiene hacer un diseño antes de codificar?**  
**Respuesta:**  
La ventaja principal es que permite trazar un plan claro, definiendo **qué** se va a hacer, **cómo** se hará y estableciendo una estructura básica. Esto mejora la organización y evita improvisaciones durante la codificación.  

---

#### **2. ¿Cuáles son los tres pasos en la metodología de diseño?**  
**Respuesta:**  
1. **Encontrar los objetos principales** (sustantivos en la descripción del problema).  
2. **Identificar el comportamiento deseado** (responsabilidades de las clases, usando verbos).  
3. **Determinar la colaboración entre objetos** mediante escenarios.  
*(Referencia: páginas 7-9 del PDF)*.  

---

#### **3. ¿Qué es una clase?**  
**Respuesta:**  
Es un **molde** a partir del cual se crean objetos, definiendo su estructura (atributos) y comportamiento (métodos).  
*(Cita textual: página 5 del PDF)*.  

---

#### **4. ¿Cuál es la relación entre clase y objeto?**  
**Respuesta:**  
- **Clase:** Molde abstracto que define propiedades y acciones.  
- **Objeto:** Instancia concreta de una clase, con un estado único.  
Ejemplo: La clase `Auto` define atributos como `motor`; un objeto sería `autoDeJuan` con valores específicos.  

---

#### **5. Dar tres ejemplos de clases y un par de objetos de cada clase.**  
**Respuesta:**  
| **Clase**       | **Objetos**               |  
|-----------------|---------------------------|  
| `Auto`          | `motorV8`, `llantasMichelin` |  
| `Laptop`        | `pantallaHD`, `tecladoRGB`   |  
| `EstadioFútbol` | `butacaA1`, `porteríaNorte`  |  

**Explicación:** Los objetos dan funcionalidad a la clase. Por ejemplo, un `Auto` sin `motor` no puede funcionar.  

---

#### **6. ¿La estructura y el estado de dos objetos de la misma clase son siempre iguales? ¿Por qué?**  
**Respuesta:**  
No. La **estructura** (atributos) es idéntica, pero el **estado** (valores de los atributos) varía. Ejemplo: Dos objetos `Contacto` tienen los mismos atributos (`nombre`, `teléfono`), pero uno puede ser `nombre: "Ana"` y otro `nombre: "Carlos"`.  

---

#### **7. ¿Cuál es la importancia del *bytecode* de Java?**  
**Respuesta:**  
El *bytecode* es el código intermedio que genera el compilador de Java. Permite que los programas sean **portables** y ejecutables en cualquier dispositivo con una JVM, sin recompilación.  

---

#### **8. ¿Qué significa que un programa sea portable?**  
**Respuesta:**  
Que puede ejecutarse en diferentes sistemas operativos o hardware **sin modificaciones**, gracias a la JVM.  

---

#### **9. ¿Cuál es el objetivo de la JVM?**  
**Respuesta:**  
Ejecutar programas Java interpretando el *bytecode*, actuando como una capa entre el código y el sistema operativo.  

---

#### **10. ¿Cómo se ejecuta un programa originalmente escrito en Java?**  
**Respuesta:**  
1. Se compila a *bytecode* (archivo `.class`).  
2. La JVM interpreta y ejecuta el *bytecode*.  

---

#### **11. ¿Qué es un paquete en Java?**  
**Respuesta:**  
Un conjunto de clases e interfaces agrupadas por funcionalidad (ejemplo: `java.io` para entrada/salida).  

---

#### **12. ¿Qué tipo de errores se pueden tener en un programa?**  
**Respuesta:**  
- **Errores de sintaxis:** Violan reglas del lenguaje.  
- **Errores de ligado:** Faltan bibliotecas o clases.  
- **Errores de lógica:** El programa no hace lo esperado.  

---

#### **13. ¿Cómo se pueden detectar los errores en la lógica del programa?**  
**Respuesta:**  
Mediante **pruebas de escritorio**: simular la ejecución línea por línea con datos de ejemplo, o imprimir valores intermedios para verificar el flujo.  

---

#### **14. Especificar los tipos de mantenimiento que existen.**  
**Respuesta:**  
- **Correctivo:** Corrige errores post-implementación.  
- **Adaptativo:** Añade funcionalidades o ajusta el programa a nuevos requerimientos.  

---

### **15. ¿Cuál es el propósito de la documentación y en qué momento se hace?**

El propósito de la documentación es llevar un seguimiento y un orden en el código, para que tanto el programador como otros usuarios puedan entenderlo perfectamente.  
Se realiza desde que se empieza a escribir el código, siguiendo una cronología y un plan de acción.

---

### **16. ¿Definir estructura y comportamiento para objetos de las siguientes clases?**

---

#### **Clase Alumno**

**Estructura (Atributos):**
```java
final int numeroDeCuenta;  // Entero único e inmutable (ej: 20230001)
final String nombre;       // Cadena de caracteres (ej: "María López")
double promedio;           // Decimal para cálculos dinámicos (ej: 8.5)
```

**Comportamiento (Métodos):**
- `calcularPromedio()`: Actualiza el promedio basado en calificaciones.  
- `mostrarDatos()`: Imprime nombre, número de cuenta y promedio.

**Explicación:**
- `numeroDeCuenta` y `nombre` son `final` porque son datos invariables.  
- `promedio` es `double` para precisión en cálculos matemáticos.

---

#### **Clase Automóvil**

**Estructura (Atributos):**
```java
double kilometraje;         // Decimal para registrar km exactos (ej: 15230.7)
final String nombreModelo;  // Cadena inmutable (ej: "Toyota Corolla")
double precio;              // Decimal para ajustes monetarios (ej: 250000.50)
final String placa;         // Identificador único (ej: "ABC-1234")
final int añoFabricacion;   // Entero inmutable (ej: 2020)
```

**Comportamiento (Métodos):**
- `actualizarPrecio()`: Recalcula el precio según depreciación o mercado.  
- `mostrarEspecificaciones()`: Muestra modelo, año y kilometraje.

**Explicación:**
- `kilometraje` y `precio` son `double` para manejar valores fraccionarios.  
- `placa` es `String` porque puede incluir letras y guiones.

---

#### **Clase Cuenta Bancaria**

**Estructura (Atributos):**
```java
final String numeroCuenta;  // Ej: "ES76 0123 4567 8901 2345 6789"
String titular;             // Puede cambiar por traspaso
double saldo;               // Decimal para transacciones (ej: 1500.75)
```

**Comportamiento (Métodos):**
- `depositar(double monto)`: Aumenta el saldo.  
- `retirar(double monto)`: Reduce el saldo (con validación).

---

#### **Clase Teléfono Celular**

**Estructura (Atributos):**
```java
final String IMEI;          // Identificador único (ej: "490154203237518")
String modelo;              // Ej: "iPhone 15"
int almacenamientoGB;       // Entero (ej: 256)
double bateriaPorcentaje;   // Decimal para precisión (ej: 87.5)
```

**Comportamiento (Métodos):**
- `cargarBateria()`: Incrementa `bateriaPorcentaje`.  
- `usarAplicacion()`: Reduce `bateriaPorcentaje`.

---

#### **Clase Computadora**

**Estructura (Atributos):**
```java
final String serie;         // Ej: "MXK123456"
String sistemaOperativo;    // Ej: "Windows 11"
int ramGB;                  // Entero (ej: 16)
double temperaturaCPU;      // Decimal (ej: 65.3)
```

**Comportamiento (Métodos):**
- `ejecutarPrograma()`: Consume RAM y aumenta temperatura.  
- `apagar()`: Reinicia atributos dinámicos.

---




#### **Problemas Prácticos**  
17. Utilizando la metodología presentada, escribir un algoritmo para el funcionamiento de una caja de una máquina de refrescos.  

18. **Casa de Cambio**:  
   - Definir la estructura de la clase `Moneda` para un programa que controle transacciones diarias en diferentes divisas.  

19. **Juego de Dados**:  
   - Identificar una clase necesaria para el juego (ej. `Dado` o `Jugador`) y definir su estructura y comportamiento.  

20. Escribir el escenario principal (algoritmo) para el juego de dados descrito en el ejercicio 19.  