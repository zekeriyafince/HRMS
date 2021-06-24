package com.zekeriyafince.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 12.06.2021 21:26
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "languages")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "cv"})
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "cv_id")
    private CandidateCurriculumVitae cv;

    @Column(name = "name")
    private String name;

    @Min(1)
    @Max(5)
    @NotNull
    @Column(name = "level_name")
    private String levelName;

    @Column(name = "is_deleted")
    private boolean isDeleted;

}
