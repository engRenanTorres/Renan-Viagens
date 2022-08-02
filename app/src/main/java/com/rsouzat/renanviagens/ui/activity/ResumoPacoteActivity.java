package com.rsouzat.renanviagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.rsouzat.renanviagens.R;
import com.rsouzat.renanviagens.model.Pacote;
import com.rsouzat.renanviagens.util.DiasUtil;
import com.rsouzat.renanviagens.util.MoedaUtil;
import com.rsouzat.renanviagens.util.ResourcesUtil;

import java.math.BigDecimal;

public class ResumoPacoteActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_resumo_pacote);

    Pacote pacoteRecife = new Pacote("Recife", "recife_pe",
            2, new BigDecimal(250.00));

    TextView data = findViewById(R.id.resumo_pacote_data);
    data.setText("24/2/2022");
    TextView dias = findViewById(R.id.resumo_pacote_dias);
    dias.setText(DiasUtil.getDiasEmTexto(pacoteRecife.getDias()));

    TextView preco = findViewById(R.id.resumo_pacote_preco);
    preco.setText(MoedaUtil.formataParaRealBr(pacoteRecife.getPreco()));
    ImageView imgCidade = findViewById(R.id.resumo_pacote_imagem_local);
    imgCidade.setImageDrawable(
            ResourcesUtil
                    .devolveDrawable(this, pacoteRecife.getImagem())
    );
    TextView nomeCidade = findViewById(R.id.resumo_pacote_nome_cidade);
    nomeCidade.setText(pacoteRecife.getLocal());

    Button botaoRealizaPagamento = findViewById(R.id.resumo_botao_realizar_pagamento);
  }

}