package model;

import javax.swing.*;

public class Empresa {

    private String nome;
    private String cidade;
    private String endereco;
    private String estado;
    private int cep;
    private int fone;

    public Empresa() {
        this("", "", "", "", 0, 0);
    }

    public Empresa(String nome, String cidade, String endereco, String estado, int cep, int fone) {
        setNome(nome);
        setCidade(cidade);
        setEndereco(endereco);
        setEstado(estado);
        setCep(cep);
        setFone(fone);
    }

    //nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //cidade
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    //endereço
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //CEP
    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = (cep);
    }
    
    //CEP
    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = (fone);
    }
    

    public void leitura() {
        setNome(JOptionPane.showInputDialog("Digite o nome"));
        setCidade(JOptionPane.showInputDialog("Digite a cidade"));
        setEndereco(JOptionPane.showInputDialog("Digite o endereco"));
        setEstado(JOptionPane.showInputDialog("Digite o estado"));
        setCep(Integer.parseInt(JOptionPane.showInputDialog("Digite o cep")));
        setFone(Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone")));

        System.out.println("Os dados são:\n" + nome
                + "\n" + cidade + "\n" + endereco + "\n" + estado + "\n" + cep + "\n" + fone);
    }
    

}
