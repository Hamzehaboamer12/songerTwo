package com.example.songertwo.Model;


import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

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



    public Albums() {
    }

    public Albums(int length, int songCount, String title, String imageUrl, String artist) {
        this.length = length;
        this.songCount = songCount;
        this.title = title;
        this.imageUrl = imageUrl;
        this.artist = artist;
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