package com.restaurante.almoco;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurante {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    private String nome;
	    private double fibra;
	    private double proteina;
	    private double carboidrato;
	    private double gordura;
	    private String sobremesa;
	    private String bebida;

	    // Getters e Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public double getFibra() {
	        return fibra;
	    }

	    public void setFibra(double fibra) {
	        this.fibra = fibra;
	    }

	    public double getProteina() {
	        return proteina;
	    }

	    public void setProteina(double proteina) {
	        this.proteina = proteina;
	    }

	    public double getCarboidrato() {
	        return carboidrato;
	    }

	    public void setCarboidrato(double carboidrato) {
	        this.carboidrato = carboidrato;
	    }

	    public double getGordura() {
	        return gordura;
	    }

	    public void setGordura(double gordura) {
	        this.gordura = gordura;
	    }

	    public String getSobremesa() {
	        return sobremesa;
	    }

	    public void setSobremesa(String sobremesa) {
	        this.sobremesa = sobremesa;
	    }

	    public String getBebida() {
	        return bebida;
	    }

	    public void setBebida(String bebida) {
	        this.bebida = bebida;
	    }
	}

