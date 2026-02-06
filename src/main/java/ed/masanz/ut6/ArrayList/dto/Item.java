package ed.masanz.ut6.ArrayList.dto;

import java.util.Objects;

public class Item {


    private int id;
    private String nombre;
    private int precio;

    public Item() {
        this("THIS_NOMBRE",0,0);
    }

    public Item(String nombre, int id, int precio) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
    }


    //region getters setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //endregion


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
