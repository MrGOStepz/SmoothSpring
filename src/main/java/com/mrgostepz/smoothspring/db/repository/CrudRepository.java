package com.mrgostepz.smoothspring.db.repository;

import java.util.List;

public interface CrudRepository<T,ID> {
   List<T> getAll();
   T getById(ID id);
   Boolean add(T t);
   Boolean update(T t);
   Boolean deleteById(ID id);

}
