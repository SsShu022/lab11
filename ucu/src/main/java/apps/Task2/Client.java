package apps.Task2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Client {
    private static int counter = 0;
    private final int id;
    private final String name;
    private final String email;
    private final int age;
    private final Gender gender;

    public Client(String name, String email, int age, Gender gender) {
        this.id = counter++;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
    }
}