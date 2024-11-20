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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author isaor
 */
@Entity
@Table(name = "dado_paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DadoPaciente.updateMultpleFields", query = "UPDATE DadoPaciente d SET d.cartaoPaciente = :cartaoPaciente,d.nome = :nome, d.email = :email ,d.telefone = :telefone,"
            + "d.logradouro = :logradouro, d.nro = :nro, d.cidade = :cidade, d.data_nascimento = :data_nascimento WHERE d.cartaoPaciente = :cartaoPaciente"),
    @NamedQuery(name = "DadoPaciente.findAll", query = "SELECT d FROM DadoPaciente d"),
    @NamedQuery(name = "DadoPaciente.findByCartaoPaciente", query = "SELECT d FROM DadoPaciente d WHERE d.cartaoPaciente = :cartaoPaciente"),
    @NamedQuery(name = "DadoPaciente.findByNome", query = "SELECT d FROM DadoPaciente d WHERE d.nome = :nome"),
    @NamedQuery(name = "DadoPaciente.findByLogradouro", query = "SELECT d FROM DadoPaciente d WHERE d.logradouro = :logradouro"),
    @NamedQuery(name = "DadoPaciente.findByCidade", query = "SELECT d FROM DadoPaciente d WHERE d.cidade = :cidade"),
    @NamedQuery(name = "DadoPaciente.findByNro", query = "SELECT d FROM DadoPaciente d WHERE d.nro = :nro"),
    @NamedQuery(name = "DadoPaciente.findByEmail", query = "SELECT d FROM DadoPaciente d WHERE d.email = :email")})
public class DadoPaciente implements Serializable {

    @OneToMany(mappedBy = "cartaoPaciente")
    private Collection<AgendamentoPaciente> agendamentoPacienteCollection;


    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cartao_paciente")
    private Integer cartaoPaciente;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "nro")
    private Integer nro;
    @Column(name = "email")
    private String email;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "data_nascimento")
    private Date data_nascimento;
    

    
    public DadoPaciente(Integer cartaoPaciente, String nome, String logradouro, String cidade, Integer nro, String email, String telefone, String data_nascimento) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.cartaoPaciente = cartaoPaciente;
        this.nome = nome;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.nro = nro;
        this.email = email;
        this.telefone = telefone;
        this.data_nascimento = sdf.parse(data_nascimento);
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public DadoPaciente() {
    }

    public DadoPaciente(Integer cartaoPaciente) {
        this.cartaoPaciente = cartaoPaciente;
    }

    public DadoPaciente(Integer cartaoPaciente, String nome) {
        this.cartaoPaciente = cartaoPaciente;
        this.nome = nome;
    }

    public Integer getCartaoPaciente() {
        return cartaoPaciente;
    }

    public void setCartaoPaciente(Integer cartaoPaciente) {
        this.cartaoPaciente = cartaoPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cartaoPaciente != null ? cartaoPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DadoPaciente)) {
            return false;
        }
        DadoPaciente other = (DadoPaciente) object;
        if ((this.cartaoPaciente == null && other.cartaoPaciente != null) || (this.cartaoPaciente != null && !this.cartaoPaciente.equals(other.cartaoPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DadoPaciente[ cartaoPaciente=" + cartaoPaciente + " ]";
    }

    @XmlTransient
    public Collection<AgendamentoPaciente> getAgendamentoPacienteCollection() {
        return agendamentoPacienteCollection;
    }

    public void setAgendamentoPacienteCollection(Collection<AgendamentoPaciente> agendamentoPacienteCollection) {
        this.agendamentoPacienteCollection = agendamentoPacienteCollection;
    }

}
