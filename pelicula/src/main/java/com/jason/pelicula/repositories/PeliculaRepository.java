package com.jason.pelicula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jason.pelicula.model.Pelicula;

public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

}