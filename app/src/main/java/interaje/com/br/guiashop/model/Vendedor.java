package interaje.com.br.guiashop.model;

import java.security.Timestamp;
import java.util.Timer;

/**
 * Created by Bruno on 20/11/2015.
 */
public class Vendedor {

    private Long id;
    private Timestamp dataHoraCadastro ;
    private String email;
    private String senha;
    private String cpf;
    private String nome;
    private String telefone;


    public Timestamp getDataHoraCadastro() {return dataHoraCadastro;}

    public void setDataHoraCadastro(Timestamp dataHoraCadastro) {this.dataHoraCadastro = dataHoraCadastro; }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getSenha() {return senha;}

    public void setSenha(String senha) {this.senha = senha;}

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}

}



