package org.dows.project.repository;

import org.dows.project.dao.ProjectMemberDao;
import org.dows.project.entity.ProjectMemberEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectMemberRepository extends CrudRepository<ProjectMemberDao, ProjectMemberEntity> {

}