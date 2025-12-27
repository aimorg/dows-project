package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Tag(name = "AdminProjectSettingRest", description = "项目设置")
@RestController
public class AdminProjectSettingRest {

    @GetMapping("admin/project/setting/entity")
    @Schema(title = "详情")
    public GetProjectSettingEntityResponse getEntity(GetProjectSettingEntityRequest getProjectSettingEntityRequest) {
        return null;
    }

    @DeleteMapping("admin/project/setting/entity")
    @Schema(title = "删除")
    public void deleteEntity(@RequestBody DeleteProjectSettingEntityRequest deleteProjectSettingEntityRequest) {

    }
}