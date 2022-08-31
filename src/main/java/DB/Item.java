package DB;

import javax.persistence.*;
import java.util.List;

@Entity
public class Item {
    @Id
    private int ItemID;
    private String Author;
    private String Manufacturer;
    private Double Width;
    private Double Height;
    private int KitID;
    @ManyToMany
    @JoinTable(name = "ItemStoreRelation",
            joinColumns = @JoinColumn(name = "ItemID"),
            inverseJoinColumns = @JoinColumn(name = "StoreID"))

    private List<Stores> Stores;


    public List<DB.Stores> getStores() {
        return Stores;
    }

    public void setStores(List<DB.Stores> stores) {
        Stores = stores;
    }


    public int getItemID() {
        return ItemID;
    }

    public void setItemID(int itemID) {
        ItemID = itemID;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public Double getWidth() {
        return Width;
    }

    public void setWidth(Double width) {
        Width = width;
    }

    public Double getHeight() {
        return Height;
    }

    public void setHeight(Double height) {
        Height = height;
    }

    public int getKitID() {
        return KitID;
    }

    public void setKitID(int kitID) {
        KitID = kitID;
    }
}
