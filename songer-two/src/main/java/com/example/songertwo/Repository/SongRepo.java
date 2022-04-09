package com.example.songertwo.Repository;

import com.example.songertwo.Model.song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepo extends JpaRepository<song, Long> {
}
