package com.quipux.project.models;

import javax.persistence.*;

@Entity
public class Song {
    
    
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long song_id;

    @Column(nullable = false)
    private String song_name;

    @Column(nullable = false)
    private String song_artist;

    @Column(nullable = false)
    private String song_album;

    @Column(nullable = false)
    private String song_anno;
    
    //Constructors

    public Song() {
    }

    public Song(Long song_id, String song_name, String song_artist, String song_album, String song_anno) {
        this.song_id = song_id;
        this.song_name = song_name;
        this.song_artist = song_artist;
        this.song_album = song_album;
        this.song_anno = song_anno;
    }
    
    // Getters and Setters

    public Long getSong_id() {
        return song_id;
    }
    public void setSong_id(Long song_id) {
        this.song_id = song_id;
    }
    public String getSong_name() {
        return song_name;
    }
    public void setSong_name(String song_name) {
        this.song_name = song_name;
    }
    public String getSong_artist() {
        return song_artist;
    }
    public void setSong_artist(String song_artist) {
        this.song_artist = song_artist;
    }
    public String getSong_album() {
        return song_album;
    }
    public void setSong_album(String song_album) {
        this.song_album = song_album;
    }
    public String getSong_anno() {
        return song_anno;
    }
    public void setSong_anno(String song_anno) {
        this.song_anno = song_anno;
    }

    //Hashcode, equals and toString

    @Override
    public String toString() {
        return "Song [song_album=" + song_album + ", song_anno=" + song_anno + ", song_artist=" + song_artist
                + ", song_id=" + song_id + ", song_name=" + song_name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((song_id == null) ? 0 : song_id.hashCode());
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
        Song other = (Song) obj;
        if (song_id == null) {
            if (other.song_id != null)
                return false;
        } else if (!song_id.equals(other.song_id))
            return false;
        return true;
    }


}
