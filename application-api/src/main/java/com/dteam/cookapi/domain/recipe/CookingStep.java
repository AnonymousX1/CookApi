package com.dteam.cookapi.domain.recipe;

import java.time.LocalTime;

/**
 * Created by vladlen on 16.29.3.
 */
public class CookingStep {
    private String stepText;
    private String imageURL;
    private String videoURL;
    private LocalTime timer;
    private int likes;

    public String getStepText() {
        return stepText;
    }

    public void setStepText(String stepText) {
        this.stepText = stepText;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public LocalTime getTimer() {
        return timer;
    }

    public void setTimer(LocalTime timer) {
        this.timer = timer;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
