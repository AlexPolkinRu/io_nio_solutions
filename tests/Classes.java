class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

class Classes {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog) animal;
//        Cat cat = (Cat) animal;

//        System.out.println(cat instanceof Animal);
        System.out.println(dog instanceof Animal);
    }
}