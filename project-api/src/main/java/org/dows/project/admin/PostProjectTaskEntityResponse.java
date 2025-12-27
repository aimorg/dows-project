package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "PostProjectTaskEntityResponse 对象")
public class PostProjectTaskEntityResponse {

    @Schema(description = "项目任务ID")
    private Long projectTaskId;

}