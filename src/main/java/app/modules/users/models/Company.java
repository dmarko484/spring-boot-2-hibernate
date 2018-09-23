package app.modules.users.models;


import app.modules.core.AbstractEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "companies")
public class Company extends AbstractEntity {

    String name;
    Address addressInvoicing=new Address();
   // Address addressShipping=new Address();

    String ic;
    String dic;

    @OneToMany(fetch= FetchType.LAZY, mappedBy = "company")
    List<User> users=new ArrayList<>();

    @OneToMany(fetch= FetchType.LAZY, mappedBy = "company")
    List<Invoice> invoices=new ArrayList<>();

    @OneToMany(fetch= FetchType.LAZY, mappedBy = "vendor")
    List<Product> vendoredProducts=new ArrayList<>();

    @OneToMany(fetch= FetchType.LAZY, mappedBy = "issuer")
    List<Certificate> certificates=new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddressInvoicing() {
        return addressInvoicing;
    }

    public void setAddressInvoicing(Address addressInvoicing) {
        this.addressInvoicing = addressInvoicing;
    }


    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getDic() {
        return dic;
    }

    public void setDic(String dic) {
        this.dic = dic;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Product> getVendoredProducts() {
        return vendoredProducts;
    }

    public void setVendoredProducts(List<Product> vendoredProducts) {
        this.vendoredProducts = vendoredProducts;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }


}
