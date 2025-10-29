package DemergingService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("An", "Nữ", "01/01/2000"),
                new Person("Bình", "Nam", "03/02/2000"),
                new Person("Chi", "Nữ", "05/03/2000"),
                new Person("Dũng", "Nam", "06/03/2000"),
                new Person("Hà", "Nữ", "07/03/2000")
        );

        DemergingService service = new DemergingService();
        service.separateByGender(people);

        System.out.println("=== Kết quả Demerging (Nữ trước, Nam sau) ===");
        for (Person p : service.getDemergedList()) {
            System.out.println(p);
        }
    }
}
    

