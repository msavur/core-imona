package com.imona.core.entity;


import com.imona.core.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@EqualsAndHashCode
@SuperBuilder
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Game extends BaseEntity {

    private String name;
    private String description;
    private String logo;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    private List<Player> players;
}
