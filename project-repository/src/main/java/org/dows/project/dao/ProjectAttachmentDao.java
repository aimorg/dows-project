package org.dows.project.dao;

import org.dows.project.entity.ProjectAttachmentEntity;
import org.dows.project.mapper.ProjectAttachmentMapper;
import org.dows.rade.crud.CrudDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class ProjectAttachmentDao extends CrudDaoImpl<ProjectAttachmentMapper, ProjectAttachmentEntity> {

}