import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {

    public void removeDuplicates(List<String> cities) {
        Set<String> noDuplicates = new HashSet<String>(cities);
        System.out.println(noDuplicates);
    }
}
