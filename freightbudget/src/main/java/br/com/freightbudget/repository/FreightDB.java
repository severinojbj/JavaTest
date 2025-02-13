package br.com.freightbudget.repository;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.freightbudget.basic.Freight;

@Entity
@Table(name = "fretes")
public class FreightDB {

	@Id
    @GeneratedValue
	private long id;
	@Column(name = "peso")
	private double pound;
	@Column(name = "cep_origem")
	private String postalCodeOrigin;
	@Column(name = "cep_destino")
	private String postalCodeDestin;
	@Column(name = "nome_destinatario")
	private String name;
	@Column(name = "valor_total_frete")
	private double price;
	@Column(name = "data_prevista_entrega")
	private String estimatedDate;
	@Column(name = "data_consulta", columnDefinition = "datetime")
	private Date timestamp;

	public FreightDB(Freight freight) {
		this.pound = freight.getPound();
		this.postalCodeOrigin = freight.getPostalCodeOrigin();
		this.postalCodeDestin = freight.getPostalCodeDestin();
		this.name = freight.getName();
		this.price = freight.getPrice();
		this.estimatedDate = freight.getDelliveryEstimated();
		this.timestamp = freight.getTimestamp();
	}

}
