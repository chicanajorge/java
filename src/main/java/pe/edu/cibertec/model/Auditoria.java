package pe.edu.cibertec.model;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "auditoria")
public class Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAuditoria;
    @Column(name = "fecha")
    @Temporal(javax.persistence.TemporalType.DATE)   // PARA GUARDAR FECHA
    // @Temporal(javax.persistence.TemporalType.TIMESTAMP)   // PARA GUARDAR FECHA Y HORA
    private Date fecha;
    private String informe;

    public Auditoria() {
    }

    public Auditoria(Integer idAuditoria, Date fecha, String informe) {
        this.idAuditoria = idAuditoria;
        this.fecha = fecha;
        this.informe = informe;
    }

    public Integer getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(Integer idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    @Override
    public String toString() {
        return "Auditoria{" + "idAuditoria=" + idAuditoria + ", fecha=" + fecha + ", informe=" + informe + '}';
    }
}
