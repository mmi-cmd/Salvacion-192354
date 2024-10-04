# Salvacion-192354

Documentacion de FizzBuzz
1. Se declara una constante MAX_NUMBER con un valor de 100. Esto establece el límite superior para la verificación de números, evitando el uso de "números mágicos"
2. Se inicia un bucle for que recorre todos los números desde 1 hasta 100
3. Condiciones para FizzBuzz:
    -Multiplo de 3 y 5: Primero, se verifica si el número i es múltiplo de 3 y 5 al mismo tiempo (i % 3 == 0 && i % 5 == 0). Si es cierto, se imprime "FizzBuzz".

    -Multiplo de 5: Si la condición anterior no se cumple, se verifica si i es múltiplo de 5 (i % 5 == 0). Si es cierto, se imprime "Buzz".
    
    -Multiplo de 3: Si las condiciones anteriores no son ciertas, se comprueba si i es múltiplo de 3 (i % 3 == 0). Si lo es, se imprime "Fizz".

    -Ninguna de las condiciones anteriores: Si ninguna de las condiciones se cumple, simplemente se imprime el número i.

4. Salida: El resultado es que, para cada número del 1 al 100, el programa imprimirá "Fizz" si el número es múltiplo de 3, "Buzz" si es múltiplo de 5, "FizzBuzz" si es múltiplo de ambos, y el número en sí si no es múltiplo de ninguno.

Documentacion de Fibonacci
1. Variables Iniciales:

    -long inicialNumber = 0;: Esta variable representa el primer número de la serie de Fibonacci.
    -long secondNumber = 1;: Esta variable representa el segundo número de la serie de Fibonacci.
    -final int MAX_NUMBER = 50;: Se establece una constante que indica cuántos números se generarán en la serie, en este caso, 50. Esto evita el uso de "números mágicos".

2. Impresión de los Primeros Números: Se imprimen los dos primeros números de la serie (0 y 1).

3. Generación de la Serie con un Bucle for:

    -for (int i = 2; i < MAX_NUMBER; i++): Se inicia un bucle que comienza en 2 (porque ya se han impreso los dos primeros números) y se repetirá hasta llegar a MAX_NUMBER.

    Dentro del bucle:
    -(long thirdNumber = inicialNumber + secondNumber)  Se calcula el siguiente número de la serie sumando los dos números anteriores.
    -inicialNumber = secondNumber;: Se actualiza inicialNumber para que tome el valor del segundo número (ahora el más reciente).
    -secondNumber = thirdNumber;: Se actualiza secondNumber para que tome el valor de thirdNumber.
    
    - Se imprime el nuevo número de la serie.

4. Hay una sección comentada que muestra cómo se podría implementar la misma lógica utilizando un bucle while en lugar de un for. La lógica es prácticamente la misma: se inicializan los dos primeros números y se usan variables para calcular el siguiente número de la serie, imprimiendo cada uno.

Documentacion de NumerosPrimos:
1. Variables Constantes:

    -final int MAX_NUMBER = 100;: Se establece una constante que define el límite superior para la búsqueda de números primos, en este caso, 100.
    -final int MAX_DIVISORES_PRIMO = 2;: Se define otra constante que indica que un número primo debe tener exactamente 2 divisores (1 y el propio número).

2. Se solicita al usuario que ingrese un número que se desea verificar si es primo.

3. Se inicializa un contador que se usará para contar cuántos divisores tiene el número ingresado. Se verifica que el número sea mayor que 1, ya que los números menores o iguales a 1 no son primos.

4. Se utiliza un bucle for que va desde 1 hasta number, donde:
    - if (number % i == 0): Se verifica si number es divisible por i. Si es divisible, se incrementa cantidadDivisores.
    - Después de contar los divisores, se comprueba si cantidadDivisores es igual a 2 (usando MAX_DIVISORES_PRIMO). Si es así, se imprime que el número es primo; de lo contrario, se indica que no lo es.

5. Se imprime un mensaje indicando que se van a listar los números primos hasta 100.
    -Se inicia otro bucle for que recorre todos los números desde 1 hasta MAX_NUMBER:
    -Se reinicia cantidadDivisores para cada número.
    -Se vuelve a contar los divisores de cada número dentro de otro bucle for.
    -Si un número tiene exactamente 2 divisores, se imprime como primo.