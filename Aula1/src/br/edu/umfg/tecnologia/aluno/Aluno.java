package br.edu.umfg.tecnologia.aluno;

public class Aluno {
    public String Nome;
    public  String Ra;

    private double notaProva;
    private  double notaTrabalho;

    public  double mediaFinal;

    public Aluno() {
    }

    public Aluno(String nome, String ra, double notaProva, double notaTrabalho) {
        Nome = nome;
        Ra = ra;
        this.notaProva = notaProva;
        this.notaTrabalho = notaTrabalho;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRa() {
        return Ra;
    }

    public void setRa(String ra) {
        Ra = ra;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(double notaProva) {
        this.notaProva = notaProva;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double media (double notaProva, double notaTrabalho){
      double mediaFinal;
      mediaFinal = ((notaProva*0.35) + (notaTrabalho*0.3));
      setMediaFinal(mediaFinal);
        return mediaFinal;
    }

    public String situacao(){
        if (this.mediaFinal >= 70){
            return "Aprovado";
        }else{
            return "Exame";
        }
    }

    public void RESULTADO(){

        System.out.println("Media : "+media(getNotaProva(),getNotaTrabalho())+ " Situação : "+ situacao());

    }
}
