package com.examples.table.per.concreteclass;

import javax.persistence.*;

@Entity(name="emp102")
@Table(name="employee102")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

@javax.persistence.TableGenerator(
name="PER_GEN",
table="GENERATOR_TABLE",
pkColumnName = "coln",
valueColumnName = "hivalue",
pkColumnValue="PER",
allocationSize=1
)
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator="PER_GEN")
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