/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

/**
 *
 * @author isaor
 */
@Entity
@Table(name = "dado_funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DadoFuncionario.findByEmailAndSenha", query = "SELECT d from DadoFuncionario d WHERE d.email = :email AND d.senha = :senha"),
    @NamedQuery(name = "DadoFuncionario.updateMultipleFields", query = "UPDATE DadoFuncionario d SET d.cpf = :cpf, d.nome = :nome, d.telefone = :telefone,"
            + " d.email = :email, d.logradouro = :logradouro, d.nro = :nro, d.cidade = :cidade, d.dataNascimento = :dataNascimento, d.funcao = :funcao WHERE d.cpf = :cpf"),
    @NamedQuery(name = "DadoFuncionario.findAll", query = "SELECT d FROM DadoFuncionario d"),
    @NamedQuery(name = "DadoFuncionario.findByCpf", query = "SELECT d FROM DadoFuncionario d WHERE d.cpf = :cpf"),
    @NamedQuery(name = "DadoFuncionario.findByNome", query = "SELECT d FROM DadoFuncionario d WHERE d.nome = :nome"),
    @NamedQuery(name = "DadoFuncionario.findByEmail", query = "SELECT d FROM DadoFuncionario d WHERE d.email = :email"),
    @NamedQuery(name = "DadoFuncionario.findBySenha", query = "SELECT d FROM DadoFuncionario d WHERE d.senha = :senha"),
    @NamedQuery(name = "DadoFuncionario.findByLogradouro", query = "SELECT d FROM DadoFuncionario d WHERE d.logradouro = :logradouro"),
    @NamedQuery(name = "DadoFuncionario.findByNro", query = "SELECT d FROM DadoFuncionario d WHERE d.nro = :nro"),
    @NamedQuery(name = "DadoFuncionario.findByCidade", query = "SELECT d FROM DadoFuncionario d WHERE d.cidade = :cidade"),
    @NamedQuery(name = "DadoFuncionario.findByDataNascimento", query = "SELECT d FROM DadoFuncionario d WHERE d.dataNascimento = :dataNascimento")})
public class DadoFuncionario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "nro")
    private Integer nro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "funcao")
    private String funcao;
    @Column(name = "telefone")
    private String telefone;
    public DadoFuncionario() {
    }

    public DadoFuncionario(String cpf, String nome, String email, String logradouro, Integer nro, String cidade, String dataNascimento, String funcao, String telefone) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.logradouro = logradouro;
        this.nro = nro;
        this.cidade = cidade;
        this.dataNascimento = sdf.parse(dataNascimento);
        this.funcao = funcao;
        this.telefone = telefone;
    }

    public DadoFuncionario(String cpf, String nome, String email, String senha, String logradouro,
            Integer nro, String cidade, String dataNascimento, String funcao, String telefone) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.logradouro = logradouro;
        this.nro = nro;
        this.cidade = cidade;
        this.dataNascimento = sdf.parse(dataNascimento);
        this.funcao = funcao;
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public DadoFuncionario(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DadoFuncionario)) {
            return false;
        }
        DadoFuncionario other = (DadoFuncionario) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DadoFuncionario[ cpf=" + cpf + " ]";
    }
    
}
