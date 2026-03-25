## Parcial AREP - Jeisson Sanchez

### Descripcion del proyecto:

Diseñe un prototipo de sistema de microservicios que tenga un servicio (En la figura se representa con el nombre Math Services) para computar las funciones numéricas.  El servicio de las funciones numéricas debe estar desplegado en al menos dos instancias virtuales de EC2. Adicionalmente, debe implementar un service proxy que reciba las solicitudes de llamado desde los clientes  y se las delegue a las dos instancias del servicio numérico usando un algoritmo de round-robin. El proxy deberá estar desplegado en otra máquina EC2. Asegúrese de poder configurar las direcciones y puertos de las instancias del servicio en el proxy usando variables de entorno del sistema operativo.  Finalmente, construya un cliente Web mínimo con un formulario que reciba el valor y de manera asíncrona invoke el servicio en el PROXY. Puede hacer un formulario para cada una de las funciones. El cliente debe ser escrito en HTML y JS.

### Problema Matematico:

#### Conjetura de Collatz:

La conjetura de Collatz dice que si usted crea una secuencia de números, a partir de cualquier entero positivo, siguiendo las reglas descritas abajo, siempre la secuencia terminará en le número 1. Esta conjetura aún no se ha demostrado.

Las reglas son:
 - f(n) = n/2 si es par
 - f(n) = 3n + 1 si es impar

 Se construye la secuencia asi:

 - a(0) = k
 - a(i) = f(a(i)-1)

 Por ejemplo:

 k = 13

 Quedaria la secuencia asi:

 13→40→20→10→5→16→8→4→2→1



 #### Evidencias de ejecucion:
 EC2 creadas:
 - Proxy:
    
    ![alt text](/images/proxy.png)

 - MathService 1:

    ![alt text](/images/mathservice1.png)
 
 - MathService 2:

    ![alt text](/images/mathservice2.png)