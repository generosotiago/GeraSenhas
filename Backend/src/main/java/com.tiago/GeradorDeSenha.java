package com.tiago;

import java.security.SecureRandom;

public class GeradorDeSenha {
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";

    public static String gerarSenha(int comprimento) {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(comprimento);

        for (int i = 0; i < comprimento; i++) {
            int indice = random.nextInt(CARACTERES.length());
            senha.append(CARACTERES.charAt(indice));
        }

        return senha.toString();
    }
}
