package com.emergentes.modelo;

public class Libro {

    private int id;
    private String descripcion;
    private String autor;
    private String disponible;
    private Categoria cate;

    public Libro() {
    }

    public Libro(int id, String descripcion, String autor, String disponible, Categoria cate) {
        this.id = id;
        this.descripcion = descripcion;
        this.autor = autor;
        this.disponible = disponible;
        this.cate = cate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDisponible() {
        return disponible;
    }

    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    public Categoria getCate() {
        return cate;
    }

    public void setCate(Categoria cate) {
        this.cate = cate;
    }

}
