package com.org.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
 private int cid;
 public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrivae() {
	return privae;
}
public void setPrivae(double privae) {
	this.privae = privae;
}
private String cname;
 private String color;
 private double privae;
 
}
