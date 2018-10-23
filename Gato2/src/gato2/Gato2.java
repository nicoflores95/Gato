/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Gato2 extends JFrame implements ActionListener{

    JButton iniciar;
    JButton tablero[][];
    String jugador1, jugador2;
    int turno = -1;
    JLabel mensaje;
    Color colorB;

    public Gato2()
    {
        this.setLayout(null);
        mensaje = new JLabel("BIENVENIDO AL JUEGO");
        mensaje.setBounds(140,40,200,30);
        this.add(mensaje);
        iniciar = new JButton("Iniciar juego");
        iniciar.setBounds(130, 350, 150, 30);
        iniciar.addActionListener(this);
        this.add(iniciar);
        tablero = new JButton [3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                tablero[i][j] = new JButton();
                tablero[i][j].setBounds((i+1)*80, (j+1)*80, 80, 80);
                this.add(tablero[i][j]);
                tablero[i][j].addActionListener(this);
            }
        }
        colorB = tablero[0][0].getBackground();

    }

    public static void main(String[] args) {
        // TODO code application logic here

        Gato2 ventana = new Gato2();
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(450, 550);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setTitle("Juego del Gato");
        ventana.setVisible(true);

        for (int i = 0; i < 10; i++) {
            System.out.println(ventana);
        }
        for (string i = 0; i < 10; i++) {

        }

        String sss;
        System.out.println(sss);
        
        boolean verdad, falso, mentira, hola;
        
        verdad = isNumeric("9457318");
    }

 @Override
public void actionPerformed(ActionEvent e) {

        if (e.getSource()== iniciar) {
            turno = 0;
            JOptionPane.showMessageDialog(this, "Iniciando el juego");
            jugador1 = JOptionPane.showInputDialog(this,"Escribe el nombre del jugador 1");
            jugador2 = JOptionPane.showInputDialog(this,"Escribe el nombre del jugador 2");

            mensaje.setText("Turno del Jugador "+ jugador1);

            limpiar();
        }
        else
        {
            JButton boton = (JButton) e.getSource();
            if(turno == 0){
                if(boton.getText().equals(""))
                {
                boton.setBackground(Color.cyan);
                boton.setText("X");
                boton.setEnabled(false);
                turno = 1;
                mensaje.setText("Turno del Jugador " + jugador2);
                }
            }else{
                if(turno == 1){
                if(boton.getText().equals(""))
                {
                boton.setBackground(Color.white);
                boton.setText("O");
                boton.setEnabled(false);
                turno = 0;
                mensaje.setText("Turno del Jugador " + jugador1);
                }
              }
            }
           verificar();
        }

    }

    public void verificar()
    {
        int ganador = 0;

        for (int i = 0; i < 3; i++) {
            if(tablero[0][i].getText().equals("X") && tablero[1][i].getText().equals("X")
                    && tablero[2][i].getText().equals("X")){
                ganador = 1;
            }
            if(tablero[i][0].getText().equals("X") && tablero[i][1].getText().equals("X")
                    && tablero[i][2].getText().equals("X")){
                ganador = 1;
            }

        }
        if(tablero[0][0].getText().equals("X") && tablero[1][1].getText().equals("X")
                    && tablero[2][2].getText().equals("X")){
                ganador = 1;
            }
        if(tablero[0][2].getText().equals("X") && tablero[1][1].getText().equals("X")
                    && tablero[2][0].getText().equals("X")){
                ganador = 1;
            }

        for (int i = 0; i < 3; i++) {
            if(tablero[0][i].getText().equals("O") && tablero[1][i].getText().equals("O")
                    && tablero[2][i].getText().equals("O")){
                ganador = 2;
            }
            if(tablero[i][0].getText().equals("O") && tablero[i][1].getText().equals("O")
                    && tablero[i][2].getText().equals("O")){
                ganador = 2;
            }

        }
        if(tablero[0][0].getText().equals("O") && tablero[1][1].getText().equals("O")
                    && tablero[2][2].getText().equals("O")){
                ganador = 2;
            }
        if(tablero[0][2].getText().equals("O") && tablero[1][1].getText().equals("O")
                    && tablero[2][0].getText().equals("O")){
                ganador = 2;
            }

        if(ganador == 1){
                JOptionPane.showMessageDialog(this, "Felicidades Jugador " + jugador1+ " Ganastes!!!");
            }
        if(ganador ==2){
                JOptionPane.showMessageDialog(this, "Felicidades Jugador " + jugador2+ " Ganastes!!!");
            }

    }

    public void limpiar(){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j].setEnabled(true);
                tablero[i][j].setText("");
                tablero[i][j].setBackground(colorB);
            }
        }

    }

    public void bloquear(){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j].setEnabled(false);

            }
        }

    }

//errores
        private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}

}


/*


package gato2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Gato2 extends JFrame implements ActionListener{

    JButton iniciar;
    JButton tablero[][];
    String jugador1, jugador2;
    int turno = -1;
    JLabel mensaje;
    Color colorB;

    public Gato2()
    {
        this.setLayout(null);
        mensaje = new JLabel("BIENVENIDO AL JUEGO");
        mensaje.setBounds(140,40,200,30);
        this.add(mensaje);
        iniciar = new JButton("Iniciar juego");
        iniciar.setBounds(130, 350, 150, 30);
        iniciar.addActionListener(this);
        this.add(iniciar);
        tablero = new JButton [3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                tablero[i][j] = new JButton();
                tablero[i][j].setBounds((i+1)*80, (j+1)*80, 80, 80);
                this.add(tablero[i][j]);
                tablero[i][j].addActionListener(this);
            }
        }
        colorB = tablero[0][0].getBackground();

    }

    public static void main(String[] args) {
        // TODO code application logic here

        Gato2 ventana = new Gato2();
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(450, 550);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setTitle("Juego del Gato");
        ventana.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()== iniciar) {
            turno = 0;
            JOptionPane.showMessageDialog(this, "Iniciando el juego");
            jugador1 = JOptionPane.showInputDialog(this,"Escribe el nombre del jugador 1");
            jugador2 = JOptionPane.showInputDialog(this,"Escribe el nombre del jugador 2");

            mensaje.setText("Turno del Jugador "+ jugador1);

            limpiar();
        }
        else
        {
            JButton boton = (JButton) e.getSource();
            if(turno == 0){
                if(boton.getText().equals(""))
                {
                boton.setBackground(Color.cyan);
                boton.setText("X");
                boton.setEnabled(false);
                turno = 1;
                mensaje.setText("Turno del Jugador " + jugador2);
                }
            }else{
                if(turno == 1){
                if(boton.getText().equals(""))
                {
                boton.setBackground(Color.white);
                boton.setText("O");
                boton.setEnabled(false);
                turno = 0;
                mensaje.setText("Turno del Jugador " + jugador1);
                }
              }
            }
           verificar();
        }

    }

    public void verificar()
    {
        int ganador = 0;

        for (int i = 0; i < 3; i++) {
            if(tablero[0][i].getText().equals("X") && tablero[1][i].getText().equals("X")
                    && tablero[2][i].getText().equals("X")){
                ganador = 1;
            }
            if(tablero[i][0].getText().equals("X") && tablero[i][1].getText().equals("X")
                    && tablero[i][2].getText().equals("X")){
                ganador = 1;
            }

        }
        if(tablero[0][0].getText().equals("X") && tablero[1][1].getText().equals("X")
                    && tablero[2][2].getText().equals("X")){
                ganador = 1;
            }
        if(tablero[0][2].getText().equals("X") && tablero[1][1].getText().equals("X")
                    && tablero[2][0].getText().equals("X")){
                ganador = 1;
            }

        for (int i = 0; i < 3; i++) {
            if(tablero[0][i].getText().equals("O") && tablero[1][i].getText().equals("O")
                    && tablero[2][i].getText().equals("O")){
                ganador = 2;
            }
            if(tablero[i][0].getText().equals("O") && tablero[i][1].getText().equals("O")
                    && tablero[i][2].getText().equals("O")){
                ganador = 2;
            }

        }
        if(tablero[0][0].getText().equals("O") && tablero[1][1].getText().equals("O")
                    && tablero[2][2].getText().equals("O")){
                ganador = 2;
            }
        if(tablero[0][2].getText().equals("O") && tablero[1][1].getText().equals("O")
                    && tablero[2][0].getText().equals("O")){
                ganador = 2;
            }

        if(ganador == 1){
                JOptionPane.showMessageDialog(this, "Felicidades Jugador " + jugador1+ " Ganastes!!!");
            }
        if(ganador == 2){
                JOptionPane.showMessageDialog(this, "Felicidades Jugador " + jugador2+ " Ganastes!!!");
            }

    }

    public void limpiar(){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j].setEnabled(true);
                tablero[i][j].setText("");
                tablero[i][j].setBackground(colorB);
            }
        }

    }

}


*/
