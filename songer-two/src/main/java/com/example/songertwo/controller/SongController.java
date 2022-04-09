package com.example.songertwo.controller;


import com.example.songertwo.Model.Albums;
import com.example.songertwo.Model.song;
import com.example.songertwo.Repository.REPO;
import com.example.songertwo.Repository.SongRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired
    private REPO albumRepository;

    @Autowired
    private SongRepo songRepository;

    @PostMapping( "/addSong")
    public RedirectView addNewSong(String title , float length, int trackNumber , Long id){
        Albums album = albumRepository.findById(id).orElseThrow();
        song song = new song(title,length,trackNumber,album);
        songRepository.save(song);

        return new RedirectView("/albums/"+id+"/songs");
    }

    @GetMapping("/songs")
    public String getAllSongs(Model model){

        model.addAttribute("songs", songRepository.findAll());
        return "songs";
    }
}