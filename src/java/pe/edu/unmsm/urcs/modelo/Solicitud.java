package pe.edu.unmsm.urcs.modelo;
// Generated 29/06/2015 02:00:34 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Solicitud generated by hbm2java
 */
public class Solicitud  implements java.io.Serializable {


     private SolicitudId id;
     private Estado estado;
     private Informe informe;
     private Operario operario;
     private Servicio servicio;
     private Usuario usuario;
     private Date fechaEnviado;
     private Date fechaProceso;
     private Date fechaPendienteReasig;
     private Date fechaFinalizado;
     private String motivoReasignacion;
     private String solicitudcol;

    public Solicitud() {
    }

	
    public Solicitud(SolicitudId id, Estado estado, Informe informe, Operario operario, Servicio servicio, Usuario usuario, Date fechaEnviado) {
        this.id = id;
        this.estado = estado;
        this.informe = informe;
        this.operario = operario;
        this.servicio = servicio;
        this.usuario = usuario;
        this.fechaEnviado = fechaEnviado;
    }
    public Solicitud(SolicitudId id, Estado estado, Informe informe, Operario operario, Servicio servicio, Usuario usuario, Date fechaEnviado, Date fechaProceso, Date fechaPendienteReasig, Date fechaFinalizado, String motivoReasignacion, String solicitudcol) {
       this.id = id;
       this.estado = estado;
       this.informe = informe;
       this.operario = operario;
       this.servicio = servicio;
       this.usuario = usuario;
       this.fechaEnviado = fechaEnviado;
       this.fechaProceso = fechaProceso;
       this.fechaPendienteReasig = fechaPendienteReasig;
       this.fechaFinalizado = fechaFinalizado;
       this.motivoReasignacion = motivoReasignacion;
       this.solicitudcol = solicitudcol;
    }
   
    public SolicitudId getId() {
        return this.id;
    }
    
    public void setId(SolicitudId id) {
        this.id = id;
    }
    public Estado getEstado() {
        return this.estado;
    }
    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public Informe getInforme() {
        return this.informe;
    }
    
    public void setInforme(Informe informe) {
        this.informe = informe;
    }
    public Operario getOperario() {
        return this.operario;
    }
    
    public void setOperario(Operario operario) {
        this.operario = operario;
    }
    public Servicio getServicio() {
        return this.servicio;
    }
    
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFechaEnviado() {
        return this.fechaEnviado;
    }
    
    public void setFechaEnviado(Date fechaEnviado) {
        this.fechaEnviado = fechaEnviado;
    }
    public Date getFechaProceso() {
        return this.fechaProceso;
    }
    
    public void setFechaProceso(Date fechaProceso) {
        this.fechaProceso = fechaProceso;
    }
    public Date getFechaPendienteReasig() {
        return this.fechaPendienteReasig;
    }
    
    public void setFechaPendienteReasig(Date fechaPendienteReasig) {
        this.fechaPendienteReasig = fechaPendienteReasig;
    }
    public Date getFechaFinalizado() {
        return this.fechaFinalizado;
    }
    
    public void setFechaFinalizado(Date fechaFinalizado) {
        this.fechaFinalizado = fechaFinalizado;
    }
    public String getMotivoReasignacion() {
        return this.motivoReasignacion;
    }
    
    public void setMotivoReasignacion(String motivoReasignacion) {
        this.motivoReasignacion = motivoReasignacion;
    }
    public String getSolicitudcol() {
        return this.solicitudcol;
    }
    
    public void setSolicitudcol(String solicitudcol) {
        this.solicitudcol = solicitudcol;
    }




}


