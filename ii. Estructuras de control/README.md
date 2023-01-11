# ii. Estructuras de control

Las estructuras de control son el conjunto de reglas que permiten controlar el flujo de ejecución de las instrucciones de un algoritmo o de un programa.

Con las estructuras de control se puede:

-   De acuerdo con una condición, ejecutar un grupo u otro de sentencias (If-Then-Else)
-   De acuerdo con el valor de una variable, ejecutar un grupo u otro de sentencias (Switch-Case)
-   Ejecutar un grupo de sentencias  **solo cuando**  se cumpla una condición (Do-While)
-   Ejecutar un grupo de sentencias  **hasta**  que se cumpla una condición (Do-Until)
-   Ejecutar un grupo de sentencias un número determinado de veces (For-Next)


## Estructura de control if

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
	
