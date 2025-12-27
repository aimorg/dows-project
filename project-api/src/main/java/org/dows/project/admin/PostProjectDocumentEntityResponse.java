package org.dows.project.admin;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Schema(description = "PostProjectDocumentEntityResponse 对象")
public class PostProjectDocumentEntityResponse {

    @Schema(description = "项目文档ID")
    private Long projectDocumentId;

}