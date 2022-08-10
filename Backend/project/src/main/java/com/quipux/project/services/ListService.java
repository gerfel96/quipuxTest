package com.quipux.project.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quipux.project.models.List;
import com.quipux.project.repositories.ListRepository;

@Service
public class ListService {
    @Autowired
    ListRepository listRepository;

    public ArrayList<List> getLists(){
        return (ArrayList<List>) listRepository.findAll();
    }

    public List insertList(List list){
        return listRepository.save(list);
    }

    
    public ArrayList<List> getListsByName(String listName){
        return listRepository.findBylistName(listName);
    }

         
    public String deleteList(String listName){
        
        try {
            listRepository.deleteBylistName(listName);
            return "true";
        } catch (Exception err) {
            return err.toString();
        }

    }

    
}
