package com.examples.one.table.perclass.hierarchy;

import javax.persistence.*;

@Entity(name="employee101")
@Table(name="employee101")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="employmentType", discriminatorType=DiscriminatorType.STRING)
//@DiscriminatorValue("")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

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

}