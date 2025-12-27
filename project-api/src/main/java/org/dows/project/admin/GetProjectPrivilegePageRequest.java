package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "GetProjectPrivilegePageRequest 对象")
public class GetProjectPrivilegePageRequest {

    @Schema(description = "项目资源ID")
    private Long projectResourceId;

    @Schema(description = "项目资源(表名)[all,document,task...]")
    private String projectResource;

}