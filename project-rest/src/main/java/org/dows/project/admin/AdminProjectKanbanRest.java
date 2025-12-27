package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Tag(name = "AdminProjectKanbanRest", description = "项目看板")
@RestController
public class AdminProjectKanbanRest {

    @PostMapping("admin/project/kanban/entity")
    @Schema(title = "新建项目看板")
    public PostProjectKanbanEntityResponse postEntity(@RequestBody PostProjectKanbanEntityRequest postProjectKanbanEntityRequest) {
        return null;
    }

    @PutMapping("admin/project/kanban/entity")
    @Schema(title = "更新项目看板")
    public PutProjectKanbanEntityResponse putEntity(@RequestBody PutProjectKanbanEntityRequest putProjectKanbanEntityRequest) {
        return null;
    }

    @GetMapping("admin/project/kanban/list")
    @Schema(title = "获取项目看板")
    public GetProjectKanbanListResponse getList(GetProjectKanbanListRequest getProjectKanbanListRequest) {
        return null;
    }

    @DeleteMapping("admin/project/kanban/entity")
    @Schema(title = "删除项目看板")
    public void deleteEntity(@RequestBody DeleteProjectKanbanEntityRequest deleteProjectKanbanEntityRequest) {

    }
}