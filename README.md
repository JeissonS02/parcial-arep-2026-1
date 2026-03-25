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

La salida debe quedar en el siguiente formato:

{</div> <div> </div> <div> "operation": "collatzsequence",</div> <div> </div> <div> "input":  13,</div> <div> </div> <div> "output":  "13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1"</div> <div> </div> <div>}


 ### Evidencias de ejecucion:
 EC2 creadas:
 - Proxy:
    
    ![alt text](/images/proxy.png)

 - MathService 1:

    ![alt text](/images/mathservice1.png)
 
 - MathService 2:

    ![alt text](/images/mathservice2.png)

- Instancias de EC2:

    ![alt text](/images/instances.png)

- Security Groups Para las EC2:

    ![alt text](/images/secgroups.png)

- Prueba Conjetura de Collatz

- Ejecucion desde las EC2:

- Prueba desde navegador:


### Como correr en EC2

1. Nos conectamos por terminal a las EC2 con el comando:
```bash
ssh -i "key.pem" ec2-user@URL-DE-LA-DNS-PUBLICA-DEL-EC2
```
Asi con cada EC2 (mathservice1,mathservice2 y proxy)

2. Dentro del ec2, ejecutamos el archivo compilado
```bash
java -jar "NombreDelArchivoCompilado"
```
Por ejemplo:
```bash
java -jar "math-0.0.01-SNAPSHOT.jar"
```
Ejecutamos el archivo compilado en las 3 maquinas

Al hacer esto, ya debe estar corriendo la API en la URL asignada para cada EC2

3. Una vez corriendo las tres EC2, podemos hacer la prueba:
Ingresamos desde nuestro navegador a la URL asignada para la EC2 de proxy asi:

```bash
http://ec2-user@IP-ASIGNADA:8080/index.html
```
Ya aqui podemos hacer las pruebas de la funcion de Collatz
