package app.domain.model;

import java.util.Date;

public class SeguroMedico {
    private String nombreCompaniaSeguros;
    private long numeroPoliza;
    private boolean estadoPoliza;
    private Date vigenciaPoliza;

    public String getNombreCompaniaSeguros() {
        return nombreCompaniaSeguros;
    }

    public void setNombreCompaniaSeguros(String nombreCompaniaSeguros) {
        this.nombreCompaniaSeguros = nombreCompaniaSeguros;
    }

    public long getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(long numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public boolean isEstadoPoliza() {
        return estadoPoliza;
    }

    public void setEstadoPoliza(boolean estadoPoliza) {
        this.estadoPoliza = estadoPoliza;
    }

    public Date getVigenciaPoliza() {
        return vigenciaPoliza;
    }

    public void setVigenciaPoliza(Date vigenciaPoliza) {
        this.vigenciaPoliza = vigenciaPoliza;
    }
    
    
}
