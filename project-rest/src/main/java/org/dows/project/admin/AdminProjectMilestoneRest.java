package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Tag(name = "AdminProjectMilestoneRest", description = "项目里程碑")
@RestController
public class AdminProjectMilestoneRest {

    @PostMapping("admin/project/milestone/entity")
    @Schema(title = "创建项目里程碑")
    public PostProjectMilestoneEntityResponse postEntity(@RequestBody PostProjectMilestoneEntityRequest postProjectMilestoneEntityRequest) {
        return null;
    }

    @PutMapping("admin/project/milestone/entity")
    @Schema(title = "更新项目里程碑")
    public void putEntity(@RequestBody PutProjectMilestoneEntityRequest putProjectMilestoneEntityRequest) {

    }

    @GetMapping("admin/project/milestone/entity")
    @Schema(title = "获取项目里程碑")
    public GetProjectMilestoneEntityResponse getEntity(GetProjectMilestoneEntityRequest getProjectMilestoneEntityRequest) {
        return null;
    }

    @DeleteMapping("admin/project/milestone/entity")
    @Schema(title = "删除项目里程碑")
    public void deleteEntity(@RequestBody DeleteProjectMilestoneEntityRequest deleteProjectMilestoneEntityRequest) {

    }

    @GetMapping("admin/project/milestone/list")
    @Schema(title = "项目里程碑列表")
    public GetProjectMilestoneListResponse getList(GetProjectMilestoneListRequest getProjectMilestoneListRequest) {
        return null;
    }
}