# POO_final
Consignas Trabajo Final - Programación Orientado a Objetos 

CONSIGNA TRABAJO PRÁCTICO FINAL
Desarrollar un sistema de gestión de un garaje siguiendo las siguientes
especificaciones.

En el garaje se cambian las ruedas tanto de coches como de motos. El precio del
cambio de una rueda se fija al abrir el garaje, al igual que la capacidad máxima de vehículos, ya
sean motos o coches. Si no hubiese lugar disponible para registrar un vehículo nuevo, habrá
que tener contemplado un sistema de aviso
para quien esté dejando su vehículo.

El sistema de gestión del garaje requiere un mecanismo para ingresar y retirar los
vehículos, conocer el número total de vehículos recibidos en ese momento, el precio que
supondría cambiar todas las ruedas de todos los vehículos, y el kilometraje medio de todos
ellos.

La información que manejaremos de los coches entre otras cosas es la marca y el
número de puertas. Mientras que de las motos será la marca y la cilindrada.
2
Las clases relacionadas con los vehículos se guardarán en el paquete vehículos
mientras que las clases Garaje y GarajeTest se guardarán en el paquete
sistemaGaraje.

La clase GarajeTest tiene un método main en el que se crea un Garaje, una serie de
vehículos que se irán recibiendo en el garaje y por último se imprimirá por pantalla
toda la información general del garaje así como la información de cada vehículo. para

Garage
<!-- atributos  -->
precio cambio de rueda // se fija al principio de la apertura del programa
capacidad vehiculos // se fija al principio de la apertura del programa
cantidad vehiculos // cantidad de vehiculos actual - se muestra en el menu siempre actualizado
<!-- metodos -->
ingreso vehiculo // verifica si hay lugar en el garaje. si hay, realiza el ingreso. 
egreso vehiculo // elimina un vehiculo del garaje
precio cambio de rueda total // precio total de cambio de rueda de todos los vehiculos
kilometraje medio // kilometraje medio de todos los vehiculos ingresados
cambiar rueda // metodo

Vehiculo abstract
patente // para identificar el auto que se va a eliminar del garaje
marca
kilometraje 

Moto
cilindrada
ruedas

Auto
numero de puertas
ruedas