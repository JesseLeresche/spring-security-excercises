package za.co.entelect.bootcamp.securityexcercises.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column (nullable = false)
    private String password;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column(nullable = false, unique = true)
    private String  email;
}
