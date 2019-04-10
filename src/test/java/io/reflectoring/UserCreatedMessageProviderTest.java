package io.reflectoring;

import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

import au.com.dius.pact.provider.PactVerifyProvider;
import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.NotImplementedException;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

@RunWith(PactRunner.class)
@Provider("userservice")
@PactFolder("pacts")
public class UserCreatedMessageProviderTest {

	@TestTarget
	public final Target target = new CustomAmqpTarget(Collections.singletonList("io.reflectoring"));

	private MessagePublisher publisher = Mockito.mock(MessagePublisher.class);

	private MessageProducer messageProducer = new MessageProducer(new ObjectMapper(), publisher);

	@PactVerifyProvider("a user created message")
	public String verifyUserCreatedMessage() throws IOException {
		throw new NotImplementedException("not implemented yet");

		//mock real MessagePublisher

		//build UserCreatedMessage object

		//call MessageProducer

		//capture the JSON sent to publisher

		//return captured message
	}
}
