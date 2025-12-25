package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.project.admin.PostProjectFlowEntityRequest;
import org.dows.project.admin.PostProjectFlowEntityResponse;
import org.dows.project.admin.PutProjectFlowEntityRequest;
import org.dows.project.admin.PutProjectFlowEntityResponse;
import org.dows.project.admin.GetProjectFlowListRequest;
import org.dows.project.admin.GetProjectFlowListResponse;
import org.dows.project.admin.DeleteProjectFlowEntityRequest;
import org.dows.project.admin.DeleteProjectFlowEntityResponse;

@RequiredArgsConstructor
@Tag(name = "AdminProjectFlowRest", description = "项目流程")
@RestController
public class AdminProjectFlowRest{

    @PostMapping("admin/project/flow/entity")
    @Schema(title = "新建项目流程")
    public void postEntity(@RequestBody PostProjectFlowEntityRequest postProjectFlowEntityRequest){
        
    }
    @PutMapping("admin/project/flow/entity")
    @Schema(title = "更新项目流程")
    public void putEntity(@RequestBody PutProjectFlowEntityRequest putProjectFlowEntityRequest){
        
    }
    @GetMapping("admin/project/flow/list")
    @Schema(title = "获取项目流程")
    public GetProjectFlowListResponse getList( GetProjectFlowListRequest getProjectFlowListRequest){
        return null;
    }
    @DeleteMapping("admin/project/flow/entity")
    @Schema(title = "删除项目流程")
    public void deleteEntity(@RequestBody DeleteProjectFlowEntityRequest deleteProjectFlowEntityRequest){
        
    }
}