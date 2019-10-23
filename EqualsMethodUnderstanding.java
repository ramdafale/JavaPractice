package com.practice;
class MainClass {
    public static void main(String args[]) {

        Person objectOne = new Person(1, "Ram");
        Person objectTwo = new Person(1, "Shyam");
        Test otherClassObject = new Test();
        boolean value = objectOne.equals(otherClassObject);
        System.out.println(value);
    }
}

  class Person {
    int adharNumber;
    String name;
    public Person(int adharNumber, String name) {
        this.adharNumber = adharNumber;
        this.name = name;
    }
    @Override
    public boolean equals(Object object) {
        Person anotherPerson = (Person) object;
        if(this == object )
        {
            return true;
        }
        if(this == null || object == null)
        {
            return false;
        }
        if(this.getClass() != anotherPerson.getClass())
        {
            return false;
        }
        if(this.name == null)
        {
            if(anotherPerson.name != null)
            {
                return false;
            }
        }
        if (!this.name.equals(anotherPerson.name)) {
            return false;
        }
        if (this.adharNumber != anotherPerson.adharNumber) {
            return false;
        }
        return true;
    }
  }

class Test {
    int adharNumber;
    String name;
}
