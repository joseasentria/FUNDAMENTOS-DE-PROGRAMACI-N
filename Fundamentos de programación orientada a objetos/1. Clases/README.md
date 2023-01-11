
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
