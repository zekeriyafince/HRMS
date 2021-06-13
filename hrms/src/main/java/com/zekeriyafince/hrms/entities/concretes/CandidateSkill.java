package com.zekeriyafince.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
 * @date 12.06.2021 20:57
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidate_skills")
public class CandidateSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne()
    @JsonProperty(access = Access.WRITE_ONLY)
    @JoinColumn(name = "cv_id")
    private CandidateCurriculumVitae candidateCurriculumVitae;

    @Column(name = "skill_id")
    private int skillId;

    @Column(name = "explanation")
    private String explanation;

    @Column(name = "level")
    private short level;

    @Column(name = "is_deleted")
    private boolean isDeleted;

}
