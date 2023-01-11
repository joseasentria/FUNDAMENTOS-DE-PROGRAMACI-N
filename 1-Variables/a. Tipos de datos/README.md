

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
|  boolean	| false |
		
	

Hay un tipo de dato **String** para el manejo de cadenas que no es en sí un tipo de dato primitivo. Con el tipo de dato **String** podemos manejar cadenas de caracteres separadas por dobles comillas.

El elemento **String** es un tipo de dato inmutable. Es decir, que una vez creado, su valor no puede ser cambiado.

El String no es un tipo de dato primitivo del lenguaje Java. Pero su uso es igual de importante que el de los tipos de datos revisados aquí. Veremos más en detalle el uso del tipo String.


# i. Tipos de datos complejos o compuestos

Los lenguajes de programación orientados a objetos poseen una gran cantidad de los tipos que conforman su sistema de tipos de datos sean tipos complejos (objetos que provienen de clases). La librerías estándar de estos  pueden estar conformadas por cientos (quizás miles) de clases que representan en última instancia un tipo de dato particular. Además nosotros como programadores podemos crear nuestros propios tipos de datos a partir de los que conforman el sistema propio, sin embargo al ser tipos nuestros no conforman parte del estándar  y por ende no son parte oficial del sistema de tipos del lenguaje. Una de las principales clases que conforman estos tipos complejos es la clase String, los String no son un tipo primitivo (son objetos), sin embargo está conformado por una serie (una cadena) de chars (los cuales sí son primitivos), al ser una clase como tal, posee una serie de atributos y métodos que podemos usar para manipular nuestra cadena de caracteres. No pretendo mencionar todas las clases o tipos complejos que conforman el sistema de tipos de Java, sin embargo mencionaré de manera general los que son comúnmente usados, veamos:


### La clase String
    
Con ésta podemos crear cadenas de caracteres con gran facilidad (Strings), de hecho se diferencia por esto de los demás tipos complejos, pues no es necesario el uso del comando new para crear objetos de tipo String, basta con poner la cadena entre comillas dobles "palabra" e igualarla con una variable de tipo String y con eso bastará.
    
### La clase Scanner
    
Esta clase es muy utilizada en la actualidad porque facilita mucho la tarea de leer la entrada de datos por teclado, es decir recibir valores escritos por el usuario por medio del teclado. Para crear un objeto de tipo Scanner si es necesario el uso del comando new y enviarle un parámetro específico al constructor.
    
### La clase ArrayList
    
La clase ArrayList permite crear una "colección" de elementos al interior de sí misma, es similar a un Vector o arreglo, y posee una gran variedad de métodos y atributos que nos permiten por ejemplo, buscar un elemento cualquiera, insertar un nuevo elemento, eliminarlo, entre otras. Es básicamente un arreglo pero con una enorme cantidad de facilidades para gestionar los datos que este contiene. 
    
