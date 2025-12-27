package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "DeleteProjectMemberRequest 对象")
public class DeleteProjectMemberRequest {

    @Schema(description = "项目ID")
    private Long projectInstanceId;

}