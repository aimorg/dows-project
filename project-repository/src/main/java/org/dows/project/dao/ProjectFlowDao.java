package org.dows.project.dao;

import org.dows.project.entity.ProjectFlowEntity;
import org.dows.project.mapper.ProjectFlowMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectFlowDao extends CrudDaoImpl<ProjectFlowMapper, ProjectFlowEntity> {

}