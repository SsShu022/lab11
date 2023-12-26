package apps;

import lombok.experimental.SuperBuilder;
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

// enum Gender {
//     MALE, FEMALE
// }
