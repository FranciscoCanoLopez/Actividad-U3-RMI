package com.rmi.servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            // 1. Instanciar la implementación del servicio
            ServicioRemotoImpl servicio = new ServicioRemotoImpl();

            // 2. Levantar el registro de nombres RMI en el puerto 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // 3. Vincular la instancia remota bajo un alias
            registry.rebind("ServicioInventario", servicio);

            System.out.println(">>> Servidor RMI Profesional iniciado y escuchando en el puerto 1099 <<<");

        } catch (Exception e) {
            System.err.println("Error al iniciar el servidor RMI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}