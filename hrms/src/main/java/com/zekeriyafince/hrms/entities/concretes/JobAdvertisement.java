package com.zekeriyafince.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 07.06.2021 20:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_advertisement")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobadvertisements"})
public class JobAdvertisement {

    @Id
    @Column(name = "id")
    private int id;

    @JoinColumn(name = "user_id")
    @ManyToOne()
    private Employer employer;

    @Column(name = "job_description")
    private String jobDescription;

    @Column(name = "min_salary")
    private Float minSalary;

    @Column(name = "max_salary")
    private Float maxSalary;

    @Column(name = "number_of_active_positions")
    private int NumberOfActivePositions;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "create_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate createDate;

    @Column(name = "application_deadline")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate applicationDeadline;

    @ManyToOne()
    @JoinColumn(name = "city_id")
    private City city;

    @JoinColumn(name = "job_position_id")
    @ManyToOne()
    private JobPosition jobPosition;
}
