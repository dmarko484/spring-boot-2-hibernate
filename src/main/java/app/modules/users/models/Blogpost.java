package app.modules.users.models;


import app.modules.core.AbstractEntity;

import javax.persistence.*;

@Entity
@Table(name = "blogs")
public class Blogpost extends AbstractEntity {

    String title;
    String text;

    @ManyToOne(fetch = FetchType.LAZY)
    User autor;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAutor() {
        return autor;
    }

    public void setAutor(User autor) {
        this.autor = autor;
    }



}
