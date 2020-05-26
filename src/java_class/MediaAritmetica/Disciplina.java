package java_class.MediaAritmetica;

public class Disciplina {

    private float nota1;
    private float nota2;
    private float note3;

    public void obterMedia(){
        float media = (nota1 + nota2 + note3)/3;

    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNote3() {
        return note3;
    }

    public void setNote3(float note3) {
        this.note3 = note3;
    }
}
