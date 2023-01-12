
# 12. Principio Composition Over Inheritance


La composición sobre la herencia (o el principio de reutilización compuesta) en la programación orientada a objetos (OOP) es el principio de que las clases deben lograr un comportamiento polimórfico y la reutilización del código mediante su composición (al contener instancias de otras clases que implementan la funcionalidad deseada) en lugar de la herencia de un clase base o padre.

La composición es un tipo de relación dependiente en dónde un objeto más complejo está compuesto por otros objetos, es decir que se genera cuando tenemos una instancia de una clase que contiene instancias de otras clases, como dependencias, que implementan las funciones deseadas.

Una implementación de composición sobre herencia generalmente comienza con la creación de varias interfaces que representan los comportamientos que debe exhibir el sistema. Las interfaces pueden facilitar el comportamiento polimórfico. Las clases que implementan las interfaces identificadas se construyen y agregan a las clases de dominio comercial según sea necesario. Así, los comportamientos del sistema se realizan sin herencia.

De hecho, todas las clases de dominio empresarial pueden ser clases base sin ningún tipo de herencia. La implementación alternativa de los comportamientos del sistema se logra proporcionando otra clase que implemente la interfaz de comportamiento deseada. Una clase que contiene una referencia a una interfaz puede admitir implementaciones de la interfaz, una opción que se puede retrasar hasta el tiempo de ejecución.
