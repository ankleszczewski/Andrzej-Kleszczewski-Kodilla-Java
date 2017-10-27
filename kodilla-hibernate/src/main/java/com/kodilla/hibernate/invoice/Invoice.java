package com.kodilla.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {
    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public Invoice() {
    }

    public Invoice(String name) {
        this.name = name;
    }

    @GeneratedValue
    @Id
    @NotNull
    @Column(name = "INVOICE_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "INVOICE_NAME")
    public String getName() {
        return name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
