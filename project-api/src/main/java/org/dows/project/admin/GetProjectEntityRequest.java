package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "GetProjectEntityRequest 对象")
public class GetProjectEntityRequest {

    @Schema(description = "项目ID")
    private Long projectInstanceId;

}