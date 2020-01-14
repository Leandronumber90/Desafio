package br.com.digitalhouse.desafio1;

import java.util.Date;

public class Matricula {
    private String aluno;
    private String curso;
    private Date dataDoDia;

    public Matricula(String aluno,String curso,Date dataDoDia){
        this.aluno = aluno;
        this.curso = curso;
        this.dataDoDia = new Date();
    }
}
