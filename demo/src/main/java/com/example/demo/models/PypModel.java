package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "picoPlaca")
public class PypModel {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long id;
    private Integer digito;
    private String tipoVehiculo;
    private String fecha;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getDigito() {
        return digito;
    }
    public void setDigito(Integer digito) {
        this.digito = digito;
    }
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
