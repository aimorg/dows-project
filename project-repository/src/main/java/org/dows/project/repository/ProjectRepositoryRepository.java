package org.dows.project.repository;

import org.dows.project.dao.ProjectRepositoryDao;
import org.dows.project.entity.ProjectRepositoryEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectRepositoryRepository extends CrudRepository<ProjectRepositoryDao, ProjectRepositoryEntity> {

}