package models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Data
@Entity
@Table(name = "users")
public class User {

    /**
     * The ID.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * User Name.
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * User email.
     */
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    /**
     * Phone.
     */
    @Column(name = "phone", nullable = false, unique = true)
    private String phone;

}
