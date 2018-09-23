package app.modules.users.models;


import app.modules.core.AbstractEntity;

import javax.persistence.*;
import java.util.Currency;

@Entity
@Table(name = "products")
public class Product extends AbstractEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    Company vendor;

    String name;
    String pid;

    Currency price;


    public Company getVendor() {
        return vendor;
    }

    public void setVendor(Company vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }
}
