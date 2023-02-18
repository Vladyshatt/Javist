
import java.util.Objects;
public class CatorDog {
    static class Animal {
        private static String name;
        private static int levelkindness;
        private static int numberoflives;

    public Animal() {
        this.name = name;
        this.levelkindness = levelkindness;
        this.numberoflives = numberoflives;
    }
        public static String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public static int getLevelkindness() {
            return levelkindness;
        }
        public void setLevelkindness(int levelkindness) {
            this.levelkindness = levelkindness;
        }
        public static int getNumberoflives() {
            return numberoflives;
        }
        public void setNumberoflives(int numberoflives) {
            this.numberoflives = numberoflives;
        }
    }
    static class Cat extends Animal implements voice {
    private static String name;
    private static String catwotch;
    private static int levelkindness;
    private static int numberoflives;
    @Override
    public String toString() {
        return "Cat{" +
                "namecat='" + name + '\'' +
                ", levelkindnesscat=" + levelkindness +
                ", numberoflivescat=" + numberoflives +
                '}';
    }
    public Cat(String name, int levelkindnesscat, int numberoflivescat) {
        this.name = name;
        this.levelkindness = levelkindness;
        this.numberoflives = numberoflives;
        this.catwotch = catwotch;
    }
    public static String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
        public static String getCatwotch() {
            return catwotch;
        }
        public void setCatwotch(String catwotch) {
            this.catwotch = catwotch;
        }

    public static int getLevelkindness() {
        return levelkindness;
    }
    public void setLevelkindness(int levelkindness) {
        this.levelkindness = levelkindness;
    }
    public static int getNumberoflives() {
        return numberoflives;
    }
    public void setNumberoflives(int numberoflives) {
        this.numberoflives = numberoflives;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return levelkindness == cat.levelkindness &&
                numberoflives == cat.numberoflives && name.equals(cat.name) && catwotch.equals(cat.catwotch);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, levelkindness, numberoflives,catwotch);
    }

        public static void Voice() {
            String voice = "Мяу Мяу Я хочу спать хоязин :( ";
            System.out.println("Кошка говорит вам:" + voice);
        }
    }
static class Dog implements voice {

    private static String name;
    private static String dogguards;
    private static int levelkindness;
    private  static int numberoflives;

    @Override
    public String toString() {
        return "Dog{" +
                "namedog='" + name + '\'' +
                ", levelkindness=" + levelkindness +
                ", numberoflives=" + numberoflives +
                '}';
    }
    public Dog (String name, int levelkindness, int numberoflives) {
        this.name = name;
        this.levelkindness = levelkindness;
        this.numberoflives = numberoflives;
        this.dogguards = dogguards;
    }
    public static String getDogguards() {
        return dogguards;
    }

    public static void setDogguards(String dogguards) {
        Dog.dogguards = dogguards;
    }
    public static String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static int getLevelkindness() {
        return levelkindness;
    }
    public void setLevelkindness(int levelkindness) {
        this.levelkindness = levelkindness;
    }
    public static int getNumberoflives() {
        return numberoflives;
    }
    public void setNumberoflives(int numberoflives) {
        this.numberoflives = numberoflives;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return levelkindness == dog.levelkindness &&
                numberoflives == dog.numberoflives && name.equals(dog.name) && dogguards.equals(dog.dogguards);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, levelkindness, numberoflives, dogguards);
    }


    public static void Voice() {
        String voicedog = "Гав гав Я хочу гулять хоязин :( ";
        System.out.println("Cобака говорит вам: " + voicedog);
    }

    class CatoDog{}
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        Cat[] voice = new Cat[10];

        cats[0] = new Cat("Barsic", 10, 200);
        cats[1] = new Cat("Boris", 1, 2);
        cats[2] = new Cat("Gas", 1, 33);
        cats[3] = new Cat("Soup", 22, 2);
        cats[4] = new Cat("Marsel", 41, 25);
        cats[5] = new Cat("Faric", 99, 4);
        cats[6] = new Cat("Maric", 54, 17);
        cats[7] = new Cat("Rijic", 27, 54);
        cats[8] = new Cat("Garfield", 15, 6);
        cats[9] = new Cat("Hasber", 67, 55);

        Dog[] dogs = new Dog[10];


        dogs[0] = new Dog("Zelda", 5000, 200);
        dogs[1] = new Dog("Gleb", 15, 21);
        dogs[2] = new Dog("Rupert", 14, 55);
        dogs[3] = new Dog("Michael", 212, 22);
        dogs[4] = new Dog("Bong", 46, 76);
        dogs[5] = new Dog("Norbert", 43, 41);
        dogs[6] = new Dog("Boris", 5, 57);
        dogs[7] = new Dog("Fafly", 45, 43);
        dogs[8] = new Dog("Dunai", 16, 64);
        dogs[9] = new Dog("Alex", 62, 53);


        int hsCodecat = 0;
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].hashCode() > hsCodecat) {
                hsCodecat = cats[i].hashCode();
                System.out.println(hsCodecat);
            }
        }
        int hsCodedog = 0;
        for (int f = 0; f < dogs.length; f++) {
            if (dogs[f].hashCode() > hsCodedog) {
                hsCodedog = dogs[f].hashCode();
                System.out.println(hsCodedog);
            }
        }
        int winner = Math.max(hsCodedog, hsCodecat);
        if (winner == hsCodecat) {
            Cat.Voice();
            System.out.println("Победила кошка по хеш коду с парметарми "+Cat.getLevelkindness()+ Cat.getNumberoflives());
        }
        if (winner == hsCodedog) {
            Dog.Voice();
            System.out.println("Победила собака по хеш коду с именем "+ Dog.getName()+" уровнем доброты "+Dog.getLevelkindness()+" Кол-во жизней "+ Dog.getNumberoflives());
        }
        int statsdogs = Dog.getLevelkindness()+Dog.getNumberoflives();
        int statscats = Cat.getLevelkindness()+Cat.getNumberoflives();
        int Winnerstats= Math.max(statscats,statsdogs);
        if (Winnerstats == statscats){
            Cat.Voice();
            System.out.println("Победила кошка по статам с парметарми "+Cat.getLevelkindness()+ Cat.getNumberoflives());
        }
        if (Winnerstats == statsdogs){
            Dog.Voice();
            System.out.println("Победила собака по статам с именем "+ Dog.getName()+" уровнем доброты "+Dog.getLevelkindness()+" Кол-во жизней "+ Dog.getNumberoflives());
        }
    }
}
}