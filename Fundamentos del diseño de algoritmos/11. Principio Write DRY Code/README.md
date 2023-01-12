# 11. Principio Write DRY Code

## **Principio DRY**

Los principios de una buena programación están estrechamente relacionados con los principios de un buen diseño y técnica. **El principio DRY ayuda a cualquier desarrollador a ser más eficiente y producir un código más fácil de seguir y con menos fallas.**

### **DRY (No te repitas) No hagas el mismo trabajo dos veces**

Probablemente el principio más fundamental en la programación es evitar la repetición. **Muchos desarrolladores copian, pegan y duplican fragmentos de su propio código.**

En general, eso no tiene nada de malo. Todo el mundo a veces necesita comprobar rápidamente algo (comportamiento esperado o lo que sea) para determinar si vale la pena escribirlo (es decir, escribirlo correctamente). Pero poner en producción dicho código copiado es inaceptable.

**DRY nos recuerda que cada comportamiento repetible en el código debe estar aislado (por ejemplo, separado en una función) para su reutilización.** Cuando tienes exactamente las mismas dos piezas de código en tu base de código, eso no es bueno, debido a que a menudo conduce a la de sincronización y otros errores, sin mencionar el hecho de que aumenta el tamaño del programa.

### **¿Por qué usarlo?**

Tan pronto como comienzas a repetirte (por ejemplo, una expresión larga, una serie de expresiones similares, entidades similares) creas nuevas abstracciones. **Seguir el principio de programación DRY permite lograr una alta capacidad de mantenimiento del proyecto, facilidad para realizar cambios y pruebas de alta calidad.**

Si el código no está duplicado, para cambiar la lógica, basta con hacer correcciones en un solo lugar y es más fácil probar una función (aunque más compleja), en lugar de un conjunto de docenas del mismo tipo.

Seguir este principio siempre conduce a la descomposición de algoritmos complejos en funciones simples. Y la descomposición de operaciones complejas en operaciones más simples (y reutilizables) simplifica enormemente la comprensión del código del programa.

La reutilización de funciones derivadas de algoritmos complejos reduce el tiempo de desarrollo y prueba de nuevas funciones.

### **El diseño DRY también tiene un lugar:**

El acceso a una funcionalidad específica debe estar disponible en un solo lugar, unificado y agrupado de acuerdo con algún principio, y no «disperso» alrededor del sistema en variaciones arbitrarias.
