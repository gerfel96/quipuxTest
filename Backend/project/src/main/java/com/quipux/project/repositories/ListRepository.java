package com.quipux.project.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quipux.project.models.List;

@Repository
public interface ListRepository extends CrudRepository<List, Long> {
    
    public abstract ArrayList<List> findBylistName(String listName);

    @Transactional
    public abstract void deleteBylistName(String listName);

}
