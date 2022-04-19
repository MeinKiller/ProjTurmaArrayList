package projturmaarraylist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Turma objTurma=new Turma();
        
        byte op;
        System.out.print("Digite o nome da turma: ");
        objTurma.setNome(leia.next());
        System.out.print("Digite o turno da turma: ");
        objTurma.setTurno(leia.next());
        Tela.limparTela();
        do{
            System.out.print(":::::::::::::::::::::SISTEMA ESCOLAR:::::::::::::::::::::::\n" +
                "::  1 - CADASTRAR ALUNO	                                 ::\n" +
                "::  2 - MOSTRAR TODOS OS ALUNOS                          ::\n" +
                "::  3 - MOSTRAR QUANTIDADE DE ALUNOS                     ::\n" +
                "::  4 - EXCLUIR TODOS OS ALUNOS                          ::\n" +
                "::  0 - SAIR                                             ::\n" +
                ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n" +
                "DIGITE A OPÇÃO:  ");
            op=leia.nextByte();
            Tela.limparTela();
            switch(op){
                case 1:
                    Aluno objAluno=new Aluno();
                    System.out.print("Nome: ");
                    objAluno.setNome(leia.next());
                    System.out.print("RA: ");
                    objAluno.setRa(leia.nextLong());
                    System.out.print("Escolha o sexo correspondente\n"
                            + "1 - Masculino\n"
                            + "2 - Feminino\n"
                            + "Digite aqui a opção desejada: ");
                    op=leia.nextByte();
                    switch(op){
                        case 1:
                            objAluno.setSexo("Masculino");
                            break;
                        case 2:
                            objAluno.setSexo("Feminino");
                            break;
                        default:
                            System.out.println("Opção inválida\n"
                                    + "Digite novamente: ");
                            
                    }
                    objTurma.getListaDeAlunos().add(objAluno);
                    break;
                case 2:
                    Tela.limparTela();
                    System.out.println("Todos os alunos: "+objTurma.getListaDeAlunos());
                    break;
                case 3:
                    Tela.limparTela();
                    System.out.println("A quantidade de alunos é: "+objTurma.getListaDeAlunos().size());
                    break;
                case 4:
                    Tela.limparTela();
                    objTurma.getListaDeAlunos().clear();
                    System.out.println("Alunos excluidos com sucesso");
                    break;
                case 0:
                    Tela.limparTela();
                    System.out.println("Sistema encerrado");
                    break;
                default:
                    Tela.limparTela();
                    System.out.println("Opção inválida\n"
                            + "Digite novamente: ");
            }
        }while(op!=0);    
    }
    
}
