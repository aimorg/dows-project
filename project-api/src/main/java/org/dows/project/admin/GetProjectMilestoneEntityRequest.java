package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "GetProjectMilestoneEntityRequest 对象")
public class GetProjectMilestoneEntityRequest {

    @Schema(description = "项目里程碑ID")
    private Long projectMilestoneId;

}