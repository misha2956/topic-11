package builder;

import lombok.*;

import java.util.List;

@Builder @ToString
public class Person {
    private @Getter @Setter
    String name;
    private @Getter @Setter
    double age;
    private @Getter @Setter
    double height;
    @Singular private @Getter @Setter
    List<String> friends;
}
