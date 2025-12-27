package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "PutProjectKanbanEntityResponse 对象")
public class PutProjectKanbanEntityResponse {

    @Schema(description = "项目看板Id")
    private Long projectKanbanId;

}