package com.example.songertwo.Repository;

import com.example.songertwo.Model.Albums;
import org.springframework.data.jpa.repository.JpaRepository;

public interface REPO extends JpaRepository<Albums,Long> {
}
