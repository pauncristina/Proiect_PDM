package com.example.test_proiect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class TraditiiActivity extends AppCompatActivity {
    private ArrayList<Obiect> objsList;
    private RecyclerView recyclerView;
    private recyclerAdaptert.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traditii);
        recyclerView = findViewById(R.id.recyclerViewt);
        objsList = new ArrayList<>();

        setObiectInfo();
        setAdapter();
    }

    private void setAdapter(){
        setOnClickListener();
        recyclerAdaptert adapter = new recyclerAdaptert(objsList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void setOnClickListener() {
        listener = new recyclerAdaptert.RecyclerViewClickListener() {
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
        objsList.add(new Obiect("Martisorul", R.drawable.t1,"Una din cele mai frumoase tradiţii româneşti este sărbătorirea venirii primăverii. Mărţişorul este un simbol străvechi, care marchează venirea timpului călduros pe meleagurile româneşti. În credinţele populare, acest talisman are puteri magice. Bărbaţii oferă mărţişoare femeilor, iar acestea le poartă în piept sau la mână, pe tot parcursul lunii martie.\n" +
                "Mărţişorul a fost conceput ca o amuletă legată cu un şnur împletit din două fire-unul alb (simbolizând divinitatea, sănătatea, puritatea sufletească şi împlinirea) şi unul roşu (ca simbol al dragostei pentru frumuseţile eterne ale vieţii : prietenia, fidelitatea şi onoarea).\n" +
                "În tradiţia populară, cele două culori (alb şi roşu) din care se împleteşte şnurul cu care se leagă mărţişorul-talisman reprezintă şi cele două anotimpuri de bază (iarna şi vara), în timp ce primăvara şi toamna sunt considerate doar anotimpuri de trecere.\n" +
                "Unele legende populare spun că mărţişorul ar fi fost tors de Baba Dochia în timp ce urca cu oile la munte.\n" +
                "Cu timpul, la acest şnur s-a adăugat o monedă de argint. Moneda era asociată soarelui. Mărţişorul ajunge să fie un simbol al focului şi al luminii, deci şi al soarelui.\n"));

        objsList.add(new Obiect("“Babele” de Martie", R.drawable.t2,"Un obicei frumos din rânduiala populară tradiţională, alegerea \"babelor\", aşa cum îl cunoaştem astăzi, cu rol de amuzament, avea o însemnătate aparte în formarea valorilor familiale tradiţionale şi, mai mult, era un \"dătător de speranţă\" pentru viaţă veşnică.\n" +
                "Credinţa populară spune că \"Babele\" sunt vrăjitoare care au puterea să influenţeze starea vremii într-o singură zi, căci în aceste zile până şi Baba Dochia, cea care aduce vremea rece, începe să dezbrace cele 9 cojoace pe care le poartă din iarnă.\n" +
                "\"Babele\" simbolizează o tradiţie românească fascinantă, o legendă invocată în mituri şi istorisiri româneşti, bazată atât pe interpretarea \"băbească\" a vremii, cât şi pe ritualurile care se petreceau în sânul familiei tradiţionale.\n" +
                "Potrivit tradiţiei populare, între 1 – 9 martie se alege o zi, sau o \"babă\", care va anticipa starea de spirit, norocul şi predispoziţia fiecăruia, până la \"babele\" de anul următor. Frumoasă şi însorită, sau dimpotrivă, ploioasă şi Înnorată, această zi este determinantă pentru cei care îşi aleg \"Baba\" şi se spune că îi va reprezenta tot anul. Aşadar, fie vor avea noroc cu carul, fie vor avea parte de încercări primejdioase. \"Se spune că vremea din aceste zile relevă starea lăuntrică şi bunătatea sufletească a fiecărei persoane. Astfel, dacă vremea este frumoasă şi soarele străluceşte, omul este voios şi bun la suflet şi îi va merge bine tot anul următor. În schimb, dacă vremea este întunecată, acela nu va fi un om bun la suflet şi va fi supărăcios tot anul. Pe de altă parte, se spune că dacă ninge sau plouă în acea zi este semn de bogăţie\" (Paulina Popoiu, muzeograf şi manager al Muzeulului Naţional al Satului \"Dimitrie Gusti\" din Bucureşti). Însă, dincolo de acest joc, 1 – 9 martie \"Babele\", simbolizate de Baba Dochia, nu reprezintă altceva decât ultima luptă care se dă între iarnă şi primăvară. După moartea ei, zilele încep să crească, iar vremea frumoasă triumfă.\n"));
        objsList.add(new Obiect("Boul înstruțat", R.drawable.t3,"Boul înstruţat este o sărbătoare a solstiţiului de vară, desfăşurată la noi de Sânziene sau Rusalii. Personajul central este un bou cu înfăţişare falnică (ales cu grijă în acest scop), împodobit cu clopoţei, cu flori şi ţesături frumoase şi care este plimbat pe uliţa satului, reprezentând, cred etnologii, ipostaza zoomorfă a unei străvechi divinităţi cu puteri fertilizatoare, ce chezăşuia obţinerea unor recolte bogate. “Zeul” zoomorf străbătea satul, însoţit de un alai de personaje mascate, cu înfăţişări şi manifestări ce aminteau de alaiul zeului grec Dionysos, asociat cu rodnicia şi forţa vitală.\n" +
                "Obiceiul mai supravieţuieşte în unele sate transilvane, poate nu într-o formă atât de dezlănţuită ca în vechime, dar tot pitoresc şi tot spectaculos, deşi poate prea puţini cunosc originea pe care o atribuie cercetătorii acestui ceremonial.\n"));
        objsList.add(new Obiect("Ceremonia de pregătire a nunţii " +
                "şi furatul miresei", R.drawable.t4,"Ceremonia de pregătire dinaintea nunţii este şi ea una din cele mai frumoase tradiţii româneşti. Mireasa este ajutată de către mama ei şi de către prietenii apropiaţi familiei ,să se pregătească de nuntă. Mirele se duce să o ia pe viitoarea lui soţie de acasă şi să o ducă la biserică. El este însoţit, în mod tradiţional, de prietenii săi apropiaţi. Înainte de asta, cavalerul de onoare îl bărbiereşte simbolic pe mire. De obicei, se foloseşte un cuţit, sau chiar un topor pentru această tradiţie.\n" +
                "\n" +
                "Furatul miresei este una din cele mai fascinante tradiţii româneşti pentru străini, conform blogului turistic TouristinRomania. Este unul din cele mai interesante obiceiuri locale, mireasa se fură la miezul nopţii şi se cere răscumpărare pentru a o înapoia mirelui. Există anumite diferenţe ale acestui obicei, în funcţie de localitate, dar rădăcina este aceeaşi.\n" +
                "Această tradiţie este o reminiscenţă străveche, din timpul în care mireasa era văzută ca cea mai de preţ posesie.\n"));


    }
}