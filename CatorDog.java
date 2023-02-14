import java.util.Arrays;
import java.util.Objects;

public class CatorDog {
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        Dog[] dogs = new Dog[10];
        int hsCodecat = 0;
        for (int i = 0; i < cats.length; i++) {
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
            hsCodecat = cats[i].hashCode();
        }
        int hsCodedog = 0;
        for (int f = 0; f < dogs.length; f++) {
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
            hsCodedog = dogs[f].hashCode();
        }
        int hsCodeCatorDogMax = Math.max(hsCodedog, hsCodecat);
        if (hsCodeCatorDogMax == hsCodedog){
            Dog.DogVoice();
        }
        if (hsCodeCatorDogMax == hsCodecat){
            Cat.CatVoice();

        }
        System.out.println("Максимальный хеш код " +hsCodeCatorDogMax);
        int pretendedDog = dogs[9].numberoflivesdog + dogs[9].levelkindnessdog;
        int pretendedCats = cats[2].numberoflivescat + cats[2].levelkindnesscat;
        double winner = Math.max(pretendedCats, pretendedDog);
        if (winner == pretendedCats){
            Cat.CatVoice();
            System.out.println("КОТ В НЕРАВНОЙ СХВАТКЕ ПРОТИВ СОБАКИ ПОБЕДИЛ ");
        }
        if (winner == pretendedDog){
            Dog.DogVoice();
            System.out.println("СОБАКА В НЕРАВНОЙ СХВАТКЕ ПРОТИВ КОТА ПОБЕДИЛА ");
        }

    }
}


class Cat {
    String namecat;
    int levelkindnesscat;
    int numberoflivescat;

//    @Override
//    public String toString() {
//        return "Cat{" +
//                "namecat='" + namecat + '\'' +
//                ", levelkindnesscat=" + levelkindnesscat +
//                ", numberoflivescat=" + numberoflivescat +
//                '}';
//    }

    public Cat(String namecat, int levelkindnesscat, int numberoflivescat) {
        this.namecat = namecat;
        this.levelkindnesscat = levelkindnesscat;
        this.numberoflivescat = numberoflivescat;
    }

    public String getNamecat() {
        return namecat;
    }

    public void setNamecat(String namecat) {
        this.namecat = namecat;
    }

    public int getLevelkindnesscat() {
        return levelkindnesscat;
    }

    public void setLevelkindnesscat(int levelkindnesscat) {
        this.levelkindnesscat = levelkindnesscat;
    }

    public int getNumberoflivescat() {
        return numberoflivescat;
    }

    public void setNumberoflivescat(int numberoflivescat) {
        this.numberoflivescat = numberoflivescat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return levelkindnesscat == cat.levelkindnesscat &&
                numberoflivescat == cat.numberoflivescat && namecat.equals(cat.namecat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namecat, levelkindnesscat, numberoflivescat);
    }

    public static void CatVoice() {
        String voicecat = "Мяу Мяу Я хочу спать хоязин :( ";
        System.out.println("Кошка говорит вам:" + voicecat);
    }
}

class Dog {
    String namedog;
    int levelkindnessdog;
    int numberoflivesdog;

//    @Override
//    public String toString() {
//        return "Dog{" +
//                "namedog='" + namedog + '\'' +
//                ", levelkindnessdog=" + levelkindnessdog +
//                ", numberoflivesdog=" + numberoflivesdog +
//                '}';
//    }

    public Dog(String namedog, int levelkindnessdog, int numberoflivesdog) {
        this.namedog = namedog;
        this.levelkindnessdog = levelkindnessdog;
        this.numberoflivesdog = numberoflivesdog;
    }

    public String getNamedog() {
        return namedog;
    }

    public void setNamedog(String namedog) {
        this.namedog = namedog;
    }

    public int getLevelkindnessdog() {
        return levelkindnessdog;
    }

    public void setLevelkindnessdog(int levelkindnessdog) {
        this.levelkindnessdog = levelkindnessdog;
    }

    public int getNumberoflivesdog() {
        return numberoflivesdog;
    }

    public void setNumberoflivesdog(int numberoflivesdog) {
        this.numberoflivesdog = numberoflivesdog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return levelkindnessdog == dog.levelkindnessdog &&
                numberoflivesdog == dog.numberoflivesdog && namedog.equals(dog.namedog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namedog, levelkindnessdog, numberoflivesdog);
    }

    public static void DogVoice() {
        String voicedog = "Гав гав Я хочу гулять хоязин :( ";
        System.out.println("Cобака говорит вам: " + voicedog);
    }
}

