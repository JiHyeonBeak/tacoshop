package io.tacoshopservice.main.domain.dice;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Getter
@NoArgsConstructor
@Entity
public class Dice extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tacosName;

    @Column(nullable = false)
    private String tacosContent;

    @Column(nullable = false)
    private String author;

}
