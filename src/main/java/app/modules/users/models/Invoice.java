package app.modules.users.models;


import app.modules.core.AbstractEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "invoices")
public class Invoice extends AbstractEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    User autor;

    String subject;
    String num;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "invoice")
    Set<LineItem> items;


    public Invoice() {
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public User getAutor() {
        return autor;
    }

    public void setAutor(User autor) {
        this.autor = autor;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Set<LineItem> getItems() {
        return items;
    }

    public void setItems(Set<LineItem> items) {
        this.items = items;
    }



}
