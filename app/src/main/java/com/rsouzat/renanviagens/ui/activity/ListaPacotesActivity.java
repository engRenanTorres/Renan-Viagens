package com.rsouzat.renanviagens.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.rsouzat.renanviagens.R;
import com.rsouzat.renanviagens.dao.PacoteDao;
import com.rsouzat.renanviagens.model.Pacote;
import com.rsouzat.renanviagens.ui.adapter.ListaPacotesAdapter;

import java.util.List;

public class ListaPacotesActivity extends AppCompatActivity {

  private static final String TITLE_APP_BAR = "Pacotes";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lista_pacotes);

    setTitle(TITLE_APP_BAR);

    configuraListView();
  }

  private void configuraListView() {
    List<Pacote> pacotes = PacoteDao.lista();
    ListView listView = findViewById(R.id.lista_pacotes_listview);
    listView.setAdapter(new ListaPacotesAdapter(pacotes,this));
  }
}