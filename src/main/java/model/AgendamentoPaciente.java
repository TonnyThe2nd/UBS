package model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "agendamento_paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgendamentoPaciente.updateMultpleFields", query = "UPDATE AgendamentoPaciente a "
            + "SET dataAgendamento = :dataAgendamento, a.medico = :medico, a.motivo = :motivo, a.urgencia = :urgencia, a.logradouro = :logradouro, "
            + "a.nro = :nro, a.cidade = :cidade, a.telefone = :telefone, a.nomePaciente = :nomePaciente, a.cartaoPaciente = :cartaoPaciente "
            + "WHERE a.cartaoPaciente = :cartaoPaciente"),
    @NamedQuery(name = "AgendamentoPaciente.findByCartaoPaciente",query="SELECT a FROM AgendamentoPaciente a WHERE a.cartaoPaciente = :cartaoPaciente"),
    @NamedQuery(name = "AgendamentoPaciente.findAll", query = "SELECT a FROM AgendamentoPaciente a"),
    @NamedQuery(name = "AgendamentoPaciente.findByIdAgendamento", query = "SELECT a FROM AgendamentoPaciente a WHERE a.idAgendamento = :idAgendamento"),
    @NamedQuery(name = "AgendamentoPaciente.findByDataAgendamento", query = "SELECT a FROM AgendamentoPaciente a WHERE a.dataAgendamento = :dataAgendamento"),
    @NamedQuery(name = "AgendamentoPaciente.findByMedico", query = "SELECT a FROM AgendamentoPaciente a WHERE a.medico = :medico"),
    @NamedQuery(name = "AgendamentoPaciente.findByMotivo", query = "SELECT a FROM AgendamentoPaciente a WHERE a.motivo = :motivo"),
    @NamedQuery(name = "AgendamentoPaciente.findByUrgencia", query = "SELECT a FROM AgendamentoPaciente a WHERE a.urgencia = :urgencia"),
    @NamedQuery(name = "AgendamentoPaciente.findByLogradouro", query = "SELECT a FROM AgendamentoPaciente a WHERE a.logradouro = :logradouro"),
    @NamedQuery(name = "AgendamentoPaciente.findByNro", query = "SELECT a FROM AgendamentoPaciente a WHERE a.nro = :nro"),
    @NamedQuery(name = "AgendamentoPaciente.findByCidade", query = "SELECT a FROM AgendamentoPaciente a WHERE a.cidade = :cidade"),
    @NamedQuery(name = "AgendamentoPaciente.findByNomePaciente", query = "SELECT a FROM AgendamentoPaciente a WHERE a.nomePaciente = :nomePaciente")})
public class AgendamentoPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_agendamento")
    private Integer idAgendamento;
    @Column(name = "data_agendamento")
    @Temporal(TemporalType.DATE)
    private Date dataAgendamento;
    @Column(name = "medico")
    private String medico;
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "motivo")
    private String motivo;
    @Column(name = "urgencia")
    private String urgencia;
    @Column(name = "logradouro")
    private String logradouro;
    @Column(name = "nro")
    private Integer nro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "nome_paciente")
    private String nomePaciente;
    @JoinColumn(name = "cartao_paciente", referencedColumnName = "cartao_paciente")
    @ManyToOne
    private DadoPaciente cartaoPaciente;

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public AgendamentoPaciente(String dataAgendamento, String medico, String motivo, String urgencia, String logradouro, Integer nro, String cidade, DadoPaciente cartaoPaciente, String telefone) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dataAgendamento = sdf.parse(dataAgendamento);
        this.medico = medico;
        this.motivo = motivo;
        this.urgencia = urgencia;
        this.logradouro = logradouro;
        this.nro = nro;
        this.cidade = cidade;
        this.nomePaciente = cartaoPaciente.getNome();
        this.cartaoPaciente = cartaoPaciente;
        this.telefone = telefone;
    }

    public AgendamentoPaciente() {
    }

    public AgendamentoPaciente(Integer idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public Integer getIdAgendamento() {
        return idAgendamento;
    }

    public void setIdAgendamento(Integer idAgendamento) {
        this.idAgendamento = idAgendamento;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
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

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public DadoPaciente getCartaoPaciente() {
        return cartaoPaciente;
    }

    public void setCartaoPaciente(DadoPaciente cartaoPaciente) {
        this.cartaoPaciente = cartaoPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAgendamento != null ? idAgendamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgendamentoPaciente)) {
            return false;
        }
        AgendamentoPaciente other = (AgendamentoPaciente) object;
        if ((this.idAgendamento == null && other.idAgendamento != null) || (this.idAgendamento != null && !this.idAgendamento.equals(other.idAgendamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.AgendamentoPaciente[ idAgendamento=" + idAgendamento + " ]";
    }
    
}
