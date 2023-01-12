# Herencia

Es un mecanismo que permite derivar una clase a otra clase. En otras palabras, tendremos unas clases que serán hijos, y otras clases que serán padres.

Las clases hijas pueden utilizar tanto sus métodos y propiedades como de la clase padre, siempre que su )  lo permita.

## **Herencia Simple**

La  **herencia simple**  ocurre cuando una clase derivada hereda atributos y métodos de una única clase base.

## a. **Herencia Múltiple**

La  **herencia múltiple** ocurre cuando una clase es derivada de dos clases base o mas. Las clases base se indican de la misma forma, separando cada una con una coma.

## b. Abastracción y clases abstractas

### Abstracción
> La abstracción son las características especificas de un objeto, aquellas que lo distinguen de los demás tipos de objetos y que logran definir límites conceptuales respecto a quien está haciendo dicha abstracción del objeto.

Una abstracción se enfoca en la visión externa de un objeto, separa el comportamiento específico de un objeto, a esta división que realiza se le conoce como la  **barrera de abstracción**, la cuál se consigue aplicando el principio de  **mínimo compromiso**.

### Clases abstractas
Una clase abstracta es una clase común que posee atributos y métodos, y tiene como mínimo un método abstracto, además puede contener métodos normales.

Esta clase no puede ser instanciada, solo puede heredarse, o sea no se puede usar para crear un objeto.

Las clases abstractas, como su nombre lo indica, son algo abstracto, no representan algo específico y las podemos usar para crear otras clases. No pueden ser instanciadas, por lo que no podemos crear nuevos objetos con ellas.

## c. Interfaces

Una interfaz (también llamada protocolo) es un medio común para que los objetos no relacionados se comuniquen entre sí. Estas son definiciones de métodos y valores sobre los cuales los objetos están de acuerdo para cooperar.

## d. Polimorfismo

Polimorfismo es la capacidad que tienen los objetos de una clase en ofrecer respuesta distinta e independiente en función de los parámetros (diferentes implementaciones) utilizados durante su invocación. Dicho de otro modo el objeto como entidad puede contener valores de diferentes tipos durante la ejecución del programa. También suele definirse como ‘Sobrecarga de parámetros’.
