package com.zekeriyafince.hrms.entities.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zekeriyafince.hrms.entities.concretes.Candidate;
import com.zekeriyafince.hrms.entities.concretes.CandidateCurriculumVitae;
import com.zekeriyafince.hrms.entities.concretes.CandidateSchool;
import com.zekeriyafince.hrms.entities.concretes.CandidateSkill;
import com.zekeriyafince.hrms.entities.concretes.Experience;
import com.zekeriyafince.hrms.entities.concretes.Language;
import com.zekeriyafince.hrms.entities.concretes.SocialMediaLink;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 20:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CurriculumVitaeWithCandidateDto {

    @JsonIgnore
    private Candidate candidate;
    private String imgUrl;
    private String explanation;
    private LocalDate date;
    private boolean isActive;
    private boolean isDeleted;
    private List<CandidateSchool> candidateSchools;
    private List<CandidateSkill> candidateSkills;
    private List<Experience> experiences;
    private List<SocialMediaLink> socialMediaLinks;
    private List<Language> languages;

}
