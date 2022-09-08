package com.example.recyclerview;

public class Item {
    private String mImageUrl;
    private String mCreatorName;
    private int mLikes;

    public Item(String imageUrl, String creatorName, int likes) {
        this.mImageUrl = imageUrl;
        this.mCreatorName = creatorName;
        this.mLikes = likes;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCreatorName() {
        return mCreatorName;
    }

    public int getLikes() {
        return mLikes;
    }
}
