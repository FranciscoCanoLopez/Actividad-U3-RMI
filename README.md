# Sistema Cliente-Servidor con Java RMI (Remote Method Invocation)

Este proyecto implementa una arquitectura distribuida profesional utilizando Java RMI. Demuestra la interacción en red entre dos procesos de Máquina Virtual de Java (JVM) independientes, simulando un entorno Cliente-Servidor.

🚀 Características Principales

Patrón DTO (Data Transfer Object): Intercambio seguro de objetos serializables bidireccionalmente.

Arquitectura Limpia: Separación estricta entre la Interfaz Remota y su Implementación.

Gestión Autónoma: Creación dinámica del registro RMI (rmiregistry) en tiempo de ejecución.

Seguridad Integrada: Aplicación de políticas de seguridad estrictas mediante archivos .policy.

Automatización: Scripts .bat para compilación y ejecución rápida en Windows.

📂 Estructura del Proyecto

Actividad RMI/
├── bin/                          # Clases compiladas (.class)
├── cliente.policy                # Política de seguridad para el Cliente
├── servidor.policy               # Política de seguridad para el Servidor
├── compilar.bat                  # Script de compilación automatizada
├── ejecutar-cliente.bat          # Script para iniciar el Cliente
├── ejecutar-servidor.bat         # Script para iniciar el Servidor
├── README.md                     # Documentación del proyecto
└── src/
    └── main/java/com/rmi/
        ├── cliente/
        │   └── ClienteRMI.java        # Localiza e invoca los métodos remotos
        ├── dto/
        │   └── MensajeDTO.java        # Objeto serializable que viaja por la red
        ├── interfaz/
        │   └── IServicioRemoto.java   # Contrato de métodos (extends Remote)
        └── servidor/
            ├── ServicioRemotoImpl.java # Lógica de los métodos expuestos
            └── ServidorRMI.java       # Inicia el registro en el puerto 1099


🛠️ Requisitos Previos

Java Development Kit (JDK): Versión 8, 17 o superior instalada.

Variables de Entorno: La ruta del JDK (carpeta bin) debe estar agregada a la variable PATH de tu sistema operativo para reconocer el comando javac.

⚙️ Instrucciones de Ejecución (Windows)

Gracias a los scripts de automatización, probar el sistema es muy sencillo:

Compilar el código:
Haz doble clic en el archivo compilar.bat. Verás que se genera una carpeta bin con todos los binarios listos.

Iniciar el Servidor:
Haz doble clic en ejecutar-servidor.bat. Se abrirá una consola indicando que el registro RMI fue creado en el puerto 1099 y está a la espera de peticiones. (Mantén esta ventana abierta).

Iniciar el Cliente:
Haz doble clic en ejecutar-cliente.bat. En esta consola verás cómo se empaqueta el DTO, viaja hacia el servidor, y se recibe la respuesta exitosa.

🌐 Ejecución en Red Local (LAN)

Si deseas ejecutar el servidor en una computadora y el cliente en otra:

En ClienteRMI.java, cambia "localhost" por la dirección IP de la computadora servidor (ej. "192.168.1.50").

Asegúrate de que ambas computadoras estén en la misma red WiFi o LAN.

Asegúrate de que el firewall de Windows del servidor permita conexiones entrantes por el puerto 1099