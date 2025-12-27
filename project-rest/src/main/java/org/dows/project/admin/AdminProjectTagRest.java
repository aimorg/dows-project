package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Tag(name = "AdminProjectTagRest", description = "项目标签")
@RestController
public class AdminProjectTagRest {

    @PostMapping("admin/project/tag/entity")
    @Schema(title = "保存")
    public void postEntity(@RequestBody PostProjectTagEntityRequest postProjectTagEntityRequest) {

    }

    @PutMapping("admin/project/tag/entity")
    @Schema(title = "更新")
    public void putEntity(@RequestBody PutProjectTagEntityRequest putProjectTagEntityRequest) {

    }

    @GetMapping("admin/project/tag/list")
    @Schema(title = "查询项目下的标签信息")
    public GetProjectTagListResponse getList(GetProjectTagListRequest getProjectTagListRequest) {
        return null;
    }

    @GetMapping("admin/project/tag/entity")
    @Schema(title = "详情")
    public GetProjectTagEntityResponse getEntity(GetProjectTagEntityRequest getProjectTagEntityRequest) {
        return null;
    }

    @DeleteMapping("admin/project/tag/entity")
    @Schema(title = "删除")
    public void deleteEntity(@RequestBody DeleteProjectTagEntityRequest deleteProjectTagEntityRequest) {

    }
}