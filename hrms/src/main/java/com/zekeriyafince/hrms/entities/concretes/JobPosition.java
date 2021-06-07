package com.zekeriyafince.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 23.05.2021 22:06
 */
@Data
@Entity
@Table(name = "job_positions")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobadvertisements"})
public class JobPosition {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "position")
    private String position;

    @Column(name = "created_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate date;

    @NotNull
    @Column(name = "is_active")
    private boolean status;

}
