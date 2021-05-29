package com.zekeriyafince.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 23.05.2021 22:06
 */
@Data
@Entity
@Table(name = "job_positions")
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "position")
    private String position;

}
