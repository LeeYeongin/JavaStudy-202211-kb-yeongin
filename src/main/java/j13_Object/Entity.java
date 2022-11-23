package j13_Object;

import lombok.*;

import java.util.Objects;

@NoArgsConstructor  // 매개변수가 없는 생성자(기본생성자)
@AllArgsConstructor // 매개변수가 있는 생성자(전체생성자)
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data

public class Entity {
    private String name;
    private int age;
    private String address;

    public boolean cmp(){
        return this.getClass() == Entity.class;
    }
}
