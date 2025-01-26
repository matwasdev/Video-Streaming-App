package com.example.VideoStreamingApp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "videos")
@Getter
@Setter
@AllArgsConstructor
public class Video {

    @Id
    private int Id;

    @Column
    private String title;

    @Column
    private String description;

    @Column(nullable = false)
    private String path;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private MyUser myUser;

    @ManyToMany(mappedBy = "savedVideos")
    private Set<MyUser> usersWhoSaved = new HashSet<MyUser>();


    @Column
    private LocalDateTime createdAt;


}
