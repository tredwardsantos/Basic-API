package com.pleasee.basic.listo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class listserv {

	private List<list> topics= new ArrayList<>(Arrays.asList(
			new list("1","Edward","A","Santos","Angeles City","099999999"),
			new list("2","Luis","wat","Gutierrez","The Goblet","099999999"),
			new list("3","Emarina","E","Erwood","Singapore","099999999")		
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

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}
