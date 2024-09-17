# ¿Qué es EJB (Enterprise JavaBeans)?

**Enterprise JavaBeans (EJB)** es una especificación de Java para el desarrollo de **componentes empresariales** distribuidos y transaccionales. Forma parte de la plataforma **Java EE (ahora Jakarta EE)** y está diseñado para simplificar el desarrollo de aplicaciones escalables, seguras y de alto rendimiento en el entorno empresarial.

### Características principales de EJB:

1. **Componentes empresariales**: Los EJB son componentes que se ejecutan en un servidor de aplicaciones, lo que permite manejar transacciones, seguridad, concurrencia y persistencia de datos de manera robusta y escalable.
   
2. **Modelo distribuido**: EJB facilita el desarrollo de aplicaciones distribuidas, donde los componentes pueden estar en diferentes servidores o nodos, permitiendo manejar gran cantidad de usuarios o peticiones simultáneas.

3. **Transacciones automáticas**: Los EJB manejan las transacciones de manera automática, lo que significa que el programador no tiene que gestionar explícitamente las transacciones. Esto es especialmente útil para aplicaciones que realizan múltiples operaciones sobre bases de datos.

4. **Seguridad**: EJB proporciona un marco de seguridad que facilita la definición de permisos de acceso a los métodos y componentes. La seguridad se puede configurar declarativamente o programáticamente.

5. **Tipos de EJB**:
   - **Session Beans**: Los más comunes, que representan la lógica de negocio. Se dividen en:
     - **Stateful Session Beans**: Mantienen el estado entre diferentes llamadas del cliente.
     - **Stateless Session Beans**: No mantienen ningún estado entre llamadas; son los más comunes para lógica de negocio.
   - **Message-Driven Beans (MDB)**: Responden a mensajes asíncronos enviados a través de colas o tópicos de mensajería (como **JMS**).
   
6. **Ciclo de vida gestionado por el contenedor**: Los beans (componentes) no son gestionados por el desarrollador, sino por el contenedor EJB (el servidor de aplicaciones), que se encarga de instanciar, destruir, gestionar el ciclo de vida y manejar la concurrencia.

7. **Integración con JPA**: EJB suele trabajar de la mano con **Java Persistence API (JPA)** para manejar la persistencia de objetos en bases de datos. Esto hace que el trabajo con bases de datos sea más sencillo y abstracto.

### Ejemplo básico de un EJB:

```java
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

@Stateless
@LocalBean
public class CalculadoraBean {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }
}
```

En este ejemplo:

1. `@Stateless`: Indica que este es un **Stateless Session Bean**, lo que significa que no mantendrá el estado entre las invocaciones.
2. `@LocalBean`: Permite que el bean sea invocado desde clientes locales sin la necesidad de una interfaz.
3. `CalculadoraBean`: Contiene la lógica de negocio, en este caso, dos métodos que realizan operaciones matemáticas simples.

### ¿Cuándo usar EJB?

- **Aplicaciones empresariales** que requieren manejo de transacciones distribuidas, seguridad avanzada y concurrencia controlada.
- **Aplicaciones de gran escala**, donde múltiples usuarios o procesos acceden y modifican los mismos recursos de manera concurrente.
- **Sistemas distribuidos** donde la lógica de negocio necesita ejecutarse en varios servidores de manera coordinada.

### Alternativas a EJB:
Aunque EJB fue muy popular en los primeros días de **Java EE**, frameworks como **Spring** han ganado mucha popularidad debido a su simplicidad y flexibilidad, ya que proporcionan muchas de las mismas características que EJB (como transacciones, seguridad y persistencia) sin la complejidad de configurar un servidor de aplicaciones completo.

Sin embargo, EJB sigue siendo relevante en proyectos donde se requiere el cumplimiento estricto de los estándares **Jakarta EE** o en entornos empresariales que ya están usando esta arquitectura.

En resumen, **EJB** es una tecnología poderosa para desarrollar aplicaciones empresariales, proporcionando soporte para transacciones distribuidas, seguridad y escalabilidad.
