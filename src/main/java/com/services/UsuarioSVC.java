package com.services;

import java.util.ArrayList;
import java.util.Optional;

import com.model.Usuario;

public interface UsuarioSVC {
	
	public ArrayList<Usuario> obtenerUsuarios();
	
	public Usuario guardar(Usuario usuario);
	
	public Optional<Usuario> encontrarPorId(Long id);
	
	public ArrayList<Usuario> encontrarPorPrioridad(Integer prioridad);
	
	public boolean eliminarUsuario(Long id);
}
