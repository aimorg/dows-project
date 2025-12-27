package org.dows.project.dao;

import org.dows.project.entity.ProjectOpsEntity;
import org.dows.project.mapper.ProjectOpsMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectOpsDao extends CrudDaoImpl<ProjectOpsMapper, ProjectOpsEntity> {

}