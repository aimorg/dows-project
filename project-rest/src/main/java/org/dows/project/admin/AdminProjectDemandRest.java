package org.dows.project.admin;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.dows.project.repository.ProjectDemandRepository;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Tag(name = "AdminProjectDemandRest", description = "项目需求")
@RestController
public class AdminProjectDemandRest {

    private final ProjectDemandRepository projectDemandRepository;

    @PostMapping("admin/project/demand/entity")
    @Operation(summary = "创建")
    public void postEntity(@RequestBody PostProjectDemandEntityRequest postProjectDemandEntityRequest) {
        projectDemandRepository.save(postProjectDemandEntityRequest);
    }

    @PutMapping("admin/project/demand/entity")
    @Operation(summary = "更新")
    public void putEntity(@RequestBody PutProjectDemandEntityRequest putProjectDemandEntityRequest) {

    }

    @GetMapping("admin/project/demand/list")
    @Operation(summary = "查询项目需求")
    public GetProjectDemandListResponse getList(GetProjectDemandListRequest getProjectDemandListRequest) {
        return null;
    }

    @GetMapping("admin/project/demand/entity")
    @Operation(summary = "详情")
    public GetProjectDemandEntityResponse getEntity(GetProjectDemandEntityRequest getProjectDemandEntityRequest) {
        return null;
    }

    @DeleteMapping("admin/project/demand/entity")
    @Operation(summary = "删除")
    public void deleteEntity(@RequestBody DeleteProjectDemandEntityRequest deleteProjectDemandEntityRequest) {

    }
}