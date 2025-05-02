package Lab6.Task1.Task3;


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.name = "Lili";
        cat.sound = "Meow";

        Animal cow = new Animal();
        cow.name = "Lulu";
        cow.sound = "Mu";

        Animal dog = new Animal();
        dog.name = "Li";
        dog.sound = "Gav";

        Animal[] animals = {cat ,cow , dog};

        for (Animal animal : animals){
            animal.makeSound();
}
}
}

