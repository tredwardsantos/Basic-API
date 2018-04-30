package com.pleasee.basic.listo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class lister {

@Autowired
public listserv listservice;

	@RequestMapping("/list")
	public List<list> getlist()
	{
		return listservice.getAllTopics();
	}
	
	@RequestMapping("/list/{id}")
	public list getTopic(@PathVariable String id)
	{
		return listservice.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/list")
	public void addTopic(@RequestBody list topic) {
		listservice.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/list/{id}")
	public void updateUser(@RequestBody list topic, @PathVariable String id) {
		listservice.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/list/{id}")
	public void deleteTopic(@PathVariable String id) {
		listservice.deleteTopic(id);
	}

	}
