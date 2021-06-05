package com.example.test_proiect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class LegendeActivity extends AppCompatActivity {
    private ArrayList<Obiect> objsList;
    private RecyclerView recyclerView;
    private recyclerAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legende);
        recyclerView = findViewById(R.id.recyclerView);
        objsList = new ArrayList<>();

        setObiectInfo();
        setAdapter();
    }

    private void setAdapter(){
        setOnClickListener();
        recyclerAdapter adapter = new recyclerAdapter(objsList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new recyclerAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                intent.putExtra("titlu", objsList.get(position).getObj());
                intent.putExtra("imagine", objsList.get(position).getImagine());
                intent.putExtra("descriere", objsList.get(position).getDescriere());
                startActivity(intent);
            }
        };
    }


    private void setObiectInfo(){
        objsList.add(new Obiect("Legenda Babei Dochia", R.drawable.l1,"Legenda Babei Dochia, unul dintre miturile importante ale poporului roman, ne vorbeste despre fiul ei, Dragobete. Baba Dochia ne apare prezentata aici ca zmeoaica cea rea sau ca mama vitrega. Ea isi pune nora sa indeplineasca sarcini imposibile: sa innegreasca lana alba la rau, apoi sa o faca la loc. Fata a primit ajutor de la Dumnezeu si Sf. Petre. Apoi, convinsa ca vine primavara, Baba Dochia s-a urcat pe munte imbracata cu 9 cojoace (cele 9 zile ale Babei). Dand cojoacele jos s-a transformat in stana de piatra. De aceea se spune ca alegerea Babei potrivite in aceasta perioada dicteaza cum va fi vremea in restul anului.\n" +
                "Exista si varianta legendei “Traian si Dochia”, unde Dochia este fiica imparatului Traian de care s-a indragostit insusi Decebal. Si ea este transformata in stana de piatra.\n" +
                "Legenda Traian si Dochia este mitul etnogenezei poporului roman.\n" +
                "In aceasta perioada exista multe sarbatori populare precum Vinerea Sântoaderului, Caii lui San Toader, pe 1 si 10 martie.\n" +
                "Observam, in general, o deprindere si inclinare a taranilor romani in a ghici vremea si capriciile ei in functie de anumite superstitii si legende locale.\n"));

        objsList.add(new Obiect("Zburatorul", R.drawable.l2,"Zburatorul este considerat o fiinta fabuloasa. El este reprezentat de un tanar ce apare in visele fetelor nemaritate. Aceasta fiinta apare si in folclorul sumerian, spre exemplu. Insa aici este vorba de succubus. Acesta este un demon cu chip de femeie ce chinuie barbatii.\n" +
                "Zburatorul a devenit popular datorita poeziei de Ion Heliade Radulescu. Aici Zburatorul este descris ca balaur de lumina cu coada-nflacarata. Pe el lucesc pietre nestemate ca de foc. Arata ca un flacaiandru tras prin inel, balai, cu par de aur. Dar slabele lui vine n-au nici un pic de sange.\n" +
                "El apare noaptea ca un fulger cu scantei si se strecoara pe cos in patul fecioarelor. La fel, mitul Zburatorului este folosit de Mihai Eminescu in poemul “Luceafarul”. Aceasta semidivinitate sau duh rau poate fi indepartat prin farmece si descantece populare. El simbolizeaza sexualitatea. Adesea se aseamana cu un Eros al mitologiei grecesti. In unele zone ale tarii apare si Zburatoroaica, aspectul feminin. Zburatorul este un semizeu ce poate lua forma de sarpe, caine sau sul de foc. Asa apare descris in folclor. Alteori are solzi argintii si aripi albe.\n"));
        objsList.add(new Obiect("Balada Mesterului Manole ", R.drawable.l3,"Balada Mesterului Manole este atat mit, cat si istorie. Caci Manastirea Curtea de Arges exista in realitate. Cat de real este sacrificiul nu stim.\n" +
                "Acest mit vorbeste despre sacrificiul ce sta la baza fiecarei constructii.\n" +
                "Mesterul Manole este un personaj istoric. El este consemnat pe timpul domniei lui Neagoe Basarab. Un armean tocmit sa ridice manastirea. Legenda culeasa de Vasile Alecsandri vorbeste de Ana, sotia lui Manole. Este posibil ca aceasta sa fi fost fiica lui Parvu Craiovescu. nsa traditia istorica ne arata de fapt o revolta a mesterilor romani. Acestia nu voiau sa lucreze cu un strain ce se scolise la curtea otomana. Astfel, i-au sabotat planurile. Constructia a durat 5 ani.\n" +
                "Aici putem vorbi si de traditia populara a ingropatului umbrei. Sau zidirea umbrei. Unei persoane i se luau masuratorile dupa umbra. Iar jalonul rupt pe jumatate era aruncat in zidarie.\n"));

    }
}