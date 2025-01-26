package com.example.VideoStreamingApp.service;

import com.example.VideoStreamingApp.model.MyUser;
import com.example.VideoStreamingApp.model.Video;
import com.example.VideoStreamingApp.repository.MyUserRepository;
import com.example.VideoStreamingApp.repository.VideoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class VideoService {

    private static final String STORAGE_DIRECTORY = System.getProperty("user.dir") + File.separator + "videos_stored";
    private MyUserRepository myUserRepository;
    private VideoRepository videoRepository;

    public VideoService(MyUserRepository myUserRepository, VideoRepository videoRepository) {
        this.myUserRepository = myUserRepository;
        this.videoRepository = videoRepository;
    }


    public void saveVideo(MultipartFile videoFile) {
        if(videoFile==null)
            throw new IllegalArgumentException("videoFile cannot be null");

        var targetFile = new File(STORAGE_DIRECTORY + File.separator + videoFile.getOriginalFilename());



    }



}
