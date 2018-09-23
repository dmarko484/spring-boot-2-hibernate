package app.modules.users.models;



import app.modules.core.AbstractEntity;
import org.hibernate.annotations.IndexColumn;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User extends AbstractEntity {

    String firstName;
    String lastName;

    String email;
    String position;
    String nick;

    @ManyToOne(fetch= FetchType.LAZY)
    Company company;

    @OneToOne(mappedBy = "user", fetch= FetchType.LAZY)
    Profile profile;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    List<Certificate> certificates=new ArrayList<>();

    @OneToMany(fetch= FetchType.LAZY, mappedBy = "autor")
    List<Invoice> invoices=new ArrayList<>();


    @OneToMany(fetch= FetchType.LAZY, mappedBy = "autor")
    List<Blogpost> blogposts=new ArrayList<>();

    @OneToMany(fetch= FetchType.LAZY, mappedBy = "autor")
    List<Discussion> discussions=new ArrayList<>();



    public User() {
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Blogpost> getBlogposts() {
        return blogposts;
    }

    public void setBlogposts(List<Blogpost> blogposts) {
        this.blogposts = blogposts;
    }

    public List<Discussion> getDiscussions() {
        return discussions;
    }

    public void setDiscussions(List<Discussion> discussions) {
        this.discussions = discussions;
    }
}
