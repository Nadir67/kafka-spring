package org.nad.KafkaSpring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping("/send/{message}/{topic}")
	
	public String send(@PathVariable String message,
			           @PathVariable String topic) {
		
		
		kafkaTemplate.send(topic,"key"+message.length(),message);
		return "Message sent ....";
		
	}
		
	
	
	

}
