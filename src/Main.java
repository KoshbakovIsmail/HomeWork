public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача №1");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper= " + paper);

        System.out.println("");

        System.out.println("Задача №2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper= " + paper);

        System.out.println("");

        System.out.println("Задача №3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper= " + paper);

        System.out.println("");

        System.out.println("Задача №4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        System.out.println("");

        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        System.out.println("");

        System.out.println("Задача №6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println("Weight 1 Boxer = " + boxer1 + "кг");
        System.out.println("Weight 2 Boxer = " + boxer2 + "кг");
        var weight = boxer1 + boxer2;
        System.out.println("Total weight boxer = " + weight);
        var difference = Math.abs(boxer1 - boxer2);
        System.out.println("Difference weight boxer = " + difference);

        System.out.println("");

        System.out.println("Задача №7");
        var RemainderDivision = Math.abs(boxer2 % boxer1);
        System.out.println("RemainderDivision = " + RemainderDivision);

        System.out.println("");

        System.out.println("Задача №8");

        var TotalOpeningHours1 = 640;
        System.out.println("Total Opening Hours = " + TotalOpeningHours1 + " часов работы ");
        var OpenHours1 = 8;
        System.out.println("Open Hours = " + "по " + OpenHours1 + " часов ");
        var TotalEmployees1 = TotalOpeningHours1 / OpenHours1;
        System.out.println("TotalEmployees = " + "на " + TotalEmployees1 + " человек" );

        System.out.println("");
        var TotalEmployees2 = 94;
        System.out.println("TotalEmployees = " + "на " + TotalEmployees2 + " человек");
        var OpenHours2 = 8;
        System.out.println("Open Hours = " + "по " + OpenHours2 + " часов");
        var TotalOpeningHours2 = TotalEmployees2 * OpenHours2;
        System.out.println("Total Opening Hours = " + TotalOpeningHours2 + " часов работы");
    }
}