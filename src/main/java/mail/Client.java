package mail;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

enum Gender{
    MALE, FEMALE;
}

@Getter @Setter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;

    private static int count = 0;

    public Client(String name, int age, Gender sex) {
    id += ++count;
    this.age = age;
    this.name = name;
    this.sex = sex;
    }
}
