package DB;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class StoreService implements Service{

    public static void selectAll(EntityManager entityManager) {
        TypedQuery<Stores> query = entityManager.createQuery("SELECT s FROM Stores s", Stores.class);
        List<Stores> stores = query.getResultList();
        for (int i = 0; i < stores.size(); i++) {
            System.out.println(stores.get(i).getStoreID() + " " + stores.get(i).getStoreName() + " " + stores.get(i).getStoreLocation());
        }
    }

    public static void update(EntityManager entityManager,Stores store) {
        entityManager.getTransaction().begin();
        //Stores s = entityManager.find(Stores.class, id);
        TypedQuery<Stores> query = entityManager.createQuery("SELECT s FROM Stores s WHERE StoreID="+store.getStoreID(), Stores.class);
        Stores s = query.getSingleResult();
        s.setStoreLocation(store.getStoreLocation());
        s.setStoreName(store.getStoreName());
        entityManager.getTransaction().commit();
        System.out.println("Store " + store.getStoreID() + " is updated successfully");
    }
}
