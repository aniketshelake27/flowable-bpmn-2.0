package com.flowable.bpmn.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class TicketEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long ticketId;
    String ticketType;
    String ticketTitle;
    String ticketDescriptiong;
    String ticketCreater;
    String ticketAssignee;
    String ticketAssignedTo;
    String ticketStatusCurr;
    String ticketStatusPrev;
    String ticketComment;
    Boolean isAttachmentPrf;
}
