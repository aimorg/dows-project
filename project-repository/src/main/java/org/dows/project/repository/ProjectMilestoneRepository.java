package org.dows.project.repository;

import org.dows.project.dao.ProjectMilestoneDao;
import org.dows.project.entity.ProjectMilestoneEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectMilestoneRepository extends CrudRepository<ProjectMilestoneDao, ProjectMilestoneEntity> {

}