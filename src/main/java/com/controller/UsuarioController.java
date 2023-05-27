package com.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Usuario;
import com.services.UsuarioSVC;

@RestController
@RequestMapping("/index")
public class UsuarioController {

	@Autowired
	UsuarioSVC usuarioSvc;
	
	@GetMapping()
	public ArrayList<Usuario> obtenerUsuarios(){
		return this.usuarioSvc.obtenerUsuarios();
	}
	
	@PostMapping()
	public Usuario guardar(@RequestBody Usuario usuario) {
		return this.usuarioSvc.guardar(usuario);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Usuario> encontrarPorId(@PathVariable("id") Long id){
		return this.usuarioSvc.encontrarPorId(id);
	}
	
	@GetMapping("/query")
	public ArrayList<Usuario> encontrarPorPrioridad(@RequestParam("prioridad") Integer prioridad){
		return this.usuarioSvc.encontrarPorPrioridad(prioridad);
	}
	
	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.usuarioSvc.eliminarUsuario(id);
		if(ok == true) {
			return "Se elimino el usuario con id: " + id;
		} else {
			return "No se ha podido eliminar el usuario con id: " + id;
 		}
	}
	
}
