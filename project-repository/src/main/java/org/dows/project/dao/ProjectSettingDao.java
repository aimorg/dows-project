package org.dows.project.dao;

import org.dows.project.entity.ProjectSettingEntity;
import org.dows.project.mapper.ProjectSettingMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectSettingDao extends CrudDaoImpl<ProjectSettingMapper, ProjectSettingEntity> {

}