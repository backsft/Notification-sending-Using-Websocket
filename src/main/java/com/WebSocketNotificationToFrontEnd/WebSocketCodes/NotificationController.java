package com.WebSocketNotificationToFrontEnd.WebSocketCodes;
import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private final SimpMessagingTemplate messagingTemplate;

    public NotificationController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @PostMapping("/send-notification")
    public ResponseEntity<String> sendNotification(@RequestBody MessegeDTO messegeDTO) {
        messegeDTO.setLocalDate(LocalDate.now());

        messagingTemplate.convertAndSend("/topic/notification", messegeDTO);

        return ResponseEntity.ok("Notification sent!");
    }
}
