package data;

public class Data {
    private int mes, dia, ano;

    public Data(int mes, int dia, int ano){
        this.mes = mes;
        this.ano = ano;
        this.dia = dia;
    }

    public int getMes(){
        return this.mes;
    }

    public void setMes(int mes){
        this.mes = mes < 12 ? mes : 12;
    }

    public int getDia(){
        return this.dia;
    }

    public void setDia(int dia){
        this.dia = dia < 31 ? dia : 31;
        if (mes == 2 && dia >= 30){
            dia = 28;
        }
    }
    
    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void displayData(){
        if (dia < 10) {
            System.out.print("0" + dia);
        }else{
            System.out.print(dia);
        }
        System.out.print("/");
        if (mes < 10) {
            System.out.print("0" + mes);
        }else{
            System.out.print(mes);
        }
        System.out.print("/");
        System.out.print(ano);
    }
}