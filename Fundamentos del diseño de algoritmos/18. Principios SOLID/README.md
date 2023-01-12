
# 18. Principios SOLID

## a. S - Responsabilidad simple (Single responsibility)

Se cumple cuando nuestra clase/entidad/modulo solo hace una cosa. El Principio de Responsabilidad Única nos dice que un módulo tiene una única razón para cambiar

### detectar si estamos violando el Principio:

En una misma clase están involucradas dos capas de la arquitectura: En toda arquitectura, por simple que sea, debería haber una capa de presentación, una de lógica de negocio y otra de persistencia. Si mezclamos responsabilidades de dos capas en una misma clase, será un buen indicio.

El número de métodos públicos / número de imports / número de líneas: Probabilidad de que que sus metodos tengan poco que ver entre ellos.

Cada vez que escribes una nueva funcionalidad, esa clase se ve afectada

Nos cuesta testear la clase.

## b. O - Principio Open/Closed

Una entidad de software debería estar abierta a extensión pero cerrada a modificación. Capacidad de extender el comportamiento de nuestras clases sin necesidad de modificar su código. Esto nos ayuda a seguir añadiendo funcionalidad con la seguridad de que no afectará al código existente.

  
## c. L - Principio de Sustitución de Liskov

Si en alguna parte de nuestro código estamos usando una clase, y esta clase es extendida, tenemos que poder utilizar cualquiera de las clases hijas y que el programa siga siendo válido.

  

## d. I - Principio de segregación de interfaces

El principio de segregación de interfaces viene a decir que ninguna clase debería depender de métodos que no usa. Por tanto, cuando creemos interfaces que definan comportamientos, es importante estar seguros de que todas las clases que implementen esas interfaces vayan a necesitar y ser capaces de agregar comportamientos a todos los métodos. En caso contrario, es mejor tener varias interfaces más pequeñas.

  

## e. D - Principio de inversión de dependencias

El núcleo de nuestra aplicación no dependa de los detalles de implementación, como pueden ser el framework que utilices, la base de datos, cómo te conectes a tu servidor…

  

- A. Las clases de alto nivel no deberían depender de las clases de bajo nivel. Ambas deberían depender de las abstracciones.

- B. Las abstracciones no deberían depender de los detalles. Los detalles deberían depender de las abstracciones.
