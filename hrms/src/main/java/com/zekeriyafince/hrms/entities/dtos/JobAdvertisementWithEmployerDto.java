package com.zekeriyafince.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 13.06.2021 00:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementWithEmployerDto {

    private int jobPostingId;

    private int employerId;
}
