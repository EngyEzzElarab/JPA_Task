package DB;

import javax.persistence.EntityManager;

public interface Service {
    public static void delete(EntityManager entityManager, Class<?> someCLass, int id) {
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(someCLass, id));
        entityManager.getTransaction().commit();
        System.out.println("Record Successfully deleted from table " + someCLass.getSimpleName());
    }

    public static <T> void insert(EntityManager entityManager, T someEntity)
    {
        entityManager.getTransaction().begin();
        entityManager.persist(someEntity);
        entityManager.getTransaction().commit();
        System.out.println("Record Successfully Inserted In The Database");
    }

}
