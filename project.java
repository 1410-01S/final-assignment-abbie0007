import java.util.Random;

public class project {
    
static Random generator;

static String[] names = {"Spot", "Dog", "Daisy", "Maggie", "Fido", "Brutus", "Oreo", "Spike", "Sadie", "Fluffy",};
static int age = 0;
static int food = 0;
static boolean alive = true;
static boolean fed = false;


    
static <T> T pickRandom(T[] array){
    int rnd = generator.nextInt(array.length);
    return array[rnd];
}
static class mob{
    String name = "examplePerson";
    int age = 0;
    boolean alive = true;
    boolean fed = false;


public mob(){
    name = pickRandom(names);
}
}

public static void main(String[] args) {
    generator = new Random();
        for(int i =0; i<1; i++){
            mob mob = new mob();

        System.out.println("New creature: " + mob.name);
    food = food + 3;
    age++;
    int min = 1;
    int max = 10;
    for(int z =0; z<10; z++){
    int odds = (int)(Math.random() * (max - min + 1) + 1);
    if (odds > 9) {
        spawnCreature();
    } else if (odds < 3){
        eat();
    } else if (odds > 4){
        checkAge();
    } else {
        spawnFood();
    }
}
}
}
static void spawnCreature() {
    if (fed && alive) {
    generator = new Random();
        for(int i =0; i<1; i++){
            mob mob = new mob();

        System.out.println("Creature has reproduced.\nNew creature: " + mob.name);
    }
}
}
static void eat() {
    if(alive) {
    if (food > 2){
        System.out.println("Creature has found food");
        food = food - 2;
        fed = true;
    } else {
        System.out.println("Creature could not find food");
        fed = false;
        death();
    }
} else {
    return;
}
}
static void death() {
    int min = 1;
    int max = 2;
    int deathchance = (int)(Math.random() * (max - min + 1) + 1);
    if (deathchance < 2 && alive) {
        System.out.println("Creature has died");
        alive = false;
    }
}
static void checkAge() {
    if (age > 5) {
        death();
    }
}
static void spawnFood() { 
    int min = 0;
    int max = 2;
    int foodchance = (int)(Math.random() * (max - min + 1) + 1);
    for(int i =0; i<foodchance; i++){
        food = food + 1;
    }
}
}