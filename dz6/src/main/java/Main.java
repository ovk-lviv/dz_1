import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Lviv");
        cities.add("London");
        cities.add("New York");

        Task1 task1 = new Task1();
        System.out.println(task1.workWithCities(cities, "Lviv"));
        System.out.println(task1.searchCities(cities, "Kyiv"));

        cities.add("London");
        System.out.println(cities);

        Task2 task2 = new Task2();
        task2.removeDuplicates(cities);

    }
}
