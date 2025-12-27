package org.dows.project.dao;

import org.dows.project.entity.ProjectTaskEntity;
import org.dows.project.mapper.ProjectTaskMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectTaskDao extends CrudDaoImpl<ProjectTaskMapper, ProjectTaskEntity> {

}