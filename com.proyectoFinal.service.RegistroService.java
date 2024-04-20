package com.proyectoFinal.service;

import com.proyectoFinal.domain.Usuario;
import jakarta.mail.MessagingException;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author kenneth
 */
public interface RegistroService {
    
    public Model activar(Model model, String usuario, String clave);//se activa por el correo que se envia
    
    public Model crearUsuario(Model model, Usuario usuario) throws MessagingException;
    
    public void activar(Usuario usuario, MultipartFile imagenFile);//se activa a nivel de codigo de la base de datos
    
    public Model recordarUsuario(Model model, Usuario usuario) throws MessagingException;
}
