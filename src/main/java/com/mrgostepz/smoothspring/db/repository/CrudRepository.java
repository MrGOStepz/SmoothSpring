package com.mrgostepz.smoothspring.db.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface CrudRepository<T,ID> {
   List<T> getAll();
   T getById(ID id);
   Integer add(T t);
   Boolean update(T t);
   Boolean deleteById(ID id);
}
