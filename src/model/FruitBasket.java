package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class FruitBasket<F extends Fruit> {
    List<F> contents = new ArrayList<>();

    public FruitBasket() {
    }

    public void add(F fruit) {
        contents.add(fruit);
    }

    public boolean contains(F fruit) {
//        check if there are any fruits of this type
        if (contents.isEmpty()) {
            return false;
        }
        System.out.println("Class to check: " + fruit.getClass());
        boolean containsClass = false;
        for (F content : contents) {
            if (fruit.getClass() == content.getClass()) {
                containsClass = true;
            }
        }
        return containsClass;
    }

    public  F get() {
//        returns the first (earliest added fruit from the basket and removes it)
        if (contents.isEmpty()) {
            System.out.println("The basket is empty.");
            return null;
        }
        F objectToRemove = get(0);
        boolean remove = contents.remove(objectToRemove);
        if (!remove) {
            return null;
        }
        return objectToRemove;
    }

    private F get(int index) {
        if (index == contents.size()) {
            return contents.get(index - 1);
        }
        F oldestFruit = get(index + 1);
        if (index <= contents.indexOf(oldestFruit)) {
            return contents.get(index);
        } else {
            return oldestFruit;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The basket contains:\n");
        for (F content : contents) {
            stringBuilder.append(content.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
