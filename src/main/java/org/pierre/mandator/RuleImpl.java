package org.pierre.mandator;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
public class RuleImpl {
    @Id
    private String id;

    @Column
    private String rulename;

    @ManyToOne
    @JoinColumn(name="man_id")
    private MandatorEntity mandatorEntity;

    public RuleImpl() {

    }
}
