package com.example.VideoStreamingApp.controller;

import com.example.VideoStreamingApp.model.MyUser;
import com.example.VideoStreamingApp.model.Video;
import com.example.VideoStreamingApp.service.VideoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("videos")
public class VideoController {

    private VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

//    @PostMapping("/upload")
//    public ResponseEntity<?> uploadVideo(@RequestBody Video video) {
//        String loggedUser = SecurityContextHolder.getContext().getAuthentication().getName();
//        Video video1 = videoService.uploadVideo(video,loggedUser); ///TODO CHANGE SO EVERYONE CAN UPLOAD
//        if(video1 != null)
//            return ResponseEntity.status(HttpStatus.CREATED).body("Video uploaded successfully");
//    }



}
