package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.project.admin.PostProjectMilestoneEntityRequest;
import org.dows.project.admin.PostProjectMilestoneEntityResponse;
import org.dows.project.admin.PutProjectMilestoneEntityRequest;
import org.dows.project.admin.PutProjectMilestoneEntityResponse;
import org.dows.project.admin.GetProjectMilestoneEntityRequest;
import org.dows.project.admin.GetProjectMilestoneEntityResponse;
import org.dows.project.admin.DeleteProjectMilestoneEntityRequest;
import org.dows.project.admin.DeleteProjectMilestoneEntityResponse;
import org.dows.project.admin.GetProjectMilestoneListRequest;
import org.dows.project.admin.GetProjectMilestoneListResponse;

@RequiredArgsConstructor
@Tag(name = "AdminProjectMilestoneRest", description = "项目里程碑")
@RestController
public class AdminProjectMilestoneRest{

    @PostMapping("admin/project/milestone/entity")
    @Schema(title = "创建项目里程碑")
    public PostProjectMilestoneEntityResponse postEntity(@RequestBody PostProjectMilestoneEntityRequest postProjectMilestoneEntityRequest){
        return null;
    }
    @PutMapping("admin/project/milestone/entity")
    @Schema(title = "更新项目里程碑")
    public void putEntity(@RequestBody PutProjectMilestoneEntityRequest putProjectMilestoneEntityRequest){
        return null;
    }
    @GetMapping("admin/project/milestone/entity")
    @Schema(title = "获取项目里程碑")
    public GetProjectMilestoneEntityResponse getEntity( GetProjectMilestoneEntityRequest getProjectMilestoneEntityRequest){
        return null;
    }
    @DeleteMapping("admin/project/milestone/entity")
    @Schema(title = "删除项目里程碑")
    public void deleteEntity(@RequestBody DeleteProjectMilestoneEntityRequest deleteProjectMilestoneEntityRequest){
        return null;
    }
    @GetMapping("admin/project/milestone/list")
    @Schema(title = "项目里程碑列表")
    public GetProjectMilestoneListResponse getList( GetProjectMilestoneListRequest getProjectMilestoneListRequest){
        return null;
    }
}