package org.dows.project.repository;

import org.dows.project.dao.ProjectKanbanDao;
import org.dows.project.entity.ProjectKanbanEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectKanbanRepository extends CrudRepository<ProjectKanbanDao, ProjectKanbanEntity> {

}