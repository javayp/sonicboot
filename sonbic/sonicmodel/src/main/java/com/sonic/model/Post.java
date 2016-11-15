package com.sonic.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by prash on 11/9/2016.
 */
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String body;

    private Date posted;

    @ManyToOne
    private Author author;

    //Needed by JPA
    private Post() {
    }

    //Our public constructor makes sure title is set when creating a new post
    public Post(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", posted=" + posted +
                ", author=" + author +
                '}';
    }
}
