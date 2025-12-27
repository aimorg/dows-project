package org.dows.project.dao;

import org.dows.project.entity.ProjectTagEntity;
import org.dows.project.mapper.ProjectTagMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectTagDao extends CrudDaoImpl<ProjectTagMapper, ProjectTagEntity> {

}