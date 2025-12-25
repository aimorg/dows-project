package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.project.admin.PostProjectTaskEntityRequest;
import org.dows.project.admin.PostProjectTaskEntityResponse;
import org.dows.project.admin.PutProjectTaskEntityRequest;
import org.dows.project.admin.PutProjectTaskEntityResponse;
import org.dows.project.admin.项目IDRequest;
import org.dows.project.admin.GetProjectTaskListResponse;
import org.dows.project.admin.项目IDRequest;
import org.dows.project.admin.GetProjectTaskPageResponse;
import org.dows.project.admin.DeleteProjectTaskEntityRequest;
import org.dows.project.admin.DeleteProjectTaskEntityResponse;

@RequiredArgsConstructor
@Tag(name = "AdminProjectTaskRest", description = "项目任务")
@RestController
public class AdminProjectTaskRest{

    @PostMapping("admin/project/task/entity")
    @Schema(title = "关联项目任务")
    public PostProjectTaskEntityResponse postEntity(@RequestBody PostProjectTaskEntityRequest postProjectTaskEntityRequest){
        return null;
    }
    @PutMapping("admin/project/task/entity")
    @Schema(title = "更新任务关联")
    public void putEntity(@RequestBody PutProjectTaskEntityRequest putProjectTaskEntityRequest){
        return null;
    }
    @GetMapping("admin/project/task/list")
    @Schema(title = "项目任务列表")
    public GetProjectTaskListResponse getList( 项目IDRequest 项目IDRequest){
        return null;
    }
    @GetMapping("admin/project/task/page")
    @Schema(title = "项目任务分页")
    public GetProjectTaskPageResponse getPage( 项目IDRequest 项目IDRequest){
        return null;
    }
    @DeleteMapping("admin/project/task/entity")
    @Schema(title = "删除")
    public void deleteEntity(@RequestBody DeleteProjectTaskEntityRequest deleteProjectTaskEntityRequest){
        return null;
    }
}