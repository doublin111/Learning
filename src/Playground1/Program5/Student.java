package Playground1.Program5;

final class Student {

    private String firstName;
    private String secondName;
    private int age;

    private enum gender {MALE, FEMALE}


    ///* SETTER METHODS*///

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    void setSecondName(String secondName) {

        this.secondName = secondName;
    }

    void setAge(int age) {

        this.age = age;
    }


    ///* GETTER METHODS *///

    String getFirstName() {

        return firstName;
    }

    String getSecondName() {

        return secondName;
    }

    int getAge() {

        return age;
    }


    void printStudentInfo() {

        System.out.println("This student is called " + firstName + secondName + " ," + age + " years old and he is a ");
    }
}
