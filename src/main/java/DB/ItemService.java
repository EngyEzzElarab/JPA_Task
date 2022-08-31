package DB;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ItemService implements Service {

    public static void update(EntityManager entityManager, Item item) {
        entityManager.getTransaction().begin();
        TypedQuery<Item> query = entityManager.createQuery("SELECT Item FROM Item WHERE ItemID=" + item.getItemID(), Item.class);
        Item i = query.getSingleResult();
        i.setAuthor(item.getAuthor());
        i.setManufacturer(item.getManufacturer());
        i.setWidth(item.getWidth());
        i.setHeight(item.getHeight());
        i.setKitID(item.getKitID());
        entityManager.getTransaction().commit();
        System.out.println("item " + item.getItemID() + " is updated successfully");
    }


    public static void selectAll(EntityManager entityManager) {
        TypedQuery<Item> query = entityManager.createQuery("SELECT i FROM Item i", Item.class);
        List<Item> items = query.getResultList();
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getItemID() + " " + items.get(i).getAuthor() + " " + items.get(i).getManufacturer() + " " + items.get(i).getWidth() + " " + items.get(i).getHeight() + " " + items.get(i).getKitID());
        }
    }
}
