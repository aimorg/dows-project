package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "GetProjectMemberRequest 对象")
public class GetProjectMemberRequest {

    @Schema(description = "项目ID")
    private Long projectInstanceId;

}