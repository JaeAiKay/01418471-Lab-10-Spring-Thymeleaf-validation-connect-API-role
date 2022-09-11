package th.ac.ku.restaurant.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data // getter setter ทุก fields ที่ไม่เป็น final, toString, equals and hashCode
@NoArgsConstructor // สร้าง constructor ที่ไม่มี arguments
@Entity
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String role;

}
