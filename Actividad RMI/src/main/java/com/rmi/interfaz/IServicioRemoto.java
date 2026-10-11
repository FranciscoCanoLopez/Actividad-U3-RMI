package com.rmi.interfaz;

import java.rmi.Remote;
import java.rmi.RemoteException;
import com.rmi.dto.MensajeDTO;

/**
 * Contrato de los métodos que el servidor expone a los clientes.
 * Debe extender de java.rmi.Remote.
 */
public interface IServicioRemoto extends Remote {
    
    // Todo método remoto debe lanzar RemoteException
    MensajeDTO procesarMensaje(MensajeDTO mensaje) throws RemoteException;
}