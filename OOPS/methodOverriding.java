public class methodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eat anythings.");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}
