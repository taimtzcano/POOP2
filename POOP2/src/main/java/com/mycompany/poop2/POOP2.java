/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop2;

/**
 *
 * @author tania
 */
public class POOP2 {

     public static void main(String[] args) {
        System.out.println("Hola mundo"); //Se imprime un hola mundo
        System.err.println("Hola mundo");
        
        System.out.println("############## if ##############");
        int a; //Se declara una variable a de tipo entera
        a = 15; //La variable a de valor 15
        int b = 10; //Una variable b de tipo entero con un valor de 10
        if (a<b) { //Si a es menor a b, realizar
            System.out.println("a es menor que b"); //Imprimir
        } else if (a==b){ //Si a es igual a b realizar
            System.out.println("a es igual a b"); //Imprimir
        }else{
            System.out.println("a es mayor que b"); //Imprimir
        }
        System.out.println("############## if ##############");
        if(menor(a,b)){
            System.out.println("metodo menor retorna true");
        }else{
            System.out.println("metodo menor retorna false");
        }
        
        System.out.println("############## Switch ##############");
        int dia = 1; //Declaracion de una variable dia de tipo entera con valor 1
        switch (dia) { //Indicamos que queremos evaluar el valor de la variable dia para determinar qué caso se ejecutará a continuación.
            case 1: 
                System.out.println("Domingo"); //Si el valor de la variable dia es igual a 1, se ejecutará este bloque de código.
                break;
            case 2: System.out.println("Lunes"); break; //Si el valor de la variable dia es igual a 2, se ejecutará este bloque de código.
            case 3: System.out.println("Martes"); break; //Si el valor de la variable dia es igual a 3, se ejecutará este bloque de código.
            case 4: System.out.println("Miercoles"); break; //Si el valor de la variable dia es igual a 4, se ejecutará este bloque de código.
            case 5: System.out.println("Jueves"); break; //Si el valor de la variable dia es igual a 5, se ejecutará este bloque de código.
            case 6: System.out.println("Viernes"); break; //Si el valor de la variable dia es igual a 6, se ejecutará este bloque de código.
            case 7: System.out.println("Sabado"); break; //Si el valor de la variable dia es igual a 7, se ejecutará este bloque de código.
            default:
                System.out.println("Día incorrecto"); //Este es el caso por defecto. Si el valor de dia no coincide con ninguno de los casos anteriores, se ejecutará este bloque de código. Imprimirá "Día incorrecto" en la consola.
        }
        System.out.println("############## Switch ##############");
        char vocal = '9'; //Declaracion de variable vocal de tipo char que se le asigna el valor 9
        switch (vocal) { //Aquí comenzamos la estructura de control switch. Indicamos que queremos evaluar el valor de la variable vocal para determinar qué caso se ejecutará
            case 'a': System.out.println("Seleccionó vocal a"); break; //Si el valor de la variable vocal es igual a 'a', se ejecutará este bloque de código
            case 'e': System.out.println("Seleccionó vocal e"); break; //Si el valor de la variable vocal es igual a 'e', se ejecutará este bloque de código 
            case 'i': System.out.println("Seleccionó vocal i"); break; //Si el valor de la variable vocal es igual a 'i', se ejecutará este bloque de código 
            case 'o': System.out.println("Seleccionó vocal o"); break; //Si el valor de la variable vocal es igual a 'o', se ejecutará este bloque de código 
            case 'u': System.out.println("Seleccionó vocal u"); break; //Si el valor de la variable vocal es igual a 'u', se ejecutará este bloque de código 
            default:
                System.out.println("No se seleccionó una vocal"); //Si el valor de vocal no coincide con ninguna de las vocales 'a', 'e', 'i', 'o' o 'u', se ejecutará este bloque de código. Imprimirá "No se seleccionó una vocal" en la consola
        }
        System.out.println("############## While ##############");
        int n=0; //Declaracion de variable n de tipo entero con valor 0
        while (n<10) { //Aquí comienza el primer bucle while. La condición entre paréntesis n < 10 indica que este bucle se ejecutará mientras el valor de n sea menor que 10
            System.out.println("Contando hacia arriba n="+n); 
            n++; //Se incre,menta el vaor de n en cada iteracion del bucleutilizando el operador ++
        }
        while (n>0) { //Aquí comienza el segundo bucle while. La condición n > 0 indica que este bucle se ejecutará mientras el valor de n sea mayor que 0
            System.out.println("Contando hacia abajo n="+n); //se imprime en la consola un mensaje que muestra el valor actual de n mientras se cuenta hacia abajo
            n--; //En cada iteracion del segundo bucle, sedecrementa el valor de n en 1, utilizano el operador --
        }
        System.out.println("n="+n); //se imprime en la consola un mensaje que muestra el valor actual de n mientras se cuenta hacia abajo
        
        System.out.println("############## Do-While ##############");
        do {            
            System.out.println("Contando hacia abajo");
            n--; //Hay un decremento de uno en uno
        } while (n>0); //Se debe cumplir este while con condicion n>0
        System.out.println("n="+n); //Se imprime n con su valor
        
        System.out.println("############## For ##############");
        for (int i = 0; i < 10; i++) { //Aquí comienza el primer bucle for. En la declaración del bucle for, se inicializa una variable i de tipo entero con el valor 0. La condición i < 10 indica que el bucle se ejecutará mientras i sea menor que 10. En cada iteración, se incrementa i en 1 mediante i++
            System.out.println("Contando hacia arriba "+i);  //se imprime en la consola un mensaje que muestra el valor actual de i mientras estamos "Contando hacia arriba"
        }
        
        for (int i = 10; i > 0; i--) { //Aquí comienza el segundo bucle for. En la declaración del bucle for, se inicializa una nueva variable i con el valor 10. La condición i > 0 indica que el bucle se ejecutará mientras i sea mayor que 0. En cada iteración, se decrementa i en 1 mediante i--
            System.out.println("Contando hacia abajo " + i); //se imprime en la consola un mensaje que muestra el valor actual de i mientras estamos "Contando hacia abajo"
        }
        System.out.println("############## For ##############");
        int[] miArreglo = {1,2,3,4,5}; //se declara un arreglo de enteros llamado miArreglo y se inicializa con los valores 1, 2, 3, 4 y 5. El arreglo contiene 5 elementos
        int numElementos = miArreglo.length; //Aquí se declara una variable llamada numElementos y se le asigna el valor de la longitud del arreglo miArreglo
        System.out.println("miArreglo tiene "+numElementos+" elementos"); //Imprime los elementos del arreglo
        int[] miArreglo2 = new int[10]; //se declara un segundo arreglo de enteros llamado miArreglo2 y se crea un nuevo arreglo con espacio para 10 elementos
        numElementos = miArreglo2.length; //Se actualiza la variable numElementos con la longitud del nuevo arreglo miArreglo2, que es 10
        System.out.println("miArreglo2 tiene "+numElementos+" posiciones"); //se imprime "miArreglo2"
        for (int i = 0; i < miArreglo2.length; i++) {
            miArreglo2[i] = i*10; //En este bucle for, se itera a través de los elementos del arreglo miArreglo2 utilizando la variable i como índice. En cada iteración, se asigna el valor i * 10 al elemento en la posición i del arreglo miArreglo2. Esto significa que se están llenando las posiciones del arreglo con valores que son múltiplos de 10, comenzando desde 0
        }
        for (int i = 0; i < miArreglo2.length; i++) {
            System.out.println("miArreglo2["+i+"]="+miArreglo2[i]);
        } //Este bucle for se utiliza para imprimir en la consola los valores del arreglo miArreglo2 después de haber sido llenado en el bucle anterior. Cada línea muestra el valor en la posición i del arreglo
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje "+j+"%");
        } //En este último bucle for, se crea una variable j que toma el valor del elemento en la posición i del arreglo miArreglo2, y luego se imprime un mensaje que muestra este valor seguido de un símbolo de porcentaje. Esto simula un "mapeo en porcentaje" de los valores contenidos en el arreglo
        
        System.out.println("############## For-each ##############");
        for (int i : miArreglo2) { //En esta línea, se utiliza un bucle "for-each" para iterar a través de los elementos del arreglo miArreglo2. La variable i toma el valor de cada elemento en cada iteración del bucle
            System.out.println("Hackeando la nasa "+i+"%"); //se imprime en la consola un mensaje que muestra el valor de i seguido de "%"
        }
    }

    private static boolean menor(int x, int y) {
        return x<y;
    } //Esta función es una función auxiliar llamada menor que toma dos argumentos x e y, que son enteros, y devuelve un valor booleano que indica si x es menor que y. La función verifica si x es estrictamente menor que y y devuelve true si es cierto y false en caso contrario
    
}
