/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edorm;

import java.util.Date;

/**
 *
 * @author fluke
 */
public class Message {
    private int messageId; 
    private String messageTopic;
    private Date messageDate;
    private String messageContent;

    public Message(int messageId, String messageTopic, Date messageDate, String messageContent) {
        this.messageId = messageId;
        this.messageTopic = messageTopic;
        this.messageDate = messageDate;
        this.messageContent = messageContent;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessageTopic() {
        return messageTopic;
    }

    public void setMessageTopic(String messageTopic) {
        this.messageTopic = messageTopic;
    }

    public Date getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(Date messageDate) {
        this.messageDate = messageDate;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }
    
    /*-----------------------*/
    public String getMessage(){
        return messageContent;
    }
    public String createMessage(){
        //method ที่เกี่ยวกับการสร้าง message
        return messageContent;
    }
    public String deleteMessage(){
        //method ที่เกี่ยวกัยการลบ Message 
        return messageContent;
    }
    
    
}
