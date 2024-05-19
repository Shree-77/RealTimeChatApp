package com.Shree.Chat.chat;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return Sender;
    }

    public void setSender(String sender) {
        Sender = sender;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    private String Sender;
    private MessageType type;
}
