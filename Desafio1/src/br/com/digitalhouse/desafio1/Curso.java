package br.com.digitalhouse.desafio1;

import br.com.digitalhouse.Professor_Titular;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    public static void main(String[] args) {

    }

        private String nome;
        private Integer codigoCurso;
        private Professor_Adjunto nomeProfessorAd;
        private Professor_Titular nomeProfessorTi;
        private int quantidadeMaximaDeAluno;
        List<String> AlunosMatriculados = new ArrayList<>();


    public String getNome() {
        return nome;
    }
    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public Professor_Adjunto getNomeProfessorAd() {
        return nomeProfessorAd;
    }

    public Professor_Titular getNomeProfessorTi() {
        return nomeProfessorTi;
    }

    public int getQuantidadeMaximaDeAluno() {
        return quantidadeMaximaDeAluno;
    }

    public List<String> getAlunosMatriculados() {
        return AlunosMatriculados;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void setNomeProfessorAd(Professor_Adjunto nomeProfessorAd) {
        this.nomeProfessorAd = nomeProfessorAd;
    }

    public void setNomeProfessorTi(Professor_Titular nomeProfessorTi) {
        this.nomeProfessorTi = nomeProfessorTi;
    }

    public void setQuantidadeMaximaDeAluno(int quantidadeMaximaDeAluno) {
        this.quantidadeMaximaDeAluno = quantidadeMaximaDeAluno;
    }

    public void setAlunosMatriculados(List<String> alunosMatriculados) {
        AlunosMatriculados = alunosMatriculados;

    }

}
