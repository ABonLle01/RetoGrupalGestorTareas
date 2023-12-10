package com.example.retogrupalgestiontareas.domain;

import com.example.retogrupalgestiontareas.domain.entities.alumn.Alumno;

import java.util.List;

public interface DAO<T> {

    public List<T> getAllByAlumno(Alumno a);

    public T get(Long id);

    public List<T> getAll(Integer tutor);

    public T save(T data);

    public Alumno update(T data);

    public void delete(T data);


}