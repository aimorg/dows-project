package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "GetProjectMemberPageRequest 对象")
public class GetProjectMemberPageRequest {

    @Schema(description = "项目ID")
    private Long projectInstanceId;

    @Schema(description = "账号昵称")
    private String nickname;

    @Schema(description = "参与者角色[h5，java，test...]")
    private String memberRole;

}