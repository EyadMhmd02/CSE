package y1.s2.Modules.Module3.Interfaces;

public class Dog extends Mammal implements MakeSound {
    @Override
    public void makeSound() {
        System.out.println("هو هو");
    }
}