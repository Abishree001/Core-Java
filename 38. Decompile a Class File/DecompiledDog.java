/*
 * Decompiled with CFR 0.152.
 */
class Dog
extends Animal {
    Dog() {
    }

    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] stringArray) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeSound();
        dog.makeSound();
    }
}
