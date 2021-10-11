package com.unisul.imc.dto;

public class ImcDTO {

    private float altura;
    private float peso;

    public ImcDTO() {
    }

    public ImcDTO(float altura, float peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float calcular(float altura, float peso){
        float imc = peso/(altura * altura);
        if (peso <= 0 || altura <= 0){
            return 0;
        }
        else {
            return imc;
        }
    }

    public String resultado (float imc){
        String resultado = "";
        if (imc <= 0){
            resultado = "IMC inválido!";
        }
        else if (imc > 0 && imc < 18.5){
            resultado = "você está abaixo do peso.";
        }
        else if (imc >= 18.5 && imc < 25){
            resultado = "você está no peso normal.";
        }
        else if (imc >= 25 && imc < 30){
            resultado = "você está acima do peso.";
        }
        else if (imc >= 30 && imc < 35){
            resultado = "você está com obesidade classe I.";
        }
        else if (imc >= 35 && imc < 40){
            resultado = "você está com obesidade classe II.";
        }
        else if (imc >= 40){
            resultado = "você está com obesidade classe III.";
        }
        return "Seu IMC é " + imc + " e " + resultado;
    }
}
