package org.lessons.java.christmas;

import java.util.List;

public class ChristmasLetter {

    private String name;
    private String address;

    private List<String> wishes;

    public ChristmasLetter(String name, String address, List<String> wishes) {
        this.name = name;
        this.address = address;
        this.wishes = wishes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> getWishes() {
        return wishes;
    }

    public void setWishes(List<String> wishes) {
        this.wishes = wishes;
    }

    public void send() throws wishesException {
        if (wishes.toArray().length > 5) {
            throw new wishesException("Troppi desideri, puoi esprimerne solo 5");
        }
    }
}
