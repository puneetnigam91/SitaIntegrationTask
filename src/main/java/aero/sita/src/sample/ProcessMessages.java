package aero.sita.src.sample;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

/**
 * Process Messages for the output and create message with new content.
 * 
 * @author puneet.nigam
 *
 */
public class ProcessMessages {

    /**
     * buildMessages
     * @param message , not null.
     * @return Object , never null.
     */
    public Object buildValidMessages(Message<?> message) {
        String content = getPayloadData(message.getPayload().toString());
        Message<String> output = MessageBuilder.withPayload(content).copyHeaders(message.getHeaders()).build();
        return output;
    }

    /**
     * getPayloadData
     * @param payload , not null.
     * @return the sum of the lines, never null.
     */
    private String getPayloadData(String payload) {
        long sum = 0;
        String[] lines = payload.split("\n");
        for (String line : lines) {
            sum = sum + Long.valueOf(line.trim());
        }
        return String.valueOf(sum);
    }
}
