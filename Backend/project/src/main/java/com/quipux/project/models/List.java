package com.quipux.project.models;

import java.util.Set;

import javax.persistence.*;

@Entity
public class List {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long list_id;
    
    @Column(nullable = false)
    private String listName;

   

    @ManyToMany
    @JoinTable(name="list_songs", joinColumns = @JoinColumn(name="list_id"), inverseJoinColumns = @JoinColumn(name="song_id"))
    private Set<Song> songs;

   

 

    //Constructors

    public List() {
    }

    public List(Long list_id, String listName, Set<Song> songs) {
        this.list_id = list_id;
        this.listName = listName;
        this.songs = songs;
    }

    

    //Getters and Setters

    public Long getList_id() {
        return list_id;
    }

    public void setList_id(Long list_id) {
        this.list_id = list_id;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }

    //Hashcode, equals and toString

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((list_id == null) ? 0 : list_id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        List other = (List) obj;
        if (list_id == null) {
            if (other.list_id != null)
                return false;
        } else if (!list_id.equals(other.list_id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "List [list_id=" + list_id + ", listName=" + listName + ", songs=" + songs + "]";
    }
    
    

}
