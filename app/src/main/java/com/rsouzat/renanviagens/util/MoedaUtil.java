package com.rsouzat.renanviagens.util;

import androidx.annotation.NonNull;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

  private static final String LANGUAGE = "pt";
  private static final String COUNTRY = "br";

  @NonNull
  public static String formataParaRealBr(BigDecimal preco) {
    NumberFormat formatadorDeDinheroReal = DecimalFormat.getCurrencyInstance(new Locale(LANGUAGE, COUNTRY));
    String precoFormatado = formatadorDeDinheroReal.format(preco).replace("R$", "R$ ");
    return precoFormatado;
  }
}
