package com.imona.core.entity;


import com.imona.core.entity.base.BaseEntity;
import com.imona.core.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.util.Date;

@EqualsAndHashCode
@SuperBuilder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Player extends BaseEntity {

    private String name;
    private String surname;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Date birthDate;

    private boolean flag;

    @ManyToOne
    private City city;

    @ManyToOne
    private Game game;
}
