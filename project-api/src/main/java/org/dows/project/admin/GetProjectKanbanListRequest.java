package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "GetProjectKanbanListRequest 对象")
public class GetProjectKanbanListRequest {

    @Schema(description = "项目ID")
    private Long projectInstanceId;

    @Schema(description = "项目流程ID")
    private Long projectFlowId;

}