import java.util.List;

public class Task1 {

    public boolean workWithCities (List<String> cities, String search) {
        boolean result = false;
        for (String city:cities) {
            if (city.equals(search)) {
                result = true;
            }
        }
        return result;
    }
// alternative way to perform search (according to task at least 2 loops must be implemented)
    public boolean searchCities (List<String> cities, String search){
        boolean result = false;
        for(int i=0; i< cities.size(); i++){
            if (cities.get(i).equals(search)){
                result=true;
                break;
            }
        }
        return result;
    }

}
