package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.dows.project.admin.PostProjectSettingEntityResponse;
import org.dows.project.admin.PutProjectSettingEntityResponse;
import org.dows.project.admin.GetProjectSettingEntityRequest;
import org.dows.project.admin.GetProjectSettingEntityResponse;
import org.dows.project.admin.DeleteProjectSettingEntityRequest;
import org.dows.project.admin.DeleteProjectSettingEntityResponse;

@RequiredArgsConstructor
@Tag(name = "AdminProjectSettingRest", description = "项目设置")
@RestController
public class AdminProjectSettingRest{

    @GetMapping("admin/project/setting/entity")
    @Schema(title = "详情")
    public GetProjectSettingEntityResponse getEntity( GetProjectSettingEntityRequest getProjectSettingEntityRequest){
        return null;
    }
    @DeleteMapping("admin/project/setting/entity")
    @Schema(title = "删除")
    public DeleteProjectSettingEntityResponse deleteEntity(@RequestBody DeleteProjectSettingEntityRequest deleteProjectSettingEntityRequest){
        return null;
    }
}