package app.modules.users.models;


import app.modules.core.AbstractEntity;

import javax.persistence.*;
import java.util.Currency;

@Entity
@Table(name = "invoice_items")
public class LineItem extends AbstractEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    Invoice invoice;

    String name;
    int number;

    int orderNumer;

    Currency price;
    Currency total;


    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOrderNumer() {
        return orderNumer;
    }

    public void setOrderNumer(int orderNumer) {
        this.orderNumer = orderNumer;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }

    public Currency getTotal() {
        return total;
    }

    public void setTotal(Currency total) {
        this.total = total;
    }



}
