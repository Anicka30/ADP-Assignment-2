package za.ac.cput;
/*
 *@author : Anicka Schouw 217284183
 * Collections  application
 * May 2021
 */
public class Collections {

    private String list,set,map;

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Collections{" +
                "list='" + list + '\'' +
                ", set='" + set + '\'' +
                ", map='" + map + '\'' +
                '}';
    }
}
