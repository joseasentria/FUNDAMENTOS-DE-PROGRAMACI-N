# b. Colas

 Son un tipo de dato abstracto, caracterizada por ser una secuencia de elementos en la que la operación de inserción push se realiza por un extremo y la operación de extracción pull por el otro.
 
## i. FIFO
**First-In, First-Out**
El patrón FIFO, por su parte, toma como base el principio de que la solicitud que llegue primero debe ser la que se atienda y salga primero, mientras que la petición más nueva es atendida al final de la cola.

Este método prioriza las solicitudes más antigua y suele ser la que se utiliza normalmente en sistemas tecnológicos, cuando no se sufren situaciones extraordinarias que obliguen a optar por el método LIFO para gestionar las colas.

## ii. LIFO
**Last-In, Last-Out**
El patrón de gestión de colas LIFO se basa en el formato que indica que la última solicitud en entrar debe ser la primera que se atienda y salga. Esto es porque se asume que las peticiones que llevan en cola más tiempo se han ido, por lo que atenderlas ya no es una prioridad. En cambio, las solicitudes nuevas son entendidas por el algoritmo como opciones con mayores probabilidades de ser atendidas por el emisor.
