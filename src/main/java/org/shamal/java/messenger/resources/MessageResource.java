package org.shamal.java.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.shamal.java.messenger.service.MessageService;

import org.shamal.java.messenger.model.Message;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
}
