package com.example.songertwo.Model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Albums {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int length;
    private int songCount;
    private String title;
    private String imageUrl;
    private String artist;


    @OneToMany(mappedBy = "album")
    private List<song> songs;



    public Albums() {
    }

    public Albums(int length, int songCount, String title, String imageUrl, String artist) {
        this.length = length;
        this.songCount = songCount;
        this.title = title;
        this.imageUrl = imageUrl;
        this.artist = artist;
    }

    public List<song> getSongs() {
        return songs;
    }

    public void setSongs(List<song> songs) {
        this.songs = songs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getLength() {
        return length;
    }

    public int getSongCount() {
        return songCount;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getArtist() {
        return artist;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}