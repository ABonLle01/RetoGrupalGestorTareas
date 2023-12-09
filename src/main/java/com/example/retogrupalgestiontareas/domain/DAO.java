package com.example.retogrupalgestiontareas.domain;

import com.example.retogrupalgestiontareas.domain.entities.user.Usuario;

import java.util.ArrayList;

public interface DAO<T> {

    public ArrayList<T> getAllByUser(Usuario u);

    public T get(Long id);

    public T save(T data);

    public void update(T data);

    public void delete(T data);
}