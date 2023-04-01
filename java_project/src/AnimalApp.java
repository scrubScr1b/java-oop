 class AnimalApp {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.family);
        cat.makeSound("Meow");
        cat.getCountFoot();

        Duck duck = new Duck();
        System.out.println(duck.family);
        duck.makeSound("Cuaks");
        duck.getFavoriteFood();

    }
}
