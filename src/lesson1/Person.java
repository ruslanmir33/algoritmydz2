package lesson1;

import javax.naming.Name;

public class Person {
    private String fistName;
    private String secondName;
    private int age;
    private boolean sex;

    public String getFistName() {
        return fistName;
    }

    public String getSecondName() {
        if (sex) {
            return "Mr." + secondName;
        } else {
            return "Ms." + secondName;
        }
    }

    public int getAge() {
        return age;

    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setSecondName(String secondName) {
        this.secondName = fistName;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException("Возраст должен быть не отрицательным");
        }
        this.age = age;
    }

    public  Person(String fistName, String secondName, int age){
        setFistName(fistName);
        setSecondName(secondName);
        setAge(age);
    }

    public boolean equals(Object o){
        if (o == null){
            return false;
        }
        if (this == o){
            return true;
        }
        if (!this.getClass().equals(o.getClass())){
            return false;
        }
        Person that = (Person) o;
        return this.fistName.equals(that.fistName) &&
                this.secondName.equals(that.secondName) &&
                this.age == that.age;
    }
}
