package org.dows.project.repository;

import org.dows.project.dao.ProjectOpsDao;
import org.dows.project.entity.ProjectOpsEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectOpsRepository extends CrudRepository<ProjectOpsDao, ProjectOpsEntity> {

}