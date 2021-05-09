package com.RegistrationandLogin.core.abstracts.repository;

import java.util.List;

public interface BaseService<T>{
    void add(T entity);
    void update(T entity);
    void delete(T entity);
    void deleteById(int id);
    T getOne(int id);
    List<T> getAll();
}
