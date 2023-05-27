package com.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Usuario;
import com.repository.UsuarioRepository;

@Service
public class UsuarioSvcIMPL implements UsuarioSVC{

	@Autowired
	UsuarioRepository usuarioRepo;
	
	public ArrayList<Usuario> obtenerUsuarios(){
		return(ArrayList<Usuario>)usuarioRepo.findAll();
	}
	
	public Usuario guardar(Usuario usuario) {
		return usuarioRepo.save(usuario);	
	}
	
	public Optional<Usuario> encontrarPorId(Long id) {
		return usuarioRepo.findById(id);
    }
    
	public ArrayList<Usuario> encontrarPorPrioridad(Integer prioridad){
		return usuarioRepo.findByPrioridad(prioridad);	
    }
	
	public boolean eliminarUsuario(Long id) {
		try {
			usuarioRepo.deleteById(id);
			return true;
		    } catch (Exception e) {
			return false;
		    }
	}
	
}	
		
		
	
	
	
