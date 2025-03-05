1. ¿Qué representa esta clase? ¿Qué información contiene?
Esta clase representa un jugador en este caso de un equipo de futbol. En dicha clase se encuentran datos de tipo String y tipo int ya que contiene la siguiente informacion:
nombre, edad, posicion, numero de camiseta y equipo.

2. ¿Por qué es importante inicializar los atributos al crear un objeto? ¿Qué pasaría si no usáramos un constructor?
Es importante inicializar los atributos para garantizar que cada objeto tenga valores definidos desde su creación. Si no usáramos un constructor, los atributos podrían quedar sin asignar o con valores por defecto, lo que podría generar errores al intentar utilizarlos.

3. ¿Por qué no accedemos directamente a los atributos desde otras clases? ¿Qué ventajas tiene usar getters y setters?
No accedemos directamente a los atributos para aplicar el principio de encapsulamiento, lo que ayuda a proteger los datos y controlar su acceso. Los getters y setters permiten validar y modificar los valores de forma segura sin exponer los atributos directamente.

4. ¿Qué otros métodos podrían ser útiles para la clase Jugador? ¿Cómo podríamos mejorar este método?
Se podrían agregar métodos como anotarGol o recibirTarjeta para modificar atributos específicos según eventos del juego. Para mejorar mostrarInformacion(), podríamos formatear la salida con colores o usar toString() para facilitar su reutilización.

5. ¿Qué aprendiste al crear y utilizar objetos? ¿Cómo cambia el estado de un objeto cuando usamos métodos set?
Aprendí que los objetos son instancias de una clase y que pueden tener diferentes estados. Cuando usamos métodos set, los valores de los atributos pueden cambiar sin necesidad de crear un nuevo objeto, lo que permite modificar su comportamiento dinámicamente.
