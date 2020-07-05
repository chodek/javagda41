package adnotacje;

public class Person implements Comparable {

    private int age;

    @MaxLength(maxLength = 10)
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

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }



    @Override
    public int compareTo(Object o) {
        if (o != null || getClass() == o.getClass()) {
            Person otherOne = (Person) o;
            if (this.age < otherOne.age) {
                return -1;
            } else if (this.age == otherOne.age) {
                return this.surname.compareToIgnoreCase(otherOne.surname);
            } else {
                return 1;
            }
        }
        return 0;
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

