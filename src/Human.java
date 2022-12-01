public class Human {

    static String spicies = "mammals";
    String name;
    int age;
    String work;

    {
        name = "Ivan";
    }

    // стандартный конструктор без параметров
    Human() {
        name = "Ivan";
        age = 30;
        work  = "EPAM";
    }

    //  конструктор с 1 параметром
    Human(String name){
        this();
        this.name = name;
    }
//    конфликт с конструктором принимающим СТРОКУ name1
//    Human(String spicies1) {
//        spicies = spicies1;
//    }


    // конструктор с 1 параметром числом
    Human(int age1){
        age = age1;
    }

    // конструктор с 3 параметрами
    Human(String name3, int age3, String work1) {
        name = name3;
        age = age3;
        work = work1;
    }

    void eat() {
        System.out.println("съедаем ужин");
    }

    void speak(String phrase) {
        if (phrase == null){
            System.out.println("null phrase");
            return;
        }
        // action
        System.out.println(phrase);
    }

    String doWork(int hours) {
        speak("start working");
        int payment = hours * 10;
        return String.format("Today salary is %d",  payment);
    }

    static String getSpecies(){
        return spicies;
    }

    public static void main(String[] args) {
        Human human1 = new Human();
        System.out.println(human1);

        human1.name = "Petr";
        human1.age = 40;
        System.out.println(human1);

        Human human = new Human("Alex");

        String name3 = "Arkadiy";
        Human human2 = new Human(name3, 30, "EPAM");
        System.out.println(human2);
        human.eat();
        human2.speak("hello world!");
        human2.speak("buy");
        human2.speak(null);


        //going to work
        String salary = human1.doWork(8);
        System.out.println(salary);
    }

    @Override
    public String toString() {
        return "Human{" +
                "spicies='" + spicies + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
