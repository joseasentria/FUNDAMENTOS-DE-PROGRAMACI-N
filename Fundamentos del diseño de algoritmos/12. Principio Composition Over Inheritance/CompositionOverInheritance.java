class Person {
 String title;
 String name;
 int age;

 public Person(String title, String name, String age) {
    this.title = title;
    this.name = name;
    this.age = age;
 }

}

class Employee {
 int salary;
 private Person person;

 public Employee(Person p, int salary) {
     this.person = p;
     this.salary = salary;
 }
}

Person p = new Person ("Mr.", "Kapil", 25);
Employee kapil = new Employee (p, 100000);

Class Manager {
 public string title;
 public Manager(Person p, Employee e)
 {
    this.title = e.title;
 }
}