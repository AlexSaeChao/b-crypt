package com.operator.bcrypt.models;

import com.operator.bcrypt.models.Post;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Operator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String userName;
    String password;
    @OneToMany(mappedBy = "operator")
    List<Post> post;

    protected Operator(){}

    public Operator(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Once Recipes List is created, we WILL NEED a getter for it

    @Override
    public String toString() {
        return "Operator{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
