# ii. Estructuras de control

Las estructuras de control son el conjunto de reglas que permiten controlar el flujo de ejecución de las instrucciones de un algoritmo o de un programa.

Con las estructuras de control se puede:

-   De acuerdo con una condición, ejecutar un grupo u otro de sentencias (If-Then-Else)
-   De acuerdo con el valor de una variable, ejecutar un grupo u otro de sentencias (Switch-Case)
-   Ejecutar un grupo de sentencias  **solo cuando**  se cumpla una condición (Do-While)
-   Ejecutar un grupo de sentencias  **hasta**  que se cumpla una condición (Do-Until)
-   Ejecutar un grupo de sentencias un número determinado de veces (For-Next)



## i. Estructura de control if

Esta instrucción hace que se ejecuten unas sentencias u otras dependiendo del valor que toma una condición. La instrucción if puede ser simple o doble:

	if (condicion) 
		instrucción1
Si la condición es verdadera se ejecuta la instrucción. Cuando solo una instrucción acompaña a la condición no 
es necesario las llaves

	if (condicion)
	{
		instrucción 1;
		instrucción 2;
		instrucción 3;
	}
Si la condición es verdadera se ejecutan todas las instrucciones que están entre llaves.

	if (condicion)
	{
		instrucción 1;
		instrucción 2;
	}
	else
	{
	instrucción 3;
	instrucción 4;
	}
Si la condición es verdadera se ejecutan las instrucciones 1 y 2, de lo contrario se ejecuta la instrucción 3 y la 4.

## ii. Switch / case

La sentencia switch selecciona una de entre múltiples alternativas.La forma general de esta expresión es la siguiente:
	switch (expresión)
	{
	case constante1:
		instrucciones;break;
	case constante 2:
		instrucciones;
	break;· · ·
	default:
		instrucciones;
	}

En una instrucción switch, expresión debe ser una expresión con un valor entero, y constante1, constante2, ..., deben ser constantes enteras, constantes de tipo carácter o una expresión constante de valor entero.Expresión también puede ser de tipo char, ya que los caracteres individuales tienen valores enteros.Dentro de un case puede aparecer una sola instrucción o un bloque de instrucciones.

La instrucción switch evalúa la expresión entre paréntesis y compara su valor con las constantes de cada case. Se ejecutarán las instrucciones de aquel case cuya constante coincida con el valor de la expresión, y continúa hasta el final del bloque o hasta una instrucción que transfiera el control fuera del bloque del switch (una instrucción break, o return). Si no existe una constante igual al valor de la expresión, entonces se ejecutan las sentencias que están a continuación de default si existe (no es obligatorio que exista, y no tiene porqué ponerse siempre al final).

## ii. Diferencia y similitudes entre if y switch
