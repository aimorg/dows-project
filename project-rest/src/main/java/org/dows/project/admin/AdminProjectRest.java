package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Tag(name = "AdminProjectRest", description = "项目实例接口")
@RestController
public class AdminProjectRest {

    @PostMapping("admin/project/entity")
    @Schema(title = "创建")
    public PostProjectEntityResponse postEntity(@RequestBody PostProjectEntityRequest postProjectEntityRequest) {
        return null;
    }

    @PutMapping("admin/project/entity")
    @Schema(title = "更新")
    public void putEntity(@RequestBody PutProjectEntityRequest putProjectEntityRequest) {

    }

    @GetMapping("admin/project/page")
    @Schema(title = "根据查询条件分页")
    public GetProjectPageResponse getPage(GetProjectPageRequest getProjectPageRequest) {
        return null;
    }

    @GetMapping("admin/project/entity")
    @Schema(title = "详情")
    public GetProjectEntityResponse getEntity(GetProjectEntityRequest getProjectEntityRequest) {
        return null;
    }

    @DeleteMapping("admin/project/entity")
    @Schema(title = "删除")
    public void deleteEntity(@RequestBody DeleteProjectEntityRequest deleteProjectEntityRequest) {

    }

    @PostMapping("admin/project/member")
    @Schema(title = "增加项目成员")
    public PostProjectMemberResponse postMember(@RequestBody PostProjectMemberRequest postProjectMemberRequest) {
        return null;
    }

    @GetMapping("admin/project/member")
    @Schema(title = "项目成员列表")
    public GetProjectMemberResponse getMember(GetProjectMemberRequest getProjectMemberRequest) {
        return null;
    }

    @DeleteMapping("admin/project/member")
    @Schema(title = "删除项目成员")
    public void deleteMember(@RequestBody DeleteProjectMemberRequest deleteProjectMemberRequest) {

    }
}