package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Tag(name = "AdminProjectFlowRest", description = "项目流程")
@RestController
public class AdminProjectFlowRest {

    @PostMapping("admin/project/flow/entity")
    @Schema(title = "新建项目流程")
    public void postEntity(@RequestBody PostProjectFlowEntityRequest postProjectFlowEntityRequest) {

    }

    @PutMapping("admin/project/flow/entity")
    @Schema(title = "更新项目流程")
    public void putEntity(@RequestBody PutProjectFlowEntityRequest putProjectFlowEntityRequest) {

    }

    @GetMapping("admin/project/flow/list")
    @Schema(title = "获取项目流程")
    public GetProjectFlowListResponse getList(GetProjectFlowListRequest getProjectFlowListRequest) {
        return null;
    }

    @DeleteMapping("admin/project/flow/entity")
    @Schema(title = "删除项目流程")
    public void deleteEntity(@RequestBody DeleteProjectFlowEntityRequest deleteProjectFlowEntityRequest) {

    }
}