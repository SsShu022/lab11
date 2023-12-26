package apps.task1;

import lombok.experimental.SuperBuilder;
import apps.task2.Gender;
import lombok.Getter;

@Getter
@SuperBuilder
public class User {
    private final String name;
    private final int age;
    private final Gender gender;
    private final double weight;
    private final double height;

}
