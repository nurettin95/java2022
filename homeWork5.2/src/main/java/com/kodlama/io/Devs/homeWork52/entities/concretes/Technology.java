package com.kodlama.io.Devs.homeWork52.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "technologies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Technology {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

}
