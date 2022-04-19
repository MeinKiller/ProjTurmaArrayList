package projturmaarraylist;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private String turno;
    private ArrayList<Aluno> ListaDeAlunos;

    public Turma() {
        this.ListaDeAlunos=new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getListaDeAlunos() {
        return ListaDeAlunos;
    }

    public void setListaDeAlunos(ArrayList<Aluno> ListaDeAlunos) {
        this.ListaDeAlunos = ListaDeAlunos;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"
                + "Turno: " + turno + "\n"
                + "Lista de alunos: " + ListaDeAlunos;
    }
    
    
    
}
