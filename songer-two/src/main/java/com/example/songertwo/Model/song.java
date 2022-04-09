package com.example.songertwo.Model;


import javax.persistence.*;

@Entity
public class song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private float length ;
    private int trackNumber;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Albums album;

    public song(){

    }

    public song(String title, float length, int trackNumber, Albums album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public song(String title, float length, int trackNumber) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Long getId() {
        return id;
    }

    public Albums getAlbum() {
        return album;
    }
}