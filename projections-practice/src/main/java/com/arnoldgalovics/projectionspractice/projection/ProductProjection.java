package com.arnoldgalovics.projectionspractice.projection;

public class ProductProjection {
    public String name;

    public ProductProjection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProductProjection{" +
                "name='" + name + '\'' +
                '}';
    }
}
