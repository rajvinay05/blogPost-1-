package com.example.blogPost.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue
    Long id;
    String title;
    @Column(columnDefinition = "TEXT")
    String body;
    Date postedOn;

    //Author
    @ManyToOne
    private Author author;

    public Post(){
        //nO ARG CONSTRUCTOR NEEDED FOR JPA
    }

    public Post(String title){
        setTitle(title);
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

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }



    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return "Post [Title="+title+"]";
    }
}
