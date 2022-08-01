package com.rsouzat.renanviagens.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rsouzat.renanviagens.util.DiasUtil;
import com.rsouzat.renanviagens.util.MoedaUtil;
import com.rsouzat.renanviagens.R;
import com.rsouzat.renanviagens.util.ResourcesUtil;
import com.rsouzat.renanviagens.model.Pacote;

import java.util.List;

public class ListaPacotesAdapter extends BaseAdapter {
  private final List<Pacote> pacotes;
  private final Context context;

  public ListaPacotesAdapter(List<Pacote> pacotes, Context context) {
    this.pacotes = pacotes;
    this.context = context;
  }

  @Override
  public int getCount() {
    return pacotes.size();
  }

  @Override
  public Pacote getItem(int position) {
    return pacotes.get(position);
  }

  @Override
  public long getItemId(int i) {
    return 0;
  }

  @Override
  public View getView(int position, View view, ViewGroup parent) {
    View viewCriada = LayoutInflater.from(context).inflate(R.layout.item_pacote, parent, false);

    Pacote pacote = pacotes.get(position);

    mostraLocal(viewCriada, pacote);

    mostraDias(viewCriada, pacote);

    mostraPreco(viewCriada, pacote);

    mostraImagem(viewCriada, pacote);


    return viewCriada;
  }

  private void mostraPreco(View viewCriada, Pacote pacote) {
    TextView textPreco = viewCriada.findViewById(R.id.item_pacote_preco);
    String precoFormatado = MoedaUtil.formataParaRealBr(pacote.getPreco());
    textPreco.setText(precoFormatado);
  }

  private void mostraImagem(View viewCriada, Pacote pacote) {
    ImageView cidadeImgView = viewCriada.findViewById(R.id.item_pacote_foto_cidade);
    Drawable drawableImgLocal = ResourcesUtil.devolveDrawable(context,pacote.getImagem());
    cidadeImgView.setImageDrawable(drawableImgLocal);
  }



  private void mostraDias(View viewCriada, Pacote pacote) {
    TextView textDias = viewCriada.findViewById(R.id.item_pacote_tempo);
    String diasEmTexto = DiasUtil.getDiasEmTexto(pacote.getDias());
    textDias.setText(diasEmTexto);
  }



  private void mostraLocal(View viewCriada, Pacote pacote) {
    TextView textNomeCidade = viewCriada.findViewById(R.id.item_pacote_nome_cidade);
    textNomeCidade.setText(pacote.getLocal());
  }
}
