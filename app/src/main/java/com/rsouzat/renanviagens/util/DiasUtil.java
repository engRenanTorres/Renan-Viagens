package com.rsouzat.renanviagens.util;

import androidx.annotation.NonNull;

import com.rsouzat.renanviagens.model.Pacote;

public class DiasUtil {
  @NonNull
  public static String getDiasEmTexto(int numeroDeDiasPuro) {
    if (numeroDeDiasPuro == 1) return numeroDeDiasPuro + " dia";
    else return numeroDeDiasPuro + " dias";
  }
}
