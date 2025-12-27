package org.dows.project.repository;

import org.dows.project.dao.ProjectDemandDao;
import org.dows.project.entity.ProjectDemandEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectDemandRepository extends CrudRepository<ProjectDemandDao, ProjectDemandEntity> {

}