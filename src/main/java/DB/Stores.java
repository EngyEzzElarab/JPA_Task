package DB;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Stores")
public class Stores {
    @Id
    private int StoreID;
    private String StoreName;
    private String StoreLocation;

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
