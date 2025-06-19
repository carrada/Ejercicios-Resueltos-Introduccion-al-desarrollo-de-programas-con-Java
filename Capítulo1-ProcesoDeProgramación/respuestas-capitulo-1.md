### Ejercicios del Capítulo 1  

---

### **1. ¿Qué ventajas tiene hacer un diseño antes de codificar?**  
**Respuesta:**  
La ventaja principal es que permite trazar un plan claro, definiendo **qué** se va a hacer, **cómo** se hará y estableciendo una estructura básica. Esto mejora la organización y evita improvisaciones durante la codificación.  

---

### **2. ¿Cuáles son los tres pasos en la metodología de diseño?**  
**Respuesta:**  
1. **Encontrar los objetos principales** (sustantivos en la descripción del problema).  
2. **Identificar el comportamiento deseado** (responsabilidades de las clases, usando verbos).  
3. **Determinar la colaboración entre objetos** mediante escenarios.  
*(Referencia: páginas 7-9 del PDF)*.  

---

### **3. ¿Qué es una clase?**  
**Respuesta:**  
Es un **molde** a partir del cual se crean objetos, definiendo su estructura (atributos) y comportamiento (métodos).  
*(Cita textual: página 5 del PDF)*.  

---

### **4. ¿Cuál es la relación entre clase y objeto?**  
**Respuesta:**  
- **Clase:** Molde abstracto que define propiedades y acciones.  
- **Objeto:** Instancia concreta de una clase, con un estado único.  
Ejemplo: La clase `Auto` define atributos como `motor`; un objeto sería `autoDeJuan` con valores específicos.  

---

### **5. Dar tres ejemplos de clases y un par de objetos de cada clase.**  
**Respuesta:**  
| **Clase**       | **Objetos**               |  
|-----------------|---------------------------|  
| `Auto`          | `motorV8`, `llantasMichelin` |  
| `Laptop`        | `pantallaHD`, `tecladoRGB`   |  
| `EstadioFútbol` | `butacaA1`, `porteríaNorte`  |  

**Explicación:** Los objetos dan funcionalidad a la clase. Por ejemplo, un `Auto` sin `motor` no puede funcionar.  

---

### **6. ¿La estructura y el estado de dos objetos de la misma clase son siempre iguales? ¿Por qué?**  
**Respuesta:**  
No. La **estructura** (atributos) es idéntica, pero el **estado** (valores de los atributos) varía. Ejemplo: Dos objetos `Contacto` tienen los mismos atributos (`nombre`, `teléfono`), pero uno puede ser `nombre: "Ana"` y otro `nombre: "Carlos"`.  

---

### **7. ¿Cuál es la importancia del *bytecode* de Java?**  
**Respuesta:**  
El *bytecode* es el código intermedio que genera el compilador de Java. Permite que los programas sean **portables** y ejecutables en cualquier dispositivo con una JVM, sin recompilación.  

---

### **8. ¿Qué significa que un programa sea portable?**  
**Respuesta:**  
Que puede ejecutarse en diferentes sistemas operativos o hardware **sin modificaciones**, gracias a la JVM.  

---

### **9. ¿Cuál es el objetivo de la JVM?**  
**Respuesta:**  
Ejecutar programas Java interpretando el *bytecode*, actuando como una capa entre el código y el sistema operativo.  

---

### **10. ¿Cómo se ejecuta un programa originalmente escrito en Java?**  
**Respuesta:**  
1. Se compila a *bytecode* (archivo `.class`).  
2. La JVM interpreta y ejecuta el *bytecode*.  

---

### **11. ¿Qué es un paquete en Java?**  
**Respuesta:**  
Un conjunto de clases e interfaces agrupadas por funcionalidad (ejemplo: `java.io` para entrada/salida).  

---

### **12. ¿Qué tipo de errores se pueden tener en un programa?**  
**Respuesta:**  
- **Errores de sintaxis:** Violan reglas del lenguaje.  
- **Errores de ligado:** Faltan bibliotecas o clases.  
- **Errores de lógica:** El programa no hace lo esperado.  

---

### **13. ¿Cómo se pueden detectar los errores en la lógica del programa?**  
**Respuesta:**  
Mediante **pruebas de escritorio**: simular la ejecución línea por línea con datos de ejemplo, o imprimir valores intermedios para verificar el flujo.  

---

### **14. Especificar los tipos de mantenimiento que existen.**  
**Respuesta:**  
- **Correctivo:** Corrige errores post-implementación.  
- **Adaptativo:** Añade funcionalidades o ajusta el programa a nuevos requerimientos.  

---

### **15. ¿Cuál es el propósito de la documentación y en qué momento se hace?**

El propósito de la documentación es llevar un seguimiento y un orden en el código, para que tanto el programador como otros usuarios puedan entenderlo perfectamente.  
Se realiza desde que se empieza a escribir el código, siguiendo una cronología y un plan de acción.

---

### **16. ¿Definir estructura y comportamiento para objetos de las siguientes clases?**

--

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


###  17. Utilizando la metodología presentada, escribir un algoritmo para el funcionamiento de una caja de una máquina de refrescos.  


Para empezar necesitamos encontrar sustantivos que serviran para definir las clases, podríamos definir clases como Máquina, que representa toda la lógica del sistema; Caja, encargada del manejo de dinero; Refresco y Producto, que modelan lo que se vende; Usuario, que representa al cliente que interactúa con la máquina; Transacción, para registrar cada compra; Inventario, que controla las existencias; Pantalla y Botón, como interfaces físicas de interacción; Ranura, donde se inserta el dinero; Moneda y Billete, como tipos de dinero; Cambio, que modela el vuelto que se entrega; Mensaje, que comunica acciones al usuario; Opción y Selección, para representar elecciones del cliente; Precio, como parte del producto; Estado, que indica en qué parte del proceso está la máquina; Reembolso, por si se devuelve el dinero; y Error, para manejar situaciones inesperadas.


Despues vamos a encontrar los verbos de la descripcion del problema, para empezar en el funcionamiento de la caja de una máquina de refrescos, el usuario puede introducir dinero en la ranura, y la máquina debe actualizar el saldo disponible. Luego puede mostrar las opciones disponibles para que el cliente haga una selección. La máquina debe verificar si el saldo es suficiente para cubrir el precio del producto. Si lo es, procede a realizar la transacción, entregar el refresco y devolver el cambio si aplica.

los verbos que identifique fueron: introducir, actualizar, mostrar, hacer, verificar, es, realizar, entregar, devolver, aplica.

Ahora para terminar hay que determinar la colaboración entre objetos mediante escenarios

#### Escenario: Compra exitosa de un refresco

#### Objetivo
El usuario compra un refresco insertando dinero exacto y seleccionando el producto.

#### Colaboración entre objetos

El **Usuario** introduce dinero en la **Ranura**, la cual lo envía a la **Caja**. La **Caja** actualiza el saldo interno y notifica el nuevo monto disponible a la **Pantalla**, que muestra las opciones de productos con sus precios. Luego, el **Usuario** hace una selección desde la **Pantalla** (o mediante un **Botón**). La **Máquina** recibe esa selección y consulta al **Inventario** si el producto está disponible, y a la **Caja** si el saldo es suficiente. Si todo es correcto, la **Caja** autoriza la operación y la **Máquina** realiza la transacción. Entonces, el **Producto** es entregado al **Usuario** y la **Caja** calcula y devuelve el cambio si aplica. Finalmente, la **Pantalla** muestra un mensaje de agradecimiento o confirmación de la compra.

#### Resumen de colaboraciones

- **Usuario** → **Ranura**, **Pantalla**
- **Ranura** → **Caja**
- **Caja** → **Pantalla**, **Máquina**, **Transacción**
- **Máquina** → **Inventario**, **Caja**, **Producto**, **Transacción**
- **Pantalla** → **Usuario**

---

### 18. ¿Cómo sería el diseño de una clase Moneda para una casa de cambio? Una casa de cambio requiere un programa para llevar control de sus transacciones diarias y así saber cuánto en billetes y monedas de cada divisa (dólares, dólares canadienses, pesos, euros, libras, coronas, etc.) tener cada día para cubrir la demanda. Como primer paso de la metodología de diseño, se deben identificar los objetos requeridos. Suponiendo que se necesita una clase Moneda, defina la estructura de dicha clase según el segundo paso de la metodología. 


```java
public class Moneda {
    // Atributos
    final String codigo;      // Código ISO de la moneda (ej: "USD", "EUR")
    final String nombre;      // Nombre completo (ej: "Dólar Estadounidense")
    double tipoCambio;        // Valor de cambio respecto a la moneda base
    int cantidadDisponible;   // Billetes/monedas físicos disponibles
    
    // Constructor
    public Moneda(String codigo, String nombre, double tipoCambio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipoCambio = tipoCambio;
        this.cantidadDisponible = cantidad;
    }
    
    // Métodos clave
    public void actualizarTipoCambio(double nuevoCambio) {
        this.tipoCambio = nuevoCambio;
    }
    
    public void registrarTransaccion(int cantidadOperada) {
        this.cantidadDisponible += cantidadOperada;
    }
    
    public double convertir(double monto, Moneda destino) {
        return monto * (this.tipoCambio / destino.tipoCambio);
    }
}
```

#### Atributos

| Atributo           | Tipo    | Ejemplo        | Descripción                                           |
|--------------------|---------|----------------|-------------------------------------------------------|
| codigo             | String  | "USD", "MXN"   | Identificador ISO de 3 letras - final porque no cambia|
| nombre             | String  | "Euro"         | Nombre descriptivo - final                            |
| tipoCambio         | double  | 20.50          | Valor fluctuante respecto a moneda base               |
| cantidadDisponible | int     | 150            | Stock físico en caja                                   |

#### Métodos

**actualizarTipoCambio**  
→ Actualiza el valor de conversión cuando hay fluctuaciones del mercado.

**registrarTransaccion**  
→ Modifica el inventario al comprar/vender divisas.  
cantidadOperada es positivo para depósitos, negativo para retiros.

**convertir**  
→ Lógica para convertir un monto entre monedas según tipo de cambio.





19. **Juego de Dados**:  
   - Identificar una clase necesaria para el juego (ej. `Dado` o `Jugador`) y definir su estructura y comportamiento.  

20. Escribir el escenario principal (algoritmo) para el juego de dados descrito en el ejercicio 19.  