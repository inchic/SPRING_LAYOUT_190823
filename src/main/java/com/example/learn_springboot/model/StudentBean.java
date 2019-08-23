package com.example.learn_springboot.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
//테이블 이름 바꿔
public class StudentBean implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	Long id;
	String name;
	String passport_number;


	public StudentBean() {
	}

	public StudentBean(Long id, String name, String passport_number) {
		this.id = id;
		this.name = name;
		this.passport_number = passport_number;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassport_number() {
		return this.passport_number;
	}

	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}

	public StudentBean id(Long id) {
		this.id = id;
		return this;
	}

	public StudentBean name(String name) {
		this.name = name;
		return this;
	}

	public StudentBean passport_number(String passport_number) {
		this.passport_number = passport_number;
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof StudentBean)) {
			return false;
		}
		StudentBean studentBean = (StudentBean) o;
		return Objects.equals(id, studentBean.id) && Objects.equals(name, studentBean.name) && Objects.equals(passport_number, studentBean.passport_number);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, passport_number);
	}

	@Override
	public String toString() {
		return "{" +
			" id='" + getId() + "'" +
			", name='" + getName() + "'" +
			", passport_number='" + getPassport_number() + "'" +
			"}";
	}
	

	
}