class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

class TestInheritance2 {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.weep();
        d.bark();
        d.eat();
    }
}