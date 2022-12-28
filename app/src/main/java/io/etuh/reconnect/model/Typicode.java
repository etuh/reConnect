package io.etuh.reconnect.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Typicode {
    @SerializedName("posts")
    @Expose
    private Posts posts;
    @SerializedName("comments")
    @Expose
    private Comments comments;
    @SerializedName("users")
    @Expose
    private Users users;

    public Posts getPosts() {
        return posts;
    }

    public void setPosts(Posts posts) {
        this.posts = posts;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
