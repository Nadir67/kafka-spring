package org.nad.KafkaSpring;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service

public class MessageService {
	@KafkaListener(topics="test4",groupId="groupe-ms")

	public void onMessage(ConsumerRecord<String, String> cr) {

		System.out.println("******************");
		
			System.out.println(cr.key()+"=>"+cr.value());
		
		System.out.println("*******************");
}
}