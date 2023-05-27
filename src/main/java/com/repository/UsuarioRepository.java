package com.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.model.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
     
	public abstract ArrayList<Usuario> findByPrioridad(Integer prioridad);
}
