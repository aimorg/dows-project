package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.project.admin.PostProjectDemandEntityRequest;
import org.dows.project.admin.PostProjectDemandEntityResponse;
import org.dows.project.admin.PutProjectDemandEntityRequest;
import org.dows.project.admin.PutProjectDemandEntityResponse;
import org.dows.project.admin.GetProjectDemandListRequest;
import org.dows.project.admin.GetProjectDemandListResponse;
import org.dows.project.admin.GetProjectDemandEntityRequest;
import org.dows.project.admin.GetProjectDemandEntityResponse;
import org.dows.project.admin.DeleteProjectDemandEntityRequest;
import org.dows.project.admin.DeleteProjectDemandEntityResponse;

@RequiredArgsConstructor
@Tag(name = "AdminProjectDemandRest", description = "项目需求")
@RestController
public class AdminProjectDemandRest{

    @PostMapping("admin/project/demand/entity")
    @Schema(title = "创建")
    public void postEntity(@RequestBody PostProjectDemandEntityRequest postProjectDemandEntityRequest){
        
    }
    @PutMapping("admin/project/demand/entity")
    @Schema(title = "更新")
    public void putEntity(@RequestBody PutProjectDemandEntityRequest putProjectDemandEntityRequest){
        
    }
    @GetMapping("admin/project/demand/list")
    @Schema(title = "查询项目需求")
    public GetProjectDemandListResponse getList( GetProjectDemandListRequest getProjectDemandListRequest){
        return null;
    }
    @GetMapping("admin/project/demand/entity")
    @Schema(title = "详情")
    public GetProjectDemandEntityResponse getEntity( GetProjectDemandEntityRequest getProjectDemandEntityRequest){
        return null;
    }
    @DeleteMapping("admin/project/demand/entity")
    @Schema(title = "删除")
    public void deleteEntity(@RequestBody DeleteProjectDemandEntityRequest deleteProjectDemandEntityRequest){
        
    }
}