## Verificación y Validación
# Problemas con Mockito

Proyecto IntelliJ de partida para la realización de un par de ejercicios con
[Mockito](https://site.mockito.org/) en clase de [Verificación y Validación](https://estudios.unizar.es/estudio/asignatura?anyo_academico=2019&asignatura_id=30244&estudio_id=20190148&centro_id=110&plan_id_nk=439)
del [Grado en Ingeniería Informática](http://webdiis.unizar.es/~jresano/) de
la [Universidad de Zaragoza](https://www.unizar.es/).

Este proyecto contiene:

- Los ejemplos de la clase de teoría, en el paquete `es.unizar.eina.vv6f.pruebas.mockito.ejemplo`.
  
  Estos ejemplos están basados en la página web «Unit tests with Mockito – Tutorial» de Lars Vogel y Fabian Pfaff. _Vogella_. Version 1.9. 10-4-2017. https://www.vogella.com/tutorials/Mockito/article.html
  [accedido el 19-3-2024].
  
- Esqueleto para el problema de _mocking_ con el patrón sujeto
  observador (paquete `es.unizar.eina.vv6f.pruebas.mockito.ejercicio1`)
  
  Este problema está basado en el tutorial «Getting Started» de _JMock_. 2012.
  http://jmock.org/getting-started.html [accedido el 19-3-2024].
    
- Esqueleto para el problema de _stubbing_ (paquete `es.unizar.eina.vv6f.pruebas.mockito.ejercicio2`)

## Actividades a realizar

### Configuración del proyecto en IntelliJ

En proyecto suministrado en este repositorio no está configurado todavía para utilizar Mockito.

Para configurarlo:
   
- Project Structure | Libraries | + (New Project Library) | From Maven…
- org.mockito:mockito-junit-jupiter:5.16.1 
- Seleccionad _Sources_, _JavaDocs_ y _Annotations_
    
Una vez configurado, comprobad que funciona ejecutando los test del paquete `es.unizar.eina.vv6f.pruebas.mockito.ejemplo` 

### Ejercicio 1: _Mocking_ 
Implementación del patrón sujeto-observador en el paquete `es.unizar.eina.vv6f.pruebas.mockito.ejercicio1`
   
- Escribid una prueba JUnit para la clase `MyPublisher`:
    - Cread un objeto _mock_ de la interfaz `Subscriber`.
    - Suscribidlo a un objeto de la clase `MyPublisher`.
    - Publicad un mensaje en el objeto de la clase `MyPublisher`.
    - Comprobad sobre el _mock_ si la interacción ha sido correcta.
- Ejecutad la prueba. Como no hemos implementado nada, fallará.
  Observad los menajes de error que genera Mockito. 
- Implementad y corregid la clase `MyPublisher` hasta que el test 
  no detecte fallos.
- Añadid pruebas adicionales que cubran los siguientes escenarios:

    1. Dos _mocks_ y un mensaje a ambos
        - Dos _mocks_ de la interfaz Subscriber se suscriben al `Publisher`.
        - El `Publisher` publica un mensaje.
        - Comprobad que los dos _mocks_ reciben el mensaje.
    2. Dos _mocks_ y dos mensajes a cada uno de ellos.
    3. Dos _mocks_ y dos mensajes, pero entre la suscripción del 
       primer y el segundo _mock_, el `Publisher` publica el primer mensaje. 
       
### Ejercicio 2: _Stubbing_

Sustitución de la interfaz `DataInput` en el paquete
`es.unizar.eina.vv6f.pruebas.mockito.ejercicio2`, para evitar
tener que generar ficheros reales para las pruebas

1. Escribid tests en JUnit para probar el método `escribirResumen`,
recorriendo los cuatro caminos identificados en la clase de
pruebas de caminos con profundidad 2 (transparencias 115 y siguientes del tema 
de técnicas (2b)):
    - Fichero vacío (con 0 ventas)
    - Fichero con solo una venta
    - Fichero con dos ventas de dos clientes distintos
    - Fichero con 4 ventas de dos clientes distintos _c_<sub>1</sub> y
      _c_<sub>2</sub>. Las dos primeras son del cliente _c_<sub>1</sub> y
      las dos últimas, del cliente _c_<sub>2</sub>.

    En lugar de ficheros binarios reales, utilizad Mockito para crear
    objetos sustitutos (_stubs_, en concreto) de la interfaz `DataInput`.
    Solo configurad las pruebas y ejecutarlas. No comprobéis de momento en
    el test los resultados de la ejecución (es decir, no redirijáis de
    momento la salida estándar a ningún otro sitio ni hagáis ninguna
    aserción sobre el contenido de la misma).
    
2. Comprobad en IntelliJ si se alcanza una cobertura del 100 %
   en el método `escribirResumen`.
   
3. Utilizad Mockito para añadir una prueba en la que **inyectar
   el error** necesario para alcanzar una cobertura del 100 %.

4. Terminad de automatizar las pruebas, comprobando los resultados
   de la ejecución de las mismas (redirigiendo la salida estándar
   a un sustituto, que puede ser en este caso un 
   `ByteArrayOutputStream`).
    
#### ¡Atención!
Aunque es precisamente lo que estamos haciendo en este ejercicio, 
**no es recomendable hacer _mocks_ de clases que no nos pertenezcan**.

[¿Por qué?](https://github.com/mockito/mockito/wiki/How-to-write-good-tests#dont-mock-a-type-you-dont-own)