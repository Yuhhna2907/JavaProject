package DemergingService;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemergingService {
    private Queue<Person> femaleQueue = new LinkedList<>();
    private Queue<Person> maleQueue = new LinkedList<>();

    // Phân loại vào 2 queue
    public void separateByGender(List<Person> people) {
        for (Person p : people) {
            if (p.getGender().equalsIgnoreCase("Nữ")) {
                femaleQueue.add(p);
            } else {
                maleQueue.add(p);
            }
        }
    }

    // Trả về kết quả Demerging
    public List<Person> getDemergedList() {
        List<Person> result = new ArrayList<>();
        while (!femaleQueue.isEmpty()) {
            result.add(femaleQueue.poll());
        }
        while (!maleQueue.isEmpty()) {
            result.add(maleQueue.poll());
        }
        return result;
    }
}
