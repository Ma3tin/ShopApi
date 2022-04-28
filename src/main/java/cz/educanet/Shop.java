package cz.educanet;

public class Shop {
    private int id;
    private String type;
    private String SKU;
    private String name;
    private String shortDescription;


    public Shop(int id, String type, String SKU, String name, String shortDescription) {
        this.id = id;
        this.type = type;
        this.SKU = SKU;
        this.name = name;
        this.shortDescription = shortDescription;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSKU() {
        return SKU;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
