package com.khusoe.jpa.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "AUTHOR_TBL")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "author_sequence"
//    )
//    @SequenceGenerator(
//            name = "author_sequence",
//            sequenceName = "author_sequence",
//            allocationSize = 1
//    )
//    @TableGenerator(
//            name = "author_id_gen",
//            table = "id_generator",
//            pkColumnName = "id_name",
//            valueColumnName = "id_value",
//            allocationSize = 1
//    )
    private int id;
    private String firstName;
    private String lastName;
    private String email;
}
