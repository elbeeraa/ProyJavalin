package ed.masanz.ut6.ArrayList.dto;

import java.util.List;

public class ItemPujas {

    private Item item;
    private List<Puja> pujas;

    public ItemPujas() {
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(List<Puja> pujas) {
        this.pujas = pujas;
    }

    @Override
    public String toString() {
        return "ItemPujas{" +
                "item=" + item +
                ", pujas=" + pujas.size() +
                '}';
    }
}
