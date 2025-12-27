package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "DeleteProjectFlowEntityRequest 对象")
public class DeleteProjectFlowEntityRequest {

    @Schema(description = "项目流程看板ID")
    private Long projectFlowId;

}