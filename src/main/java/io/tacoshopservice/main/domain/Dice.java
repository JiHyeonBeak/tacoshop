package io.tacoshopservice.main.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Getter
@NoArgsConstructor
@Entity
public class Dice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tacosName;

    @Column(nullable = false)
    private String tacosContent;

    @Column(nullable = false)
    private Date createDate;
}
