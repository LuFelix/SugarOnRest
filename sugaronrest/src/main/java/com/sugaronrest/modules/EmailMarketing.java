/**
* <auto-generated />
* This file was generated by a StringTemplate 4 template.
* Don't change it directly as your change would get overwritten.  Instead, make changes
* to the .stg file (i.e. the StringTemplate 4 template) and save it to regenerate this file.
*
* For more infor on StringTemplate 4 template please go to -
* https://github.com/antlr/antlrcs
*
* @author  Kola Oyewumi
* @version 1.0
* @since   2017-01-03
*
* A class which represents the email_marketing table.
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

@Module(name = "EmailMarketing", tablename = "email_marketing")
@JsonRootName(value = "email_marketing")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailMarketing {
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }
    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer value) {
        deleted = value;
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
    public String getName() {
        return name;
    }

    public void setName(String value) {
        name = value;
    }
    public String getFromName() {
        return fromName;
    }

    public void setFromName(String value) {
        fromName = value;
    }
    public String getFromAddr() {
        return fromAddr;
    }

    public void setFromAddr(String value) {
        fromAddr = value;
    }
    public String getReplyToName() {
        return replyToName;
    }

    public void setReplyToName(String value) {
        replyToName = value;
    }
    public String getReplyToAddr() {
        return replyToAddr;
    }

    public void setReplyToAddr(String value) {
        replyToAddr = value;
    }
    public String getInboundEmailId() {
        return inboundEmailId;
    }

    public void setInboundEmailId(String value) {
        inboundEmailId = value;
    }
    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date value) {
        dateStart = value;
    }
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String value) {
        templateId = value;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String value) {
        status = value;
    }
    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String value) {
        campaignId = value;
    }
    public Integer getAllProspectLists() {
        return allProspectLists;
    }

    public void setAllProspectLists(Integer value) {
        allProspectLists = value;
    }

    @JsonProperty("id")
    private String id;
  
    @JsonProperty("deleted")
    private Integer deleted;
  
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
  
    @JsonProperty("name")
    private String name;
  
    @JsonProperty("from_name")
    private String fromName;
  
    @JsonProperty("from_addr")
    private String fromAddr;
  
    @JsonProperty("reply_to_name")
    private String replyToName;
  
    @JsonProperty("reply_to_addr")
    private String replyToAddr;
  
    @JsonProperty("inbound_email_id")
    private String inboundEmailId;
  
    @JsonProperty("date_start")
    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using = CustomDateSerializer.class)
    private Date dateStart;
  
    @JsonProperty("template_id")
    private String templateId;
  
    @JsonProperty("status")
    private String status;
  
    @JsonProperty("campaign_id")
    private String campaignId;
  
    @JsonProperty("all_prospect_lists")
    private Integer allProspectLists;
  
}