package br.com.jkcontrol.model;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitante {
	
// (PK)id_vistante, nm_visitante, dt_nasc, nr_cpf, nr_rg, nm_digito_rg, dt_cadastro


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVisitante;

	private String nome = "Nome";
	private LocalDate dataNascimento = LocalDate.of(22, 02, 01);
	private String cpf = "123.456.789-10";
	private String rg = "98.654.321";
	private String digitoRg = "9";
	private LocalDateTime dataCadastro = LocalDateTime.now();
	private String imagePath;
	
	
	
	public Long getIdVisitante() {
		return idVisitante;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDigitoRg() {
		return digitoRg;
	}

	public void setDigitoRg(String digitoRg) {
		this.digitoRg = digitoRg;
	}
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDateTime dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	@Override
	public String toString() {
		return "Visitante [nome=" + nome + ", Nascimento=" + dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yy")) + ", cpf=" + cpf + ", rg="+ rg+", digito rg=" +digitoRg+", Cadastro"+ dataCadastro.format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss")) +"]";
	}

}

