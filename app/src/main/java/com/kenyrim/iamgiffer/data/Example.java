package com.kenyrim.iamgiffer.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("file")
    @Expose
    private File file;
    @SerializedName("liked")
    @Expose
    private Boolean liked;
    @SerializedName("ad")
    @Expose
    private Boolean ad;
    @SerializedName("safeStatus")
    @Expose
    private String safeStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Example withId(String id) {
        this.id = id;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Example withWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Example withHeight(Integer height) {
        this.height = height;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Example withKind(String kind) {
        this.kind = kind;
        return this;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Example withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Example withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Example withFile(File file) {
        this.file = file;
        return this;
    }

    public Boolean getLiked() {
        return liked;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }

    public Example withLiked(Boolean liked) {
        this.liked = liked;
        return this;
    }

    public Boolean getAd() {
        return ad;
    }

    public void setAd(Boolean ad) {
        this.ad = ad;
    }

    public Example withAd(Boolean ad) {
        this.ad = ad;
        return this;
    }

    public String getSafeStatus() {
        return safeStatus;
    }

    public void setSafeStatus(String safeStatus) {
        this.safeStatus = safeStatus;
    }

    public Example withSafeStatus(String safeStatus) {
        this.safeStatus = safeStatus;
        return this;
    }

}
