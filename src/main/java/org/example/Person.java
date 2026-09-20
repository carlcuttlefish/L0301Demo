package org.example;
// Alex, Capucine

public class Person {
  // instance variables
  // access modifier, var type, var name
  // static --> class variable, or constant
  // final --> cannot change, constant
  // e.g. public static final int age = 1;

  // java generally keeps attributes private and forces us to make get and set methods to access
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public static void main(String[] args) {
    Person p = new Person("Alice Aardvark", 1);
    System.out.println(p.name);
    System.out.println(p.age);
    System.out.println(p);
    // new creates a new string to reference, even if it's the same characters as one in the pool
    Person p2 = new Person("Alice Aardvark", 1);
    System.out.println(p2 == p);
    System.out.println(p2.equals(p));
    // always use .equals because we can't modify == in java, unlike python
  }

  @Override
  public String toString() {
    return this.name + " (age:" + age + ")";
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Person)) {
      return false;
    }
    // this casts the obj, this makes sure they are the same type
    Person other = (Person) obj;
    return other.name.equals(name) && other.age == age;
    // == checks if they're the EXACT same object, equals checks if same parts (i.e. same chars)
  }
}

//notes
// if we don't assign values to instance var in main method, then it return there defaults in print
// int default (primative) --> 0
// string default (reference type) --> null
// Person default (generic object) --> the default object
//                                      representation in java (package.name.adress if toString()
                                      // is not overridden

// primative types automatically go to default values if not initialized
// reference types go to null if not initialized