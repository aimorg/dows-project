package org.dows.project.dao;

import org.dows.project.entity.ProjectInstanceEntity;
import org.dows.project.mapper.ProjectInstanceMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectInstanceDao extends CrudDaoImpl<ProjectInstanceMapper, ProjectInstanceEntity> {

}