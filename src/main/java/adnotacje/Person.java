package adnotacje;

import lombok.Data;

@Data
public class Person{

    private int age;

    //@MaxLength(maxLength = 10)

    private String name;
    private String surname;

    public Person(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;

        try {
            if(!StringLengthValidator.validate(this)){
                throw new IncorrectValueOfParameterException("Length of String too long!");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public void setAge(int age) {
        System.out.println("hahaha");
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

