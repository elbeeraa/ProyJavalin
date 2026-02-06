package ed.masanz.ut6.ArrayList.dto;

import java.util.Objects;

public class Usuario {

    private int id;
    private String nombre;

    public Usuario() {
        this("THIS_NOMBRE",0);
    }

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
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
//endregion


    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
