package com.rmi.cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import com.rmi.interfaz.IServicioRemoto;
import com.rmi.dto.MensajeDTO;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            // 1. Conectar al registro RMI (localhost en puerto 1099)
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // 2. Localizar el servicio remoto por su alias
            IServicioRemoto servicio = (IServicioRemoto) registry.lookup("ServicioInventario");

            // 3. Empaquetar la información en un DTO
            MensajeDTO mensajeEnvio = new MensajeDTO("Cliente-01", "Solicitando actualización del sistema.");
            System.out.println("Enviando mensaje al servidor: " + mensajeEnvio.getContenido());

            // 4. Invocar el método a través de la red
            MensajeDTO respuesta = servicio.procesarMensaje(mensajeEnvio);

            // 5. Desempaquetar y mostrar la respuesta
            System.out.println("\n--- [CLIENTE] Respuesta Recibida ---");
            System.out.println("De: " + respuesta.getRemitente());
            System.out.println("Mensaje: " + respuesta.getContenido());

        } catch (Exception e) {
            System.err.println("Error en el cliente RMI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}