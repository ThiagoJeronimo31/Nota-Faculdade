package notatri;
public class CalcNota {

public String nome;
public double nota1;
public double nota2;
public double nota3;

public double soma(){
    return nota1+ nota2+ nota3;
}
public double media(){
    if(soma() < 60.0){
    return 60.0 - soma();    
    }
    else{
       return 0.0;
    }    
}    

}
