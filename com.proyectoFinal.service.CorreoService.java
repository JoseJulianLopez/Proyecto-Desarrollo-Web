package com.proyectoFinal.service;


import jakarta.mail.MessagingException;

/**
 *
 * @author kenneth
 */
public interface CorreoService {
    public void enviarCorreoHtml(
            String para,
            String asunto,
            String contenidoHtml)          
            throws MessagingException;
    
}
