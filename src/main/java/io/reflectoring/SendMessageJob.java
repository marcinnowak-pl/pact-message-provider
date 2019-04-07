package io.reflectoring;

import java.io.IOException;
import java.util.Random;
import java.util.UUID;

import org.springframework.scheduling.annotation.Scheduled;

class SendMessageJob {

	private Random random = new Random();

	private MessageProducer messageProducer;

	SendMessageJob(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

	/**
	 * This scheduled job simulates the "real" business logic that should produce messages.
	 */
	@Scheduled(fixedDelay = 1000)
	void sendUserCreatedMessage() {
		try {
			User user = new User(42L, "Zaphod Beeblebrox");
			UserCreatedMessage message = new UserCreatedMessage("test", user);
			messageProducer.produceUserCreatedMessage(message);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
