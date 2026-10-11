package com.rmi.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import com.rmi.interfaz.IServicioRemoto;
import com.rmi.dto.MensajeDTO;

/**
 * Implementación de los servicios remotos.
 * Hereda de UnicastRemoteObject para poder exportarse en la red.
 */
public class ServicioRemotoImpl extends UnicastRemoteObject implements IServicioRemoto {

    // El constructor debe lanzar RemoteException
    public ServicioRemotoImpl() throws RemoteException {
        super();
    }

    @Override
    public MensajeDTO procesarMensaje(MensajeDTO mensaje) throws RemoteException {
        System.out.println("\n--- [SERVIDOR] Petición Recibida ---");
        System.out.println("Remitente: " + mensaje.getRemitente());
        System.out.println("Contenido: " + mensaje.getContenido());
        
        // Creamos un nuevo objeto DTO para responderle al cliente
        MensajeDTO respuesta = new MensajeDTO(
            "Servidor", 
            "Mensaje recibido y procesado con éxito."
        );
        
        return respuesta;
    }
}