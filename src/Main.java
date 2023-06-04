//💡 **Что мы знаем про Хогвартс**
//    В школе магии и волшебства Хогвартс есть четыре факультета:
//
//      - Гриффиндор
//      - Пуффендуй
//      - Когтевран
//      - Слизерин
//
//    Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100.
//    Всем Гриффиндорцам присущи благородство, честь и храбрость.
//    Студенты Пуффендуя трудолюбивы, верны, честны.
//    Когтевранцы умны, мудры, остроумны и полны творчества.
//    Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
//    Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние.
//    Сила магии и расстояние трансгрессии у каждого ученика своё и выражается в целочисленном эквиваленте.
//    Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
//    Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
//    На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
//    На факультете Когтевран учатся Чжоу Чанг, Падма Патил и Маркус Белби.
//
//            1. Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов.
//               В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы в качестве объектов.
//               Должна быть возможность задавать качества учеников через конструктор. Присвойте каждому свойству произвольное числовое значение от 0 до 100.
//            2. Сделайте метод, который выводит на экран описание студента. В описание надо включать качества, которые присущи всем студентам, плюс качества,
//               которые присущи студенту, потому что он учится на конкретном факультете.
//            3. Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой двух учеников одного факультета по свойствам.
//               Чтобы сравнить учеников, нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета. Тот ученик, у которого сумма
//               свойств больше, считается лучшим учеником. Метод должен выводить в консоль результат сравнения учеников.
//
//    Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов. У Рона Уизли благородство = 3 балла,
//    честь = 6 баллов и храбрость = 5 баллов.
//    У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти. Значит метод должен вывести в консоль “Гермиона лучший Гриффиндорец, чем Рон”.
//
//            4. Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии,
//               и выводит в консоль сравнительную оценку между двумя учениками.
//
//    Например, Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит.
public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Домашка 2.2");
        System.out.println();

        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 77, 53, 64, 85, 57);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 70, 58, 68, 75, 58);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 40, 59, 56, 57, 36);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смит", 44, 52, 65, 74, 31);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 65, 74, 75, 85, 23);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 65, 59, 74, 59, 29);

        Ravenclaw choChang = new Ravenclaw("Чжоу Чанг", 40, 57, 68, 54, 58, 14);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 58, 75, 68, 78, 77, 32);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 34, 35, 52, 23, 45, 56);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 43, 52, 65, 35, 42, 87, 78);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 35, 68, 38, 76, 43, 57, 57);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 48, 87, 53, 25, 47, 52, 42);

        harryPotter.printGryffindorStudent();
        zachariasSmith.printHufflepuffStudent();
        choChang.printRavenclawStudent();
        dracoMalfoy.printSlytherinStudent();

        System.out.println();

        hermioneGranger.compareStudentsOfFaculty(ronWeasley);
        cedricDiggory.compareStudentsOfFaculty(justinFinchFletchley);
        padmaPatil.compareStudentsOfFaculty(marcusBelby);
        grahamMontague.compareStudentsOfFaculty(gregoryGoyle);

        System.out.println();

        Hogwarts.compareByMagic(hermioneGranger, gregoryGoyle);
        Hogwarts.compareBytransgression(grahamMontague, padmaPatil);
    }
}