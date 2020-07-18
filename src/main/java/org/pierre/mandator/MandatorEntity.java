package org.pierre.mandator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class MandatorEntity {
    @Id
    private String mandatorId;

    @Column
    private String mandatorName;

    public MandatorEntity() {
    }

}
