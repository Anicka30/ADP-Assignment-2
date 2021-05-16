package za.ac.cput;

/*
 *@author : Anicka Schouw 217284183
 * List application
 * May 2021
 */

public class List {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "List{" +
                "name='" + name + '\'' +
                '}';
    }
}
