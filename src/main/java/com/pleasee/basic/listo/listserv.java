package com.pleasee.basic.listo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class listserv {

	private List<list> topics= new ArrayList<>(Arrays.asList(
			new list("1","aaaa","aaaaaaa"),
			new list("2","adfda","appppooo"),
			new list("3","adfda","appppooo")		
			));
	public List<list> getAllTopics(){
		return topics;
	}
	
	public list getTopic(String id)
	{
		return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(list topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, list topic) {
		for (int i=0; i< topics.size(); i++) {
			list t = topics.get(i);
			if (t.getId().equals(id)) {
				topics.set(i,  topic);
				return;
			}
		}
	}
}
