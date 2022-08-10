package com.quipux.project.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.quipux.project.models.List;
import com.quipux.project.services.ListService;

@RestController
@RequestMapping("/lists")
public class ListController {
    
    @Autowired
    ListService listService;

    @GetMapping()
    public ArrayList<List> getLists(){
        return listService.getLists();
    }

    @PostMapping()
    public List inserList(@RequestBody List list){
        return listService.insertList(list);
    }
    
   
    @GetMapping(path = "/{listName}")
    public ArrayList<List> getListsByName(@PathVariable("listName") String listName){
        return listService.getListsByName(listName);
    }

    @DeleteMapping(path = "/{listName}")
    public String deleteListByName(@PathVariable("listName") String listName){
        String aux = listService.deleteList(listName);
        
        if(aux == "true"){
            return "Se eliminó satisfactoriamente " + aux;
        }else{
            return "Error " + aux;
        }
    }

}
