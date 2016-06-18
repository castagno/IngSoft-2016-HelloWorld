# Grupo Hello World
### Trabajo Final - Reproductor Mp3
### System Requirements Specification
___
|Autores                               |
|------------------------------------|
|Castagno Gustavo - 34582890           |
|Gonzalez Somerstein Gustavo -7721064  |
|Maero Facundo - 38479441              |
### Historial de Revisiones

| Versi�n | Fecha    | Resumen de cambios |
|:-------:|----------|--------------------|
|  1.0.0  | 17/06/16 | Primera versi�n    |


Tabla de Contenidos
===================

    1. Introducci�n
    2. Glosario
    3. Definici�n de requerimientos de usuario
        3.1. Requerimientos funcionales
        3.2. Requerimientos funcionales
    4. Arquitectura del sistema
    5. Especificaci�n de Requerimientos de Sistema

## 1. Introducci�n
---
Se describe a continuaci�n el documento de Especificaci�n de Requerimientos para el sistema: Reproductor de Mp3.
Dicho sistema se utilizar� para reproducir archivos de audio, permitiendo diversas interacciones con el usuario, como la modificaci�n de los archivos que se quieren escuchar, la visualizaci�n de informaci�n sobre los mismos, entre otros.


## 2. Glosario
---
| Acr�nimo | Descripci�n|
|:-------:|----------|
|  SRS | Especificaci�n de Requerimientos de Software|
| UI| Interfaz de Usuario|

## 3. Definici�n de requerimientos de usuario
---
Se muestra a continuaci�n un diagrama de casos de uso del sistema, donde se pueden observar las diferentes interacciones que soporta el mismo.

(Diagrama de caso de uso)

#### 3.1 Requerimientos funcionales
Se listan los requerimientos funcionales del sistema, seguido de gr�ficos explicativos de cada uno de ellos:

1. **Ejecuciones simult�neas:** El sistema deber� mostrar 3 vistas DJView funcionando a la vez con los 3 modelos diferentes.
2. **Cambio de modelo:** El sistema deber� permitir cambiar el modelo utilizado en tiempo de ejecuci�n.
3. **Nuevo HeartModel:** El sistema deber� permitir al usuario intentar crear un nuevo HeartModel mediante un bot�n.
4. **Agregar canciones:** El sistema deber� permitir al usuario seleccionar canciones para agregar a la lista de reproducci�n.
5. **Eliminar canciones:** El sistema deber� permitir borrar las canciones que est�n en la playlist.
6. **Reproducir m�sica:** El sistema deber� poder iniciar la reproducci�n de m�sica.
7. **Pausar m�sica:** El sistema deber� poder pausar la reproducci�n de m�sica.
8. **Detener m�sica:** El sistema deber� poder detener la reproducci�n de m�sica.
9. **Reanudar reproducci�n:** El sistema deber� poder reanudar la reproducci�n de m�sica.
10. **Saltear canciones:** El sistema deber� permitir reproducir la canci�n siguiente o anterior a la actual.
11. **Mostrar informaci�n:** El sistema deber�a mostrarle al usuario la informaci�n de la canci�n que se est� reproduciendo en una ventana emergente.
12. **Mostrar portada:** El sistema deber�a mostrar la portada del �lbum que se est� reproduciendo.
13. **Modificar volumen:** El sistema deber�a permitir al usuario cambiar de volumen.

(Diagramas de secuencia explicativos)

#### 3.2 Requerimientos no funcionales

1. **Facilidad de uso:** Un usuario promedio (que haya utilizado alguna vez un reproductor MP3) deber�a ser capaz de utilizar todas las funcionalidades del sistema con un entrenamiento de 5 minutos.
2. **Mantenibilidad:** El sistema deber�a ser f�cilmente mantenible, por lo que es deseable separar la l�gica de la interfaz de usuario.
3. **Portabilidad:** El sistema deber� funcionar en las plataformas m�s populares, entre ellas Windows y Mac Os.

## 4. Arquitectura del sistema
Se muestra un gr�fico de la arquitectura del sistema a alto nivel.

(Diagrama de arquitectura)

## 5. Especificaci�n de Requerimientos de Sistema
#### 5.1 Requerimientos funcionales
- **1. Ejecuciones simult�neas:** El sistema deber� mostrar 3 vistas DJView funcionando a la vez con los 3 modelos diferentes.
    - 1.1. Se deber�n mostrar tres interfaces de usuario DJView simult�neamente.
    - 1.2 Las UI deber�n funcionar una con cada modelo provisto (BeatModel, HeartModel, MP3Model).


- **2. Cambio de modelo:** El sistema deber� permitir cambiar el modelo utilizado en tiempo de ejecuci�n.
    - 2.1. Deber� ser posible cambiar de l�gica a utilizar mediante un menu de tipo dropdown, en el que estar�n las opciones a elegir.
    - 2.2 La funcionalidad de cada modelo funcionar� hasta que se cambie el mismo, momento donde se detiene para dar lugar a la siguiente.


- **3. Nuevo HeartModel:** El sistema deber� permitir al usuario intentar crear un nuevo HeartModel mediante un bot�n.
    - 3.1 Se proveer� un bot�n que permitir� intentar crear una nueva instancia del modelo HeartModel.
    - 3.2 Los intentos de creaci�n de un nuevo modelo ser�n ignorados por el sistema.


- **4. Agregar canciones:** El sistema deber� permitir al usuario seleccionar canciones para agregar a la lista de reproducci�n.
    - 4.1. El sistema deber�a permitir seleccionar �nicamente archivos con extensi�n .mp3
    - 4.2. El sistema deber� permitir agregar canciones a la playlist de una a la vez.
    - 4.3 La selecci�n de archivos deber� realizarse usando una ventana de selecci�n de carpetas y archivos.


- **5. Eliminar canciones:** El sistema deber� permitir borrar las canciones que est�n en la playlist.
    - 5.1. El sistema deber� permitir eliminar de a una canci�n en la playlist, seleccionando la misma con el mouse.
    - 5.2 La canci�n eliminada deber� desaparecer de la lista de canciones a reproducir.


- **6. Reproducir m�sica:** El sistema deber� poder iniciar la reproducci�n de m�sica.
    - 6.1 Se podr� comenzar la reproducci�n de la m�sica disponible en la lista.
    - 6.2 No se podr�n reproducir archivos que no se hayan agregado a la playlist previamente.
    - 6.3 Al comenzar la reproducci�n, el sistema deber� habilitar la pulsaci�n del bot�n de pausa.
    - 6.4 Al reproducir una canci�n, se deber� mostrar en la interfaz de usuario su t�tulo, y su duraci�n.


- **7. Pausar m�sica:** El sistema deber� poder pausar la reproducci�n de m�sica.
    - 7.1 La reproducci�n de un archivo podr� ser pausada, guardando el instante en el que se realiza.


- **8. Detener m�sica:** El sistema deber� poder detener la reproducci�n de m�sica.
    - 8.1 Se podr� detener la reproducci�n de m�sica, y no se guardar� el instante de la canci�n en el que se realiza la acci�n.


- **9. Reanudar reproducci�n:** El sistema deber� poder reanudar la reproducci�n de m�sica.
    - 9.1 Si la canci�n actual estaba pausada, el sistema deber� reanudar la reproducci�n desde el momento de pausa guardado.
    - 9.2 Si la cancion actual estaba detenida, el sistema deber� reiniciar la reproducci�n desde el comienzo.


- **10. Saltear canciones:** El sistema deber� permitir reproducir la canci�n siguiente o anterior a la actual.
    - 10.1 Si la playlist contiene solo una canci�n, al intentar reproducir la siguiente o la anterior, el sistema deber� reiniciar la reproducci�n de la pista actual.
    - 10.2 El sistema deber� tener una lista de reproducci�n circular.
    - 10.3 Si se intenta reproducir la canci�n siguiente a la �ltima, el sistema deber� comenzar con la primera de la lista.
    - 10.4 Si se intenta reproducir la canci�n anterior a la primera, el sistema deber� comenzar con la �ltima de la lista.


- **11. Mostrar informaci�n:** El sistema deber�a mostrarle al usuario la informaci�n de la canci�n que se est� reproduciendo en una ventana emergente.
    - 11.1 El sistema deber�a proveer con una interfaz para mostrar al usuario informaci�n relevante sobre la canci�n actual.
    - 11.2 Se deber�a poder mostrar el artista, �lbum, a�o y g�nero musical de la canci�n actualmente en reproducci�n.
    - 11.3 El sistema no permitir� abrir m�ltiples ventanas de informaci�n de pista.
    - 11.4 Al presionar m�s de una vez el bot�n para mostrar la informaci�n, se abrir� y cerrar� la misma ventana respectivamente.


- **12. Mostrar portada:** El sistema deber�a mostrar la portada del �lbum que se est� reproduciendo.
    - 12.1 Se deber�a proveer una interfaz para mostrar la portada del �lbum de la canci�n actual.
    - 12.2 No se permitir� abrir m�s de una instancia de la ventana del �lbum.
    - 12.3 Si se presiona m�s de una vez el bot�n para ver la portada, se abrir� y cerrar� la misma ventana respectivamente.


- **13. Modificar volumen:** El sistema deber�a permitir al usuario cambiar de volumen.
    - 13.1 El sistema deber� proveer con la interfaz de una barra deslizable para seleccionar el volumen de reproducci�n.
    - 13.2 El nivel de volumen se podr� modificar arrastrando el selector de la barra con el mouse.
    - 13.3 El sistema deber� contar con un bot�n de mute o silencio, que baje el volumen al m�nimo sin necesidad de interactuar con la barra selectora.

#### 5.1 Requerimientos no funcionales
Se detallan a continuaci�n los requerimientos no funcionales que precisen un mayor desarrollo: 

- **1. Facilidad de uso:** Un usuario promedio (que haya utilizado alguna vez un reproductor MP3) deber�a ser capaz de utilizar todas las funcionalidades del sistema con un entrenamiento de 5 minutos.
    - 1.1 La UI deber� ser dise�ado de manera simple, con menos de 10 botones para minimizar la confusi�n del usuario ante el sistema.
    - 1.2 Un usuario promedio, que ya conozca las funciones que brinda un reproductor de m�sica, deber� ser capaz de utilizar el sistema en su totalidad luego de 5 minutos de interacci�n con el mismo.


- **2. Mantenibilidad:** El sistema deber�a ser f�cilmente mantenible, por lo que se deber�a separar la l�gica de la interfaz de usuario.
	- 2.1 La l�gica del sistema deber� ser intercambiable.
	- 2.2 La UI deber� ser intercambiable.
	- 2.3 Modificaciones en los m�dulos del sistema deber�an ser f�cilmente aplicables.    

- **3. Portabilidad:** El sistema deber� funcionar en las plataformas m�s populares, entre ellas Windows y Mac Os.
	- 3.1 El sistema deber� ser utilizable en el sistema operativo Windows 10.
	- 3.2 El sistema deber� ser utilizable en el sistema operativo OS X El Capitan.
	- 3.3 El sistema deber�a funcionar correctamente en distribuciones Linux. 