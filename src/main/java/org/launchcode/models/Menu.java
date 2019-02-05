package org.launchcode.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=1, max=30)
    private String name;

    @ManyToMany
    private List<Cheese> cheeses;

    public Menu() {}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public void setCheeses(List<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

    public void addItem(Cheese item) {
        cheeses.add(item);
    }

    public void removeItem(Cheese item) {
        cheeses.remove(item);
    }

}
