package tdd;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Relogio {
    private int horas;
    private int minutos;
  	private int segundos;

    //Programado Horas, minutos, segundos;
    public void programarHorario(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    //Metodo De reiniciar meia noite
    public void reiniciarMeiaNoite() {
        horas = 0;
        minutos = 0;
        segundos = 0;
    }

    
    //CRONOMETRO OLHADO NA INTERNET
    public void iniciarCronometro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pressione Enter para iniciar o cronômetro...");
        sc.nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("Pressione Enter para parar o cronômetro...");
        sc.nextLine();

        long endTime = System.currentTimeMillis();

        long tempoDecorrido = endTime - startTime;

        int tempoSegundos = (int) (tempoDecorrido / 1000);
        int tempoMinutos = tempoSegundos / 60;
        tempoSegundos = tempoSegundos % 60;

        int tempoHoras = tempoMinutos / 60;
        tempoMinutos = tempoMinutos % 60;

        System.out.println("Tempo decorrido: " + tempoHoras + "h " + tempoMinutos + "min " + tempoSegundos + "s");
    }

    
    //Imprimindo hora, minuto, segundo com Classe importarda do Eclipse
    public void imprimirHora(boolean formato24h) {
        SimpleDateFormat DataSimplesEclipse;
        if (formato24h) {
        	DataSimplesEclipse = new SimpleDateFormat("HH:mm:ss");
        } else {
        	DataSimplesEclipse = new SimpleDateFormat("hh:mm:ss a");
        }

        Date dataAtual = new Date();
        String horaFormatada = DataSimplesEclipse.format(dataAtual);
        System.out.println("Hora atual: " + horaFormatada);
    }
    
    
    public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

    
//main do programa 
    public static void main(String[] args) {
        Relogio relogio = new Relogio();

        relogio.programarHorario(15, 30, 0);
        relogio.imprimirHora(true);

        relogio.reiniciarMeiaNoite();
        relogio.imprimirHora(true);

        relogio.iniciarCronometro();

        relogio.imprimirHora(false);
    }
}
