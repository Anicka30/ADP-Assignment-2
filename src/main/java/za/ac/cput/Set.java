package za.ac.cput;

/*
 *@author : Anicka Schouw 217284183
 * Set application
 * May 2021
 */

public class Set {
    private int age;
    private long studentNumber;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Set{" +
                "age=" + age +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
