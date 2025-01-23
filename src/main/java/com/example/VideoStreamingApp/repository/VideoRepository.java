package com.example.VideoStreamingApp.repository;

import com.example.VideoStreamingApp.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
