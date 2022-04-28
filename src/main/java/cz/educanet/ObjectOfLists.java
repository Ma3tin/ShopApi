package cz.educanet;

import java.util.ArrayList;

public class ObjectOfLists {
    private ArrayList<Shop> featured;
    private ArrayList<Shop> other;

    public ObjectOfLists(ArrayList<Shop> featured, ArrayList<Shop> other) {
        this.featured = featured;
        this.other = other;
    }

    public ArrayList<Shop> getFeatured() {
        return featured;
    }

    public ArrayList<Shop> getOther() {
        return other;
    }
}
