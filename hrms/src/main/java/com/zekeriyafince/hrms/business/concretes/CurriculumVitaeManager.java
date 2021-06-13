package com.zekeriyafince.hrms.business.concretes;

import com.zekeriyafince.hrms.business.abstracts.CandidateCurriculumVitaeService;
import com.zekeriyafince.hrms.business.abstracts.CandidateSchoolService;
import com.zekeriyafince.hrms.business.abstracts.CandidateService;
import com.zekeriyafince.hrms.business.abstracts.CandidateSkillService;
import com.zekeriyafince.hrms.business.abstracts.CurriculumVitaeService;
import com.zekeriyafince.hrms.business.abstracts.ExperienceService;
import com.zekeriyafince.hrms.business.abstracts.LanguageService;
import com.zekeriyafince.hrms.business.abstracts.SocialMediaLinkService;
import com.zekeriyafince.hrms.core.utilities.results.DataResult;
import com.zekeriyafince.hrms.core.utilities.results.Result;
import com.zekeriyafince.hrms.core.utilities.results.SuccesResult;
import com.zekeriyafince.hrms.entities.concretes.Candidate;
import com.zekeriyafince.hrms.entities.concretes.CandidateCurriculumVitae;
import com.zekeriyafince.hrms.entities.dtos.CurriculumVitaeWithCandidateDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 23:20
 */
public class CurriculumVitaeManager implements CurriculumVitaeService {

    private CandidateCurriculumVitaeService candidateCurriculumVitaeService;
    private CandidateSchoolService candidateSchoolService;
    private CandidateSkillService candidateSkillService;
    private ExperienceService experienceService;
    private SocialMediaLinkService socialMediaLinkService;
    private LanguageService languageService;

    @Autowired
    public CurriculumVitaeManager(CandidateCurriculumVitaeService candidateCurriculumVitaeService, CandidateSchoolService candidateSchoolService, CandidateSkillService candidateSkillService, ExperienceService experienceService, SocialMediaLinkService socialMediaLinkService, LanguageService languageService) {
        this.candidateCurriculumVitaeService = candidateCurriculumVitaeService;
        this.candidateSchoolService = candidateSchoolService;
        this.candidateSkillService = candidateSkillService;
        this.experienceService = experienceService;
        this.socialMediaLinkService = socialMediaLinkService;
        this.languageService = languageService;
    }

    @Override
    public Result add(CurriculumVitaeWithCandidateDto dto, int cvId) {

        CandidateCurriculumVitae candidateCurriculumVitae = this.candidateCurriculumVitaeService.getById(cvId).getData();

        dto.getCandidateSchools().forEach(candidateSchool -> candidateSchool.setCandidateCurriculumVitae(candidateCurriculumVitae));
        dto.getCandidateSchools().forEach(candidateSchool -> this.candidateSchoolService.add(candidateSchool));

        dto.getCandidateSkills().forEach(candidateSkill -> candidateSkill.setCandidateCurriculumVitae(candidateCurriculumVitae));
        dto.getCandidateSkills().forEach(candidateSkill -> this.candidateSkillService.add(candidateSkill));

        dto.getExperiences().forEach(experience -> experience.setCandidateCurriculumVitae(candidateCurriculumVitae));
        dto.getExperiences().forEach(experience -> this.experienceService.add(experience));

        dto.getLanguages().forEach(language -> language.setCandidateCurriculumVitae(candidateCurriculumVitae));
        dto.getLanguages().forEach(language -> this.languageService.add(language));

        dto.getSocialMediaLinks().forEach(socialMediaLink -> socialMediaLink.setCandidateCurriculumVitae(candidateCurriculumVitae));
        dto.getSocialMediaLinks().forEach(socialMediaLink -> this.socialMediaLinkService.add(socialMediaLink));

        return new SuccesResult("Cv Kaydedildi.");

    }

    @Override
    public DataResult<CurriculumVitaeWithCandidateDto> getByCandidateId(int cvId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
