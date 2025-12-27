package org.dows.project.dao;

import org.dows.project.entity.ProjectRepositoryEntity;
import org.dows.project.mapper.ProjectRepositoryMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectRepositoryDao extends CrudDaoImpl<ProjectRepositoryMapper, ProjectRepositoryEntity> {

}