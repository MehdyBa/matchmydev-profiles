package co.simplon.matchmydev.profiles.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contract_types")
public class ContractType extends AbstractEntity {

	@Column(name = "name")
	private String name;

	public ContractType() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ContractType [name=" + name + "]";
	}

}
