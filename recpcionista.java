import java.util.List;

public class recpcionista extends funcionarios{
    protected float id_recepcionista;
    protected String turno;

    public recpcionista(String matricula, String CPF, String nome, String dataNascimento,
			String agencia, String numeroConta, int experiencia, String email, 
			List<String> telefones, float id_recepcionista, String turno) {
            super(matricula, CPF, nome, dataNascimento, agencia, numeroConta, experiencia, email, telefones);

            this.id_recepcionista=id_recepcionista;
            this.turno=turno;	
        
    }
    public Float getId_recepcionista(){
        return id_recepcionista;
    }
    public String getTurno(){
        return turno;
    }
    public void setId_recepcionista(Float id_recepcionista){
        this.id_recepcionista=id_recepcionista;
    }
    public void setTurno(String turno){
        this.turno=turno;
    }

    public void cadastrarAluno(String nome, String cpf, float matricula, float peso, String email, float telefone, String graduação, float dataNascimento) {
        Aluno aluno = new Aluno(nome, cpf, matricula, peso, email, telefone, graduação, dataNascimento);
        Alunos.adicionar(aluno);
    }


    }
