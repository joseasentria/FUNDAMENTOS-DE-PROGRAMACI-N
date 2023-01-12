
# 14. Principio You Aren't Going to Need It (YAGNI)


En  ingeniería de software la filosofía de desarrollo de programas**No vas a necesitarlo**  o  **YAGNI**  (en  inglés  _**You Aren't Gonna Need It**_) consiste en que no se debe agregar nunca una funcionalidad excepto cuando sea necesaria. La tentación de escribir código que no es necesario, pero que puede serlo en un futuro, tiene las siguientes desventajas:

-   Cuando se desarrollan nuevas funcionalidades se suele sacrificar el tiempo que se destinaría para la funcionalidad básica.
-   Las nuevas características deben ser depuradas, documentadas y soportadas.
-   Una nueva funcionalidad impone límites a lo que podría ser hecho en el futuro, y podría impedir la implementación de una característica necesaria más adelante.
-   Hasta que no está definido para qué se puede necesitar es imposible saber qué debe hacer. Puede suceder que cuando se requieran las nuevas funcionalidades, estas no funcionen correctamente.
-   Puede derivar en un  código inflado: el programa se vuelve grande y complicado pero no proporciona más funcionalidad.
-   Excepto que haya especificaciones y algún tipo de  control de versiones, estas características adicionales pueden ser desconocidas por los programadores que podrían hacer uso de ellas.
-   Puede inducir a que se agreguen nuevas funcionalidades y, como resultado, puede llevar a un efecto 'bola de nieve' que puede consumir tiempo y recursos ilimitados, a cambio de ningún beneficio.
