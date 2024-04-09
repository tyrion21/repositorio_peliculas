package com.jason.pelicula.services;

import java.util.List;
import java.util.Optional;

import com.jason.pelicula.model.Pelicula;


/**
 * PeliculaService
 */
public interface PeliculaService {

    List<Pelicula> getAllPeliculas();    
    Optional<Pelicula> getPeliculaById(Long id);
    
}