package org.lessons.java.christmas;

import java.util.List;
import java.util.Random;

public class ChristmasLetter {

    private String name;
    private String address;

    private List<String> wishes;
    private boolean isBuono;
    public ChristmasLetter(String name, String address, List<String> wishes) {
        Random random = new Random();
        this.isBuono = random.nextBoolean();
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

    public String send() throws wishesException {
        if (wishes.toArray().length > 5) {
            throw new wishesException("Troppi desideri, puoi esprimerne solo 5");
        }
        if (!isBuono){
            throw new wishesException("Mi dispiace ma quest'anno sei statoi cattivo");
        }

        return "Sei stato buono, la tua lettera è stata inviata con successo" + " Nome: " + getName() + ", " + getAddress() + ", " + getWishes();
    }

    // TO STRING


    @Override
    public String toString() {
        return "ChristmasLetter" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", wishes=" + wishes
                ;
    }
}
