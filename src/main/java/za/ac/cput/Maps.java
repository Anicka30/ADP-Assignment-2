package za.ac.cput;

/*
 *@author : Anicka Schouw 217284183
 * Map application
 * May 2021
 */

public class Maps {
    private int key;
    private String definition;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return "Maps{" +
                "key='" + key + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
