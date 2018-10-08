package com.prueba.desarrollo.gaia.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SABOR")
public class Sabor {

    private Long idSabor;
    private String nombre;
    private TipoHelado tipoHelado;

    @Id
    @Column(name = "IDSABOR")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getIdSabor() {
        return idSabor;
    }

    @Column(name = "NOMBRE", nullable = false, length = 255)
    public String getNombre() {
        return nombre;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "sabor", cascade = CascadeType.PERSIST)
    public TipoHelado getTipoHelado() {
        return tipoHelado;
    }

    public void setIdSabor(Long idSabor) {
        this.idSabor = idSabor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoHelado(TipoHelado tipoHelado) {
        this.tipoHelado = tipoHelado;
    }

}
