package com.WebSocketNotificationToFrontEnd.WebSocketCodes;

import java.time.LocalDate;

public class MessegeDTO {

	private int msgId;
	private String content;
	private LocalDate localDate;

	public int getMsgId() {
		return msgId;
	}

	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public MessegeDTO(int msgId, String content, LocalDate localDate) {
		super();
		this.msgId = msgId;
		this.content = content;
		this.localDate = localDate;
	}

	public MessegeDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MessegeDTO [msgId=" + msgId + ", content=" + content + ", localDate=" + localDate + "]";
	}

}
