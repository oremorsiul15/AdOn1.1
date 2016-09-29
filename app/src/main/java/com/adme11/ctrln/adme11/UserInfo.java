package com.adme11.ctrln.adme11;

/**
 * Created by oremo on 6/1/2016.
 */
public class UserInfo {
    private String id;
    private String username;
    private String category;
    private String image;
    private String company;
    private String views;


    public UserInfo() {
    }

    public UserInfo(String id, String username, String category, String image, String company, String views) {
        this.id = id;
        this.username = username;
        this.category = category;
        this.image = image;
        this.company = company;
        this.views = views;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getViews() {
        return this.views;
    }

    public void setViews(String views) {
        this.views = views;
    }


}
