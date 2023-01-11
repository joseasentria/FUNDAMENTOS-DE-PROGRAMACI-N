# 8. Principio de “divide y conquista” (divide and conquer)


 **Divide y conquista**: Los algoritmos que usan la técnica de división y conquista descomponen el problema en varios subproblemas más pequeños y fáciles de resolver y luego se aplican a si mismos a esos subproblemas hasta llegar a un caso básico y fácil de resolver. Luego retroceden integrando las soluciones parciales para luego dar el resultado esperado.

- Divide y vencerás es un algoritmo para resolver un problema mediante los siguientes pasos

- Divide recursivamente el problema en subproblemas que no se superpongan hasta que estos se vuelvan lo - suficientemente simples como para resolverlos directamente.

- Conquista los subproblemas resolviéndolos recursivamente. Si son lo suficientemente pequeños, se resuélven como casos base.

- Combinar la solución de los subproblemas en la solución del problema original

**Algoritmo Merge Sort**

Merge Sort es un algoritmo de clasificación eficiente que utiliza el algoritmo Divide y vencerás

- Divide la lista desordenada en N sublistas hasta que cada una contenga un elemento

- Ordenar/Conquistar las sublistas resolviéndolas como casos base, una lista de un elemento se considera ordenada

- Fusionar/combinar repetidamente sublistas para producir nuevas sublistas ordenadas hasta que solo quede una sublista. Esta será la lista ordenada.
