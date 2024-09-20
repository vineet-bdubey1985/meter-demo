package co.za.meter.loginservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "enabled")
    private String enabled;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "modified")
    private LocalDateTime modified;

    @Column(name = "login_attempts")
    private int loginAttempts;

    @Column(name = "last_logout")
    private LocalDateTime lastLogout;

    @Column(name = "login")
    private LocalDateTime login;

    @Column(name = "lastpasswordmodifieddate")
    private LocalDateTime lastPasswordModifiedDate;

    @Column(name = "oldpassword1")
    private String oldpassword1;

    @Column(name = "oldpassword2")
    private String oldpassword2;

    @Column(name = "oldpassword3")
    private String oldpassword3;

    @Column(name = "oldpassword4")
    private String oldpassword4;

    @Column(name = "passwordchange_count")
    private int passwordChangeCount;

    @Column(name = "oldpassword5")
    private String oldpassword5;

    @Column(name = "passwordchangeddate")
    private LocalDateTime passwordChangedDate;

    @Column(name = "status")
    private int status;

    @Column(name = "token_password")
    private String tokenPassword;

}
