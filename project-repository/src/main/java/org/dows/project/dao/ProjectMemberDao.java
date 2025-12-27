package org.dows.project.dao;

import org.dows.project.entity.ProjectMemberEntity;
import org.dows.project.mapper.ProjectMemberMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectMemberDao extends CrudDaoImpl<ProjectMemberMapper, ProjectMemberEntity> {

}