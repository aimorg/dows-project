package org.dows.project.dao;

import org.dows.project.entity.ProjectMilestoneEntity;
import org.dows.project.mapper.ProjectMilestoneMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectMilestoneDao extends CrudDaoImpl<ProjectMilestoneMapper, ProjectMilestoneEntity> {

}