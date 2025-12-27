package org.dows.project.dao;

import org.dows.project.entity.ProjectKanbanEntity;
import org.dows.project.mapper.ProjectKanbanMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectKanbanDao extends CrudDaoImpl<ProjectKanbanMapper, ProjectKanbanEntity> {

}