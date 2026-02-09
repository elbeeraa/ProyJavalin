package ed.masanz.ut6.ArrayList.controller;

import ed.masanz.ut6.ArrayList.dto.Item;
import ed.masanz.ut6.ArrayList.dto.ItemPujas;
import ed.masanz.ut6.ArrayList.dto.Puja;
import io.javalin.http.Context;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProyController {
    public static void prueba(@NotNull Context context) {
        Map<String, Object> model = new HashMap<>();


        Item item1 = new Item("Boli bic",1,1);
        List<Puja> pujas1 = new ArrayList<>();
        pujas1.add(new Puja(1,"Boli bic",1,"Javi",2));
        pujas1.add(new Puja(1,"Boli bic",2,"Aitor",6));
        pujas1.add(new Puja(1,"Boli bic",3,"Alba",3));
        pujas1.add(new Puja(1,"Boli bic",4,"Bea",1));
        ItemPujas itemPujas1 = new ItemPujas();
        itemPujas1.setItem(item1);
        itemPujas1.setPujas(pujas1);

        Item item2 = new Item("Estuche",2,2);
        List<Puja> pujas2 = new ArrayList<>();
        pujas2.add(new Puja(2,"Estuche",3,"Alba",2));
        ItemPujas itemPujas2 = new ItemPujas();
        itemPujas2.setItem(item2);
        itemPujas2.setPujas(pujas2);

        List<ItemPujas> itemPujasList = new ArrayList<>();
        itemPujasList.add(itemPujas1);
        itemPujasList.add(itemPujas2);

        model.put("itemPujasList", itemPujasList);

        context.render("templates/index.ftl", model);
    }
}
