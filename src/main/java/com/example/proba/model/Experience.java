package com.example.proba.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME_OF_THE_JOB")
    private String nameOfTheJob;
    @Column(name = "MAIN_TASK")
    private String mainTask;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "DATE_START")
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateStart;
    @DateTimeFormat(pattern = "yyyy-MM-dd", iso = DateTimeFormat.ISO.DATE)
    @Column(name = "DATE_END")
    private LocalDate dateEnd;


}
