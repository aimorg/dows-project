package org.dows.project.repository;

import org.dows.project.dao.ProjectTaskDao;
import org.dows.project.entity.ProjectTaskEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectTaskRepository extends CrudRepository<ProjectTaskDao, ProjectTaskEntity> {

}