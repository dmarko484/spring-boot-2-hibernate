package app.modules.core;

import org.springframework.beans.factory.annotation.Autowired;

public class AbstractService<T> {

    @Autowired
    T repository;


    public T getRepository() {
        return repository;
    }



}
