package com.fcrllc.aem.spademo.impl.model;

import io.neba.api.annotations.Path;
import io.neba.api.annotations.ResourceModel;

/**
 * Resource model for the schedule-table component.
 * 
 * @author David Parker (dfparker@gmail.com)
 * @author andon.sikavica
 */
@ResourceModel(types = {"aemspademo/components/scheduletable"})
public class ScheduleTableModel {

  @Path("jcr:title")
  private String title;
  private String headerTime;
  private String headerTalk;
  private String headerSpeakers;

  public String getTitle() {
    return title;
  }

  public String getHeaderTime() {
    return headerTime;
  }

  public String getHeaderTalk() {
    return headerTalk;
  }

  public String getHeaderSpeakers() {
    return headerSpeakers;
  }

}
