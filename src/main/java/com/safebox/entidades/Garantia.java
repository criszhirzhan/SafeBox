package com.safebox.entidades;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Garantia  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @ManyToOne
    @JoinColumn
    private Credito credito;


    public Garantia() {

    }

    public Garantia(int codigo, Credito credito) {
        this.codigo = codigo;
        this.credito = credito;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }


/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Garantia)) return false;
        Garantia garantia = (Garantia) o;
        return codigo == garantia.codigo &&
                credito.equals(garantia.credito);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, credito);
    }*/
}
