package org.dows.project.repository;

import org.dows.project.dao.ProjectSettingDao;
import org.dows.project.entity.ProjectSettingEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectSettingRepository extends CrudRepository<ProjectSettingDao, ProjectSettingEntity> {

}