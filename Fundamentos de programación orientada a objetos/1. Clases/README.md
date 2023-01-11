
# Clases

Es una plantilla para el objetivo de la creación de objetos de datos según un modelo predefinido. Las clases se utilizan para representar entidades o conceptos, como los sustantivos en el lenguaje. Cada clase es un modelo que define un conjunto de variables y métodos apropiados para operar con dichos datos. Cada objeto creado a partir de la clase se denomina instancia de la clase.

La programación orientada a objetos es la base principal para los tipos de objetos. Permiten abstraer los datos y sus operaciones asociadas al modo de una caja negra. Los lenguajes de programación que soportan clases difieren sutilmente en su soporte para diversas características relacionadas con clases. La mayoría soportan diversas formas de herencia. Muchos lenguajes también soportan características para proporcionar encapsulación, como especificadores de acceso.

## a. Atributos

Los atributos son las caracterísiticas individuales que diferencian un objeto de otro y determinan su apariencia, estado u otras cualidades. Los atributos se guardan en variables denominadas de instancia, y cada objeto particular puede tener valores distintos para estas variables.

## b. Constructores

Un **constructor**, en programación orientada a objetos, es un conjunto de instrucciones diseñado especialmente para _inicializar una instancia_ de un objeto.

## c. Métodos

Son aquellas funciones que permite efectuar el objeto y que nos rinden algún tipo de servicio durante el transcurso del programa y determinan a su vez como va a responder el objeto cuando recibe un mensaje.

## d. Modificadores de acceso 
 
Los modificadores de acceso son palabras clave que se usan para especificar la accesibilidad declarada de un miembro o un tipo. En esta sección se presentan los cinco modificadores de acceso:

-   `public`
-   `protected`
-   `internal`
-   `private`
-   `file`

Se pueden especificar los siete niveles de accesibilidad siguientes mediante los modificadores de acceso:

-   `public`: el acceso no está restringido.
-   `protected`: el acceso está limitado a la clase contenedora o a los tipos derivados de la clase contenedora.
-   `internal`: el acceso está limitado al ensamblado actual.
-   `protected internal`: El acceso está limitado al ensamblado actual o a los tipos derivados de la clase contenedora.
-   `private`: el acceso está limitado al tipo contenedor.
-   `private protected`: El acceso está limitado a la clase contenedora o a los tipos derivados de la clase contenedora que hay en el ensamblado actual.
-   `file`: el tipo declarado solo es visible en el archivo de origen actual. Los tipos con ámbito de archivo se usan generalmente para los generadores de origen.

## e. Encapsulamiento

> Es el proceso de almacenar en una misma sección los elementos de una abstracción que constituyen su estructura y su comportamiento; sirve para separar el interfaz contractual de una abstracción y su implantación.


#### Existen tres niveles de acceso para el encapsulamiento, los cuales son:

**Público (Public):**  Todos pueden acceder a los datos o métodos de una clase que se definen con este nivel, este es el nivel más bajo, esto es lo que tu quieres que la parte externa vea.

**Protegido (Protected):**  Podemos decir que estás no son de acceso público, solamente son accesibles dentro de su clase y por subclases.

**Privado (Private):**  En este nivel se puede declarar miembros accesibles sólo para la propia clase.


## f. Instanciación, Objetos, Estado y Mutación de Estado

### Instanciación

La instanciación  es el proceso de leer o especificar información, como los valores y el tipo de almacenamiento de un campo de datos. Para optimizar los recursos del sistema, la instanciación es un proceso dirigido por el usuario, que le indica al software que lea los valores especificando opciones en la pestaña Tipo en un nodo de origen o ejecutando datos a través de un nodo Tipo.

-   Los datos con tipos desconocidos también se denominan  sin instanciar. Los datos cuyos valores y tipo de almacenamiento son desconocidos se muestran en la columna  _Medición_  de la pestaña Tipos como  <Valor predeterminado>.
-   Cuando se dispone de alguna información acerca del almacenamiento de un campo, como cadena o numérico, los datos se denominan  parcialmente instanciados.  Categórico  o  Continuo  son niveles de medición parcialmente instanciados. Por ejemplo,  Categórico  especifica que el campo es simbólico, pero no se conoce si es nominal, ordinal o marca.
-   Cuando se conocen todos los detalles de un tipo, incluidos los valores, se muestra un nivel de medición (nominal, ordinal, marca o continuo)  completamente instanciado  en esta columna. Tenga en cuenta que el tipo  continuo  se utiliza para ambos campos de datos, los instanciados parcialmente y los complemente instanciados. Los datos continuos pueden ser números enteros o reales.

Durante la ejecución de una ruta de datos con un nodo Tipo, los tipos sin instanciar se vuelven parcialmente instanciados, en función de los valores de datos iniciales. Una vez que todos los datos pasan por el nodo, se vuelven completamente instanciados a menos que los valores estuvieran establecidos en  <Pasar>. Si la ejecución se interrumpe, los datos permanecerán como parcialmente instanciados. Una vez instanciada la pestaña Tipos, los valores de un campo se vuelven estáticos en ese punto de la ruta. Esto significa que cualquier cambio anterior a la ruta no afectará a los valores de un campo determinado, incluso si se vuelve a ejecutar la ruta. Para cambiar o actualizar los valores en función de los nuevos datos o manipulaciones añadidas, debe editarlos en la propia pestaña Tipos o establecer el valor de un campo en  <Leer> o  <Leer +>.

#### Cuándo instanciar

Normalmente, si el conjunto de datos no es muy grande y no tiene intención de añadir más adelante ningún campo a la ruta, la instanciación en el nodo de origen es el método más conveniente. Sin embargo, la instanciación en un nodo Tipo independiente resulta útil cuando:

-   El conjunto de datos es grande y la ruta filtra un subconjunto anterior al nodo Tipo.
-   Los datos se han filtrado en la ruta.
-   Los datos se han fusionado o añadido en la ruta.
-   Los campos de datos nuevos se derivan durante el procesamiento.

### Objeto

Se trata de un ente abstracto usado en programación que permite separar los diferentes componentes de un programa, simplificando así su elaboración, depuración y posteriores mejoras.  
Los objetos integran, a diferencia de los métodos procedurales, tanto los procedimientos como las variables y datos referentes al objeto.  
A los objetos se les otorga ciertas características en la vida real. Cada parte del programa que se desea realizar es tratado como objeto, siendo así estas partes independientes las unas de las otras.Los objetos se componen de 3 partes fundamentales: **metodos**, **eventos** y **atributos**.

**Eventos:**
Son aquellas acciones mediante las cuales el objeto reconoce que se está interactuando con él.  
De esta forma el objeto se activa y responde al evento según lo programado en su código.

**Métodos:**

Son aquellas funciones que permite efectuar el objeto y que nos rinden algún tipo de servicio durante el transcurso del programa.  
Determinan a su vez como va a responder el objeto cuando recibe un mensaje.
