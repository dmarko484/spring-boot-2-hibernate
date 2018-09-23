package app.modules.users.models;


import app.modules.core.AbstractEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "discussions")
public class Discussion extends AbstractEntity {

    String linkIdx;

    String text;
    Date created;

    @ManyToOne(fetch = FetchType.LAZY)
    User autor;

    public String getLinkIdx() {
        return linkIdx;
    }

    public void setLinkIdx(String linkIdx) {
        this.linkIdx = linkIdx;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public User getAutor() {
        return autor;
    }

    public void setAutor(User autor) {
        this.autor = autor;
    }
}
