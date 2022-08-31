package DB;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity(name = "Stores")
public class Stores {
    @Id
    private int StoreID;
    private String StoreName;
    private String StoreLocation;

    public List<Item> getItems() {
        return Items;
    }

    public void setItems(List<Item> items) {
        Items = items;
    }

    @ManyToMany(mappedBy = "Stores")
    private List<Item> Items;

    public int getStoreID() {
        return StoreID;
    }

    public void setStoreID(int storeID) {
        StoreID = storeID;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }

    public String getStoreLocation() {
        return StoreLocation;
    }

    public void setStoreLocation(String storeLocation) {
        StoreLocation = storeLocation;
    }
}
