package org.dows.project.repository;

import org.dows.project.dao.ProjectMindDao;
import org.dows.project.entity.ProjectMindEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectMindRepository extends CrudRepository<ProjectMindDao, ProjectMindEntity> {

}