package ed.masanz.ut6.ArrayList.dto;

import java.util.Objects;

public class Puja {

    private int idItem;
    private String nombreItem;
    private int idUsuario;
    private String nombreUsuario;
    private int precioPujado;

    public Puja(int idItem, String nombreItem, int idUsuario, String nombreUsuario, int precioPujado) {
        this.idItem = idItem;
        this.nombreItem = nombreItem;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.precioPujado = precioPujado;
    }

    public Puja() {
        this(0,"Item",0,"Usuario",0);
    }

//region getters and setters
    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNombreItem() {
        return nombreItem;
    }

    public void setNombreItem(String nombreItem) {
        this.nombreItem = nombreItem;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getPrecioPujado() {
        return precioPujado;
    }

    public void setPrecioPujado(int precioPujado) {
        this.precioPujado = precioPujado;
    }
//endregion

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Puja puja = (Puja) o;
        return idItem == puja.idItem && idUsuario == puja.idUsuario && precioPujado == puja.precioPujado && Objects.equals(nombreItem, puja.nombreItem) && Objects.equals(nombreUsuario, puja.nombreUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idItem, nombreItem, idUsuario, nombreUsuario, precioPujado);
    }

    @Override
    public String toString() {
        return "Puja{" +
                "idItem=" + idItem +
                ", nombreItem='" + nombreItem + '\'' +
                ", idUsuario=" + idUsuario +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", precioPujado=" + precioPujado +
                '}';
    }
}
