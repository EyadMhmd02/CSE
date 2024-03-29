package y1.s2.Modules.Module3.Interfaces;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Frog frog = new Frog();
        Dog dog = new Dog();
        Bee bee = new Bee();
        Fly fly = new Fly();

        cat.makeSound(); // نياو
        frog.makeSound(); // بعاء بعاء
        dog.makeSound(); // هو هو
        bee.makeSound(); // بزززززززز
        fly.makeSound(); // زززززز
    }
}
