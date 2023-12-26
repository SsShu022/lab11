import org.junit.jupiter.api.Test;

import apps.task1.User;
import apps.task2.Gender;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void createUserAndVerifyProperties() {
        String expectedName = "Mark";
        int expectedAge = 26;
        Gender expectedGender = Gender.MALE;
        double expectedWeight = 75.5;
        double expectedHeight = 180.0;

        User user = User.builder()
                        .name(expectedName)
                        .age(expectedAge)
                        .gender(expectedGender)
                        .weight(expectedWeight)
                        .height(expectedHeight)
                        .build();

        assertAll("user properties",
            () -> assertEquals(expectedName, user.getName(), "Name should match"),
            () -> assertEquals(expectedAge, user.getAge(), "Age should match"),
            () -> assertEquals(expectedGender, user.getGender(), "Gender should match"),
            () -> assertEquals(expectedWeight, user.getWeight(), "Weight should match"),
            () -> assertEquals(expectedHeight, user.getHeight(), "Height should match")
        );
    }
}
