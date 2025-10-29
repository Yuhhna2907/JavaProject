package DemergingService;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemergingServiceTest {
    public void testNuTruocNamSau() {
        List<Person> people = Arrays.asList(
                new Person("An", "Nữ", "2000-01-01"),
                new Person("Bình", "Nam", "2001-01-01"),
                new Person("Chi", "Nữ", "2002-01-01"),
                new Person("Dũng", "Nam", "2003-01-01")
        );

        DemergingService service = new DemergingService();
        service.separateByGender(people);

        List<Person> result = service.getDemergedList();

        assertEquals(4, result.size());
        assertEquals("Nữ", result.get(0).getGender());
        assertEquals("Nữ", result.get(1).getGender());
        assertEquals("Nam", result.get(2).getGender());
        assertEquals("Nam", result.get(3).getGender());
    }

    @Test
    public void testTatCaNu() {
        List<Person> people = Arrays.asList(
                new Person("An", "Nữ", "2000-01-01"),
                new Person("Chi", "Nữ", "2001-01-01")
        );

        DemergingService service = new DemergingService();
        service.separateByGender(people);

        List<Person> result = service.getDemergedList();
        assertTrue(result.stream().allMatch(p -> p.getGender().equalsIgnoreCase("Nữ")));
    }

    @Test
    public void testTatCaNam() {
        List<Person> people = Arrays.asList(
                new Person("Bình", "Nam", "2000-01-01"),
                new Person("Dũng", "Nam", "2001-01-01")
        );

        DemergingService service = new DemergingService();
        service.separateByGender(people);

        List<Person> result = service.getDemergedList();
        assertTrue(result.stream().allMatch(p -> p.getGender().equalsIgnoreCase("Nam")));
    }

}