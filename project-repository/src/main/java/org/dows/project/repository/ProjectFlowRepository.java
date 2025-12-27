package org.dows.project.repository;

import org.dows.project.dao.ProjectFlowDao;
import org.dows.project.entity.ProjectFlowEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectFlowRepository extends CrudRepository<ProjectFlowDao, ProjectFlowEntity> {

}