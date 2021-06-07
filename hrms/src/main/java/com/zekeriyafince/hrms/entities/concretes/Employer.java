package com.zekeriyafince.hrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 02.06.2021 22:24
 */
@Data
@Entity
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobadvertisements"})
@EqualsAndHashCode(callSuper = false)
public class Employer extends User {

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_adress")
    private String webAddress;

    @Column(name = "phone_number")
    private String phoneNumber;
    
    @OneToMany(mappedBy = "employer")
	List<JobAdvertisement> jobAdvertisements;

}
