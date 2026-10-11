package com.rmi.dto;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) para encapsular la información
 * que viajará entre el cliente y el servidor.
 */
public class MensajeDTO implements Serializable {
    
    // Identificador único para la compatibilidad binaria en la red (Unmarshalling)
    private static final long serialVersionUID = 1L;
    
    private String remitente;
    private String contenido;
    private long timestamp;

    public MensajeDTO(String remitente, String contenido) {
        this.remitente = remitente;
        this.contenido = contenido;
        this.timestamp = System.currentTimeMillis();
    }

    // Getters y Setters
    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + remitente + "]: " + contenido;
    }
}