package com.example.blogPost.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue
    Long id;
    String firstName;
    String lastName;

    //Post
    @OneToMany(mappedBy = "author")
    private List<Post> posts;


    private Author(){

    }

    public Author(String first, String last){
        this.setFirstName(first);
        this.setLastName(last);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return "Author[FirstName="+firstName+"LastName="+lastName+"]";
    }
}
