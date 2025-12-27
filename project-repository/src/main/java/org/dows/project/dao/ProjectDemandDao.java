package org.dows.project.dao;

import org.dows.project.entity.ProjectDemandEntity;
import org.dows.project.mapper.ProjectDemandMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectDemandDao extends CrudDaoImpl<ProjectDemandMapper, ProjectDemandEntity> {

}