package com.csaba79coder.nodatabasecreatedinadvancegradle.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "uid")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;


    @Column(unique = true)
    private String email;

    String username;

    String mobile;
}
