package com.Shree.Chat.chat;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ChatMessage {
    private String content;

    private String Sender;
    private MessageType type;
}
