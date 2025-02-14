package com.imona.core.entity;


import com.imona.core.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@EqualsAndHashCode
@SuperBuilder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Action extends BaseEntity {

    private String name;
    private String description;
    private Long point;

    @OneToOne
    private Game game;
}
