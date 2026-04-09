person1.name
person1.age
class Person {
    String name;
    int age;
    
    Person(String n, int a) {
        name = n;
        age = a;
    }
    
    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
    
    void haveBirthday() {
        age = age + 1;
        System.out.println("Happy Birthday! " + name + " is now " + age + " years young ");
    }
}
person1.sayHello()
Person person1 = new Person("Alice", 25);
Person person2 = new Person("Bob", 30);
person1.sayHello()
person1.haveBirthday()
person2.sayHello()
person2.haveBirthday()
for (int i = 0; i < 75; i++){
    person2.haveBirthday();
}
Person person = new Person("John", 17);