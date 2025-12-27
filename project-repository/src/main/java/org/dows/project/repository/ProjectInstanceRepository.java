package org.dows.project.repository;

import org.dows.project.dao.ProjectInstanceDao;
import org.dows.project.entity.ProjectInstanceEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectInstanceRepository extends CrudRepository<ProjectInstanceDao, ProjectInstanceEntity> {

}