package org.dows.project.repository;

import org.dows.project.dao.ProjectTagDao;
import org.dows.project.entity.ProjectTagEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectTagRepository extends CrudRepository<ProjectTagDao, ProjectTagEntity> {

}