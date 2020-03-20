package com.example.todolist.model;


import com.google.common.base.MoreObjects;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Table(name = "task")
@Entity
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true, length = 50)
    private String nome;

    private String descrizione;

    private Date data;

    private boolean done;

    @ManyToOne
    private TaskList list;

    public Task() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("nome", nome)
                .add("descrizione", descrizione)
                .add("data", data)
                .add("done", done)
                .add("list", list)
                .toString();
    }
}
