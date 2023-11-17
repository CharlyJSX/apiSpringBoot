package com.spring.dataclouder.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.dataclouder.Model.UsuarioModel;

import java.util.List;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract List<UsuarioModel> findByPrioridad(Integer prioridad);
}
