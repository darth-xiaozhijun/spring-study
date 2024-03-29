package com.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {
	
	private int id;
	
	private String name;
	
	private Set<String> sets;
	
	private List<String> list;
	
	private String [] strs;
	
	private Map<String,String> map;
	
	private Desk desk;
	
	public People() {
		super();
		System.out.println("执行无参构造方法");
	}
	
	public People(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("执行有参构造方法1");
	}
	
	public People(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("执行有参构造Integer");
	}

	public People(String name,int id) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("执行有参构造方法2");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getSets() {
		return sets;
	}

	public void setSets(Set<String> sets) {
		this.sets = sets;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String[] getStrs() {
		return strs;
	}

	public void setStrs(String[] strs) {
		this.strs = strs;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Desk getDesk() {
		return desk;
	}

	public void setDesk(Desk desk) {
		this.desk = desk;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", sets=" + sets + ", list=" + list + ", strs="
				+ Arrays.toString(strs) + ", map=" + map + ", desk=" + desk + "]";
	}
	
}
