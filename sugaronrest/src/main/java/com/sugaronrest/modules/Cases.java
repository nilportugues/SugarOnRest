/**
* <auto-generated />
* This file was generated by a StringTemplate 4 template.
* Don't change it directly as your change would get overwritten. Instead, make changes
* to the .stg file (i.e. the StringTemplate 4 template file) and save it to regenerate this file.
*
* For more infor on StringTemplate 4 template please go to -
* https://github.com/antlr/antlrcs
*
* @author  Kola Oyewumi
* @version 1.0.0
* @since   2017-01-03
*
* A class which represents the cases table.
*/

package com.sugaronrest.modules;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sugaronrest.restapicalls.Module;
import com.sugaronrest.restapicalls.CustomDateDeserializer;
import com.sugaronrest.restapicalls.CustomDateSerializer;

import java.util.Date;

@Module(name = "Cases", tablename = "cases")
@JsonRootName(value = "cases")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cases {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }
    public Date getDateEntered() {
        return dateEntered;
    }

    public void setDateEntered(Date value) {
        dateEntered = value;
    }
    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date value) {
        dateModified = value;
    }
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String value) {
        modifiedUserId = value;
    }
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        createdBy = value;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String value) {
        description = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
    }
    public String getAssignedUserId() {
        return assignedUserId;
    }

    public void setAssignedUserId(String value) {
        assignedUserId = value;
    }
    public int getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(int value) {
        caseNumber = value;
    }
    public String getType() {
        return type;
    }

    public void setType(String value) {
        type = value;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        status = value;
    }
    public String getPriority() {
        return priority;
    }

    public void setPriority(String value) {
        priority = value;
    }
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String value) {
        resolution = value;
    }
    public String getWorkLog() {
        return workLog;
    }

    public void setWorkLog(String value) {
        workLog = value;
    }
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String value) {
        accountId = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("name")
    private String name;
  
    @JsonProperty("date_entered")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateEntered;
  
    @JsonProperty("date_modified")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateModified;
  
    @JsonProperty("modified_user_id")
    private String modifiedUserId;
  
    @JsonProperty("created_by")
    private String createdBy;
  
    @JsonProperty("description")
    private String description;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
    @JsonProperty("assigned_user_id")
    private String assignedUserId;
  
    @JsonProperty("case_number")
    private int caseNumber;
  
    @JsonProperty("type")
    private String type;
  
    @JsonProperty("status")
    private String status;
  
    @JsonProperty("priority")
    private String priority;
  
    @JsonProperty("resolution")
    private String resolution;
  
    @JsonProperty("work_log")
    private String workLog;
  
    @JsonProperty("account_id")
    private String accountId;
  
}
