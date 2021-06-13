package com.zekeriyafince.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 02.06.2021 22:18
 */
@Data
@Entity
@Table(name = "candidates")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "candidateCurriculumVitae"})
public class Candidate extends User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Size(min = 11, max = 11, message = "TC Kimlik No 11 hane olmalıdır.")
    @Column(name = "national_idendity")
    private String nationalIdentityNumber;

    @Column(name = "birth_date")
    private Date dateOfBirth;

    @JsonIgnore
    @OneToOne(mappedBy = "candidate")
    private List<CandidateCurriculumVitae> candidateCurriculumVitaes;
}
