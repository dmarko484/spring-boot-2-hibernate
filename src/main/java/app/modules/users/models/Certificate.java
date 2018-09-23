package app.modules.users.models;

import app.modules.core.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "certificates")
public class Certificate extends AbstractEntity {

    String name;

    @ManyToOne(fetch= FetchType.LAZY)
    Company issuer;

    @ManyToOne(fetch= FetchType.LAZY)
    User user;

    Date validFrom;
    Date validTo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getIssuer() {
        return issuer;
    }

    public void setIssuer(Company issuer) {
        this.issuer = issuer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }
}
