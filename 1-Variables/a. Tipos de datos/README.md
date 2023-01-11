
# i. Tipos de datos primitivos
Representan un único dato simple que puede ser de tipo char, byte, short, int, long, float, double, boolean. 
Por ejemplo: ‘a’, 12345, 750.68, False,... Cada tipo de dato presenta un conjunto de valores o constantes literales.

**byte**
Representa un tipo de dato de 8 bits con signo. De tal manera que puede almacenar los valores numéricos de -128 a 127 (ambos inclusive).

**short**
Representa un tipo de dato de 16 bits con signo. De esta manera almacena valores numéricos de -32.768 a 32.767.

**int**
Es un tipo de dato de 32 bits con signo para almacenar valores numéricos. Cuyo valor mínimo es -231 y el valor máximo 231-1.

**long**
Es un tipo de dato de 64 bits con signo que almacena valores numéricos entre -263 a 263-1

**float**
Es un tipo dato para almacenar números en coma flotante con precisión simple de 32 bits.

**double**
Es un tipo de dato para almacenar números en coma flotante con doble precisión de 64 bits.

**boolean**
Sirve para definir tipos de datos booleanos. Es decir, aquellos que tienen un valor de true o false. Ocupa 1 bit de información.

**char**
Es un tipo de datos que representa a un carácter Unicode sencillo de 16 bits.

**Valores por defecto de los tipos de datos primitivos**

En el caso de que definamos una variable y no le demos ningún valor, por defecto llevarán los siguientes valores:

| Dato Primitivo | 	Valor por Defecto |
|--|--|
|  byte	| 0 |
|  short| 0 |
|  long	| 0L |
|  float	| 0.0f |
|  double	| 0.0d |
|  char	| ‘u0000’ |
|  String (o cualquier objeto)	| null |
|  boolean	| false |
		
	

Hay un tipo de dato **String** para el manejo de cadenas que no es en sí un tipo de dato primitivo. Con el tipo de dato **String** podemos manejar cadenas de caracteres separadas por dobles comillas.

El elemento **String** es un tipo de dato inmutable. Es decir, que una vez creado, su valor no puede ser cambiado.

El String no es un tipo de dato primitivo del lenguaje Java. Pero su uso es igual de importante que el de los tipos de datos revisados aquí. Veremos más en detalle el uso del tipo String.
