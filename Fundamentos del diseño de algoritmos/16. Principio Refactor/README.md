
# 16. Principio Refactor

El termino  _refactor_  fue acuñado por Martin Fowler para describir una técnica por la cual se busca mejorar el diseño de un código ya existente1. Esta técnica consiste en aplicar unas pequeñas transformaciones, paso a paso, que en su suma van a producir un gran cambio.  
  
_¿Para qué refactorizamos?_  Para reducir la posibilidad de introducir errores cuando estamos agregando nueva funcionalidad. Esto se hace teniendo en cuenta las posibles señales o síntomas de que puede haber un problema en el código conocidos como  _code smells_2. Si, aplicar un refactor no se basa en que el código quede "más lindo", si no en que sea  **mantenible**, definiendo mantenible con la pregunta:  _¿Cuán costoso resulta introducir cambios en este código?_

## Los  _code smells_

## ¿Qué es un  _code smell_?

> “Un  _code smell_, también conocido como mala práctica, en el desarrollo de software, se refiere a cualquier síntoma en el código fuente de un programa que posiblemente indique un problema más profundo. (…)
> 
> Los  _code smells_  usualmente no son bug de programación (errores) – no son técnicamente incorrectos y en realidad no impiden que el programa funcione correctamente.
> 
> En cambio, indican deficiencias en el diseño software que puede ralentizar el desarrollo o aumentan el riesgo de errores o fallos en el futuro.”
> 

## Los errores más comunes

–  **Bloatware**: son partes del código (clases, métodos, …) que han aumentado de manera desproporcionada y se han vuelto difíciles de mantener y están haciendo demasiadas cosas en lugar de tener una responsabilidad clara. Puede convertirse en un gran problema, especialmente si a nadie le importa su eliminación.

–  **Código repetido (duplicado)**: podría suceder cuando un desarrollador no puede cumplir con los plazos (o simplemente porque es demasiado vago) y copia y pega partes del código, en lugar de crear algo ad hoc. A veces también ocurre cuantos más programadores están trabajando en el desarrollo del mismo código. En el futuro, esto se traducirá en un gran esfuerzo, porque significa un cambio en más de un lugar o, lo que es peor, si uno de ellos es olvidado, funcionará de manera diferente.

–  **Clases perezosas (_lazy_)**, como sabéis, mantener el código cuesta tiempo y dinero, por lo que si una clase se construyó solo para anticipar las características futuras y no está haciendo mucho en la situación actual, debería eliminarse.

Desafortunadamente, a menudo estos elementos no son fáciles de arreglar y necesitan un gran esfuerzo o un cambio importante del código.
