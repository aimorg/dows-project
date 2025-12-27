package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Tag(name = "AdminProjectMemberRest", description = "项目成员")
@RestController
public class AdminProjectMemberRest {

    @PostMapping("admin/project/member/entity")
    @Schema(title = "新增项目成员")
    public PostProjectMemberEntityResponse postEntity(@RequestBody PostProjectMemberEntityRequest postProjectMemberEntityRequest) {
        return null;
    }

    @GetMapping("admin/project/member/entity")
    @Schema(title = "查询项目成员")
    public GetProjectMemberEntityResponse getEntity(GetProjectMemberEntityRequest getProjectMemberEntityRequest) {
        return null;
    }

    @GetMapping("admin/project/member/list")
    @Schema(title = "项目成员列表")
    public GetProjectMemberListResponse getList(GetProjectMemberListRequest getProjectMemberListRequest) {
        return null;
    }

    @GetMapping("admin/project/member/page")
    @Schema(title = "项目成员分页")
    public GetProjectMemberPageResponse getPage(GetProjectMemberPageRequest getProjectMemberPageRequest) {
        return null;
    }

    @DeleteMapping("admin/project/member/entity")
    @Schema(title = "删除项目成员")
    public void deleteEntity(@RequestBody DeleteProjectMemberEntityRequest deleteProjectMemberEntityRequest) {

    }
}