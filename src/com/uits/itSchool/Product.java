package com.uits.itSchool;

import java.util.Objects;

public class Product {
    private String  name;
    private int cost;
    private String manufacturer;

    public Product( String name, int cost, String manufacturer ) {
        this.name = name;
        this.cost = cost;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setCost( int cost ) {
        this.cost = cost;
    }

    public void setManufacturer( String manufacturer ) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return cost == product.cost &&
                Objects.equals(name, product.name) &&
                Objects.equals(manufacturer, product.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, manufacturer);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

}
