# Curso_java_SE

## Archivos .JAR
Los archivos JAR (Java Archive) son archivos de Java con el código compilado de los archivos .class y comprimido con el formato ZIP para que más adelante sean interpretados y ejecutados por la máquina virtual de Java (JVM).

Para generar estos archivos podemos entrar a File > Project Structure > Artifacts y seleccionar la opción de JAR > From modules with dependencies. Luego de esto podemos compilar nuestro proyecto desde Build > Build Artifacts > Build y podremos nuestros archivos ejecutables en la carpeta out/artifacts/.

## Para que sirven las funciones?

Las funciones en Java, también conocidas como métodos, desempeñan un papel fundamental en la programación orientada a objetos. Aquí hay algunas funciones clave de las funciones en Java:

1. **Reutilización de código:** Las funciones permiten definir un bloque de código que puede ser reutilizado en diferentes partes de un programa. Esto promueve la modularidad y facilita la actualización y mantenimiento del código.

2. **Abstracción:** Las funciones permiten abstraer detalles complejos dentro de un bloque de código. Los detalles de implementación se encapsulan en la función, y el resto del programa solo necesita conocer cómo usar la función, no cómo funciona internamente.

3. **Organización del código:** Las funciones ayudan a organizar el código de manera más estructurada y legible. Cada función puede realizar una tarea específica, lo que facilita la comprensión del programa en su conjunto.

4. **Facilita la depuración:** Si se produce un error, las funciones permiten aislar y depurar partes específicas del código sin afectar al resto del programa. Esto facilita la identificación y corrección de problemas.

5. **Encapsulamiento:** Las funciones permiten encapsular la lógica relacionada en un solo lugar. Esto contribuye a la creación de código más cohesivo y menos propenso a errores.

6. **Mejora del rendimiento:** Al dividir un programa en funciones más pequeñas y especializadas, es posible optimizar el rendimiento de cada función por separado. Además, las funciones pueden ejecutarse solo cuando se llaman, lo que puede mejorar la eficiencia general del programa.

7. **Manejo de parámetros:** Las funciones pueden aceptar parámetros, lo que les permite recibir información externa y realizar operaciones basadas en esos datos. Esto hace que las funciones sean flexibles y adaptables a diferentes situaciones.

8. **Retorno de valores:** Las funciones pueden devolver un valor después de realizar ciertas operaciones. Esto es útil para obtener resultados de una función y utilizarlos en otras partes del programa.

Aquí hay un ejemplo simple de una función en Java:

```java
public class EjemploFuncion {
    public static void main(String[] args) {
        // Llamada a la función
        int resultado = suma(5, 3);
        System.out.println("La suma es: " + resultado);
    }

    /** Definición de la función
     * public = Mod. Acceso
     * int = Valor regreso
     * suma = Nombre de Funcion
     * (int a, int b) = argumentos de entrada
     * static = Solo aplica para metodos que comparten el metodo 
     * main, para todo lo demas no es necesario
     * */
    public static int suma(int a, int b) {
        return a + b;
    }
}
```

En este ejemplo, la función `suma` toma dos parámetros (enteros `a` y `b`) y devuelve la suma de esos dos valores. La función se llama desde el método `main`, demostrando cómo se pueden usar funciones para modularizar el código.

## Tags Java Docs

![tags](/img/Tags.png)


## Diferencia entre `while` y `do-while` en Java


En Java, tanto `while` como `do-while` son estructuras de control utilizadas para la repetición de bloques de código. Sin embargo, existe una diferencia clave entre ellas.

**Estructura while:**
La estructura `while` evalúa la condición antes de ejecutar el bloque de código. Si la condición es falsa desde el principio, el bloque de código no se ejecutará en absoluto. Esto significa que la ejecución del bloque está condicionada a que la expresión booleana sea verdadera desde el principio.

```java
while (condicion) {
    // Código a ejecutar
}
```

**Estructura do-while:**
Por otro lado, la estructura `do-while` ejecuta el bloque de código al menos una vez antes de evaluar la condición. Esto garantiza que el bloque de código se ejecute al menos una vez, incluso si la condición es falsa desde el principio. Después de la primera ejecución, la condición se verifica y, si es verdadera, el bucle continuará ejecutándose.

```java
do {
    // Código a ejecutar
} while (condicion);
```

**¿Cuándo usar cada uno?**
- Usa `while` cuando quieras que el bloque de código se ejecute solo si la condición es verdadera desde el principio.

- Utiliza `do-while` cuando necesites que el bloque de código se ejecute al menos una vez, independientemente de la condición, y luego continúe ejecutándose siempre que la condición sea verdadera.

Ambas estructuras son herramientas poderosas que brindan flexibilidad en la implementación de bucles en Java, y la elección entre `while` y `do-while` depende de los requisitos específicos de tu programa.

## Arrays en Java

En Java, los Arrays son estructuras de datos que nos permiten almacenar y acceder a múltiples valores del mismo tipo en una sola variable. Estos son fundamentales para muchos programas, proporcionando una forma eficiente de organizar y manipular datos.

**Características clave de Arrays en Java:**
1. **Tipo de Datos Homogéneo:** Todos los elementos en un Array deben ser del mismo tipo de datos, ya sea int, double, String, u otros.

2. **Tamaño Fijo:** La longitud de un Array se establece al momento de su creación y no puede cambiar durante la ejecución del programa.

3. **Índices:** Los elementos en un Array se acceden mediante índices, que comienzan en 0 para el primer elemento.

**Ejemplo de Declaración y Uso de un Array en Java:**
```java
public class EjemploArrays {
    public static void main(String[] args) {
        // Declaración e inicialización de un Array de enteros
        int[] numeros = {1, 2, 3, 4, 5};

        // Acceso y modificación de elementos
        System.out.println("Primer elemento: " + numeros[0]);
        numeros[2] = 10;

        // Iteración a través del Array
        System.out.println("Elementos del Array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
```

En este ejemplo, se declara un Array de enteros llamado `numeros` y se inicializa con algunos valores. Luego, se accede y modifica elementos mediante índices, y se itera a través del Array utilizando un bucle for. Los Arrays en Java ofrecen versatilidad y son esenciales para una programación eficiente y organizada.

**Ejemplo mas avanzado**

Supongamos que queremos representar información sobre libros:

```java
public class Libro {
    // Atributos de la clase Libro
    private String titulo;
    private String autor;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Método para obtener el título del libro
    public String getTitulo() {
        return titulo;
    }

    // Método para obtener el autor del libro
    public String getAutor() {
        return autor;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Creación de un Array de objetos Libro
        Libro[] biblioteca = new Libro[3];

        // Inicialización de los elementos del Array
        biblioteca[0] = new Libro("El Señor de los Anillos", "J.R.R. Tolkien");
        biblioteca[1] = new Libro("Cien años de soledad", "Gabriel García Márquez");
        biblioteca[2] = new Libro("1984", "George Orwell");

        // Iteración a través del Array de objetos Libro
        System.out.println("Biblioteca:");
        for (Libro libro : biblioteca) {
            System.out.println(libro);
        }
    }
}
```

En este ejemplo:

- Se define una clase `Libro` con atributos como `titulo` y `autor`, un constructor para inicializar esos atributos y métodos getter para acceder a ellos.

- Se crea un Array de objetos `Libro` llamado `biblioteca` con una longitud de 3.

- Se inicializan los elementos del Array con instancias de la clase `Libro`.

- Se utiliza un bucle for-each para iterar a través del Array y mostrar la información de cada libro.

Este ejemplo demuestra cómo los Arrays en Java pueden contener objetos complejos, lo que proporciona flexibilidad para trabajar con datos estructurados.
