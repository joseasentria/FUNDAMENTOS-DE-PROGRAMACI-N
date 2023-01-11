
# b. Asignación de valores



### Declarando e inicializadas variables

Una variable se declara para indicarle al programa a partir de qué lugar empieza a existir, qué nombre tendrá y qué tipo de datos almacenará. La asignación de un valor inicial se llama inicialización. Para declarar una variable se usa una instrucción compuesta del nombre del tipo de datos de la variable, el nombre de la variable y opcionalmente un operador de asignación y un valor inicial. La inicialización puede hacerse en la misma instrucción que la declara o en una instrucción separada. Es importante tener en cuenta que las variables deben recibir un valor inicial antes de poder leer los datos que contienen. Si un programador trata de leer los datos el valor de una variable que no ha sido inicializada, los compiladores normalmente reportan un error y no compilan el programa.

Los tipos de datos que usaremos serán  `entero`,  `real`,  `carácter`,  `lógico`  y  `apuntador`. La secuencia de símbolos:  `:=`  se usará como operador de asignación. Los siguientes son algunos ejemplos de declaración e inicialización de variables:

-   Variable de tipo entero llamada  `edad`.

entero edad

-   Variable de tipo real llamada  `precio`.

real precio

-   Variable de tipo entero llamada  `artículos_disponibles`  con  `100`  como su valor inicial.

entero artículos_disponibles := 100

-   Variable de tipo lógico llamada  `terminado`  con  `falso`  como su valor inicial.

lógico terminado := falso

-   Declaración de 3 variables en secuencia de diferentes tipos.

carácter primera_letra   := 'A'
lógico   terminado       := falso
entero   total_artículos := 1000

-   Declaración de una variable seguida de su inicialización en una instrucción diferente.

real velocidad
velocidad := 23.4

### Asignando datos a las variables

Asignarle un dato a una variable consiste en reemplazar el valor anterior o inicial de la variable con un valor nuevo. Una vez que se asigna un nuevo valor, el valor anterior es eliminado de la memoria y no es posible recuperarlo. Estos son algunos ejemplos de asignaciones de valores a variable declaradas e inicializadas previamente:

-   Asignando el carácter  `'R'`  a la variable  `siguiente_letra`

siguiente_letra := 'R'

-   Asignando el valor  `24.26`  a la variable  `temperatura`

temperatura := 24.26

-   Asignando diferentes valores a diferentes variables en instrucciones consecutivas.

edad    := 24
sexo    := 'F'
en_paro := falso

### Transfiriendo datos entre variables

De la misma forma en que asignamos valores constantes a las variables, podemos asignarles los valores de otras variables. Esta operación copia el dato contenido en una variable a otra variable, de forma que al completarse la operación ambas variables tienen el mismo valor. De ese momento en adelante, ambas variables se comportan de forma independiente, de forma que modificar el valor de la variable original no alterará el valor de la variable a la que se le asignó el dato. Para que la asignación de valores entre variables funcione, estas deben ser del mismo tipo, de lo contrario el compilador reportará un error.

Estos son algunos ejemplos de asignaciones de valores entre variables:

-   El valor de una variable se traslada a otra variable.

velocidad_actual := velocidad anterior

-   El valor de una variable se traslada a otra variable y de esta a una tercera variable.

temperatura_actual  := temperatura_ideal
temperatura_del_día := temperatura_actual

-   Se declaran dos variables, se les asigna un valor inicial, el valor de una de ellas se reemplaza con el valor de la otra y a esta última se le assigna un nuevo valor.

// Declaraciones
carácter letra_actual
carácter letra_anterior

//Inicializaciones
letra_actual   := 'J'
letra_anterior := 'A'

// Transferencia del valor de una variable a la otra.
// El valor original de la variable se pierde.
letra_anterior := letra_actual

// Se le assigna un nuevo valor a la letra actual.
letra_actual := 'Z'

// Los valores de las variable en este punto son:
// letra_anterior es 'J'
// letra_actual es 'Z'

### Recomendaciones para dar nombre a las variables 

Los lenguajes de programación tienen restricciones sobre los nombres que se le pueden dar a las variables. La mayoría permite carácteres alfabéticos (tanto mayúsculas como minúsculas) y numéricos, pero no permiten la mayoría de los símbolos ni los espacios en blanco. También tienen restricciones sobre el largo máximo que pueden tener, no permiten usar un conjunto de palabras reservadas que tienen significados especiales en los programas y normalmente no permiten que el primer carácter del nombre sea un número.[[2]](https://es.wikiversity.org/wiki/Fundamentos_de_programaci%C3%B3n/Variables_y_asignaciones#cite_note-appleby1998-2)

Al aprender un lenguaje de programación es indispensable familiarizarse con las reglas de formación de nombres. Esas reglas cambian de un lenguaje a otro, pero las siguientes recomendaciones generales son de utilidad:

-   No se deben usar nombres muy largos para no exceder el máximo permitido por el lenguaje.
-   Los nombres deben ser significativos para que reflejen la función de la variable.
-   Las declaraciones de las variables deberían estar precedidas de un comentario que ayude a identificar su propósito.
-   Se debe adoptar una convención de estilo para darle nombres consistentes a todas las variables del programa.
