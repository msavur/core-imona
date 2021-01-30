package com.imona.core.entity;


import com.imona.core.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@EqualsAndHashCode
@SuperBuilder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class City extends BaseEntity {
    private String name;
}
