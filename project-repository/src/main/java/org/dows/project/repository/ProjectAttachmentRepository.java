package org.dows.project.repository;

import org.dows.project.dao.ProjectAttachmentDao;
import org.dows.project.entity.ProjectAttachmentEntity;
import org.dows.rade.crud.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class ProjectAttachmentRepository extends CrudRepository<ProjectAttachmentDao, ProjectAttachmentEntity> {

}