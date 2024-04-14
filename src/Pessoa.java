import java.util.Date;

public class Pessoa {
    protected String nome;
    protected Date dataNascimento;
    protected char sexo;
    protected int cpf;
    protected int idSistema;
    protected String senhaSistema;

    public Pessoa(String nome, Date data, char sexo, int cpf, int id, String senha) {
        this.nome = nome;
        this.dataNascimento = data;
        this.sexo = sexo;
        this.cpf = cpf;
        this.idSistema = id;
        this.senhaSistema = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(int idSistema) {
        this.idSistema = idSistema;
    }

    public String getSenhaSistema() {
        return senhaSistema;
    }

    public void setSenhaSistema(String senhaSistema) {
        this.senhaSistema = senhaSistema;
    }
}
