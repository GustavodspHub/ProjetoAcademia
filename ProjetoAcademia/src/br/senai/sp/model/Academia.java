package br.senai.sp.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.logging.Level;

import br.senai.NivelAtividade;

public class Academia {
	
	private String sexo;
	private double peso;
	private double altura;
	private String nivelAtividade;
	private String nome;
	private int idade;
	private LocalDate dataNascimento;
	private double imc;
	private String classificacao;
	private double ncd;
	
	public void setSexo (String sexo) {
		this.sexo = sexo;
	}
	public String getSexo () {
		return this.sexo;
	}
	public void setPeso (double peso) {
		this.peso = peso;
	}
	public double getPeso () {
		return this.peso;
	}
	public void setAltura (double altura) {
		this.altura = altura;
	}
	public double getAltura () {
		return this.altura;
	}
	public void setNivelAtividade (String nivelAtividade) {
		this.nivelAtividade = nivelAtividade;
	}
	public String getNivelAtividade () {
		return this.nivelAtividade;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome () {
		return this.nome;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}
	public int getIdade () {
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(this.dataNascimento, hoje);
		
		return periodo.getYears();
	}
	public void setDataNascimento (LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDate getDataNascimento () {
		return this.dataNascimento;
	}
	public double getImc () {
		return this.peso / (this.altura * this.altura);
	}
	public void setClassificacao (String classificacao) {
		this.classificacao = classificacao;
	}
	
	public String getClassificacao() {
		if (this.getImc() < 18.5) {
			return "Abaixo do Peso";
		}else if (this.getImc() > 18.6 && this.getImc() < 24.9) {
			return "Peso Ideal (parab�ns)";
		}else if (this.getImc() > 25.0 && this.getImc() < 29.9) {
			return "Levemente acima do peso";
		}else if (this.getImc() > 30.0 && this.getImc() < 34.9) {
			return "Obesidade grau I";
		}else if (this.getImc() > 34.9 && this.getImc() < 39.9) {
			return "Obesidade grau II (Severa)";
		}else {
			return "Obesidade grau III (M�rbida)";		
		}	
	}
	public double getNcd() {
		
		if (sexo == "M") {
			if (this.getIdade() >= 18 && this.getIdade() <= 30 ) {
				ncd = 15.3 * this.peso + 679;
			}else if (this.getIdade() >= 31 && this.getIdade() <=60) {
				ncd = 11.6 * this.peso + 879;
			}else { 
				ncd = 13.5 * this.getPeso() + 487;
			}
			
			if (this.nivelAtividade == NivelAtividade.LEVE) {
				ncd *= 1.5;
			}else if (this.nivelAtividade == NivelAtividade.MODERADO) {
				ncd *= 1.8;
			}else if (this.nivelAtividade == NivelAtividade.INTENSO) {
				ncd *= 2.1;
			}return this.ncd;
		}
		return ncd;
	}
}
		
