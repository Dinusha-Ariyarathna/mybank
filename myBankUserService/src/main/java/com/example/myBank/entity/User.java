package com.example.myBank.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 10/19/2024
 * @PROJECT : myBank
 */
@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Integer id;

    @Column(name = "name", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String name;

    @Column(name = "email", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String email;

    //phone number
    @Column(name = "phone", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String phone;

    //address
    @Column(name = "address", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String address;

    //identification number
    @Column(name = "nic", nullable = false)
    @JdbcTypeCode(SqlTypes.VARCHAR)
    private String nic;

    //date of birth
    @Column(name = "dob", nullable = false)
    @JdbcTypeCode(SqlTypes.DATE)
    private String dob;

}
