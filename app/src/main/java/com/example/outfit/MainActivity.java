package com.example.outfit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private String title = "Mode List";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();
    private ArrayList<String> gambarUrls = new ArrayList<>();
    private ArrayList<String> penjelasan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:started.");
        initImageBitmaps();
    }

    private void initImageBitmaps() {
        gambarUrls.add("http://localbrand.co.id/store_data/wearmustache/products/newyork-sweater-state-grey/f001.MG7377.jpg");
        mNames.add("NewYork Sweater State Grey");
        mDesc.add("Outwear");
        penjelasan.add("Wearmustache adalah produk lokal dengan koleksi sweater dan polo shirt yang beragam. Koleksi Wearmustache memiliki bahan yang nyaman untuk dipakai sebagai tampilan sehari-hari. NewYork Sweater yang simpel akan cocok jika dipadukan dengan celana chinos favoritmu!\n" +
                "\n" +
                "Outerwear adalah fashion item yang wajib ada dilemari cewek sebab outerwear adalah jenis pakaian yang berupa atasan yang paling luar digunakan dalam sebuah outfit. Outerwear dapat berupa berbagai jaket, hoodie, coat, blazer, cardigan, rompi, sweater bahkan kemeja sekalipun.");
        gambarUrls.add("http://localbrand.co.id/store_data/Elvacka/products/moony-black/f001.MG0412.jpg");
        mNames.add("Moony Black");
        mDesc.add("T-shirt");
        penjelasan.add("Elvacka adalah merek pakaian yang hadir sejak tahun 2012. Desain yang digunakan terdiri dari perkotaan, modern, sederhana, dan cenderung mencoba untuk membuat gaya hidup anak muda saat ini dengan busana yang baik dan berkualitas sehingga setiap desain menekankan daya tarik sendiri.");

        gambarUrls.add("http://localbrand.co.id/store_data/Komma/products/buck-shirt-in-blue/f003.MG7253.jpg");
        mNames.add("Buck Shirt In Blue\n");
        mDesc.add("Shirt");
        penjelasan.add("Komma mempersembahkan cara lain untuk menjadi elegan dalam kehidupan sehari-hari. Seperti namanya yang menandakan ketidakinginan untuk berhenti, Komma selalu membawa ide- ide baru tentang cara berpakaian bagi kaum urban ke arah yang mengagumkan di dalam kesederhanaan. Di dalam setiap koleksinya, Komma mencoba untuk mematahkan seluruh hal yang biasa menjadi sesuatu yang di luar dari biasa. \n" +
                "\n" +
                "Baju ini berbahan katun yang sangat cocok pada saat cuaca panas.");
        gambarUrls.add("http://localbrand.co.id/store_data/krrays/products/krrays-dont-think-too-much-cap-black/f005.f001.DONTHINKTOOMUCH1.JPG");
        mNames.add("Krrays Don't Think Too Much Cap - Black");
        mDesc.add("Accessories");
        penjelasan.add("Krrays adalah brand streetwear indonesia. Didesain khusus untuk kamu yang ingin berpakaian casual dengan gaya street. Bahan yang pilih juga cocok untuk dipakai di iklim tropis seperti indonesia, tetap dingin walau kondisi matahari terik.\n" +
                "\n" +
                "Tapi, bukan berarti topi hanya bisa dipakai saat cuaca terik. Outfit sebaguna ini bisa dipakai di segala kondisi.");

        gambarUrls.add("http://localbrand.co.id/store_data/liquidgold/products/liquid-gold-wristlet-black/f003.LIQUIDGOLDWRISTLETBLACK01.jpg");
        mNames.add("Liquid Gold Wristlet- Black");
        mDesc.add("Bags & Wallet");
        penjelasan.add("Barang bawaan ke kantor pasti nggak sedikit. Mulai dari bawa handphone, dompet, dan buku catatan pun nggak boleh ketinggalan. Tas yang tepat sudah pasti yang ukurannya cukup luas. Sling bag berukuran besar bisa bikin bahu kamu nggak nyaman karena berat.");

        gambarUrls.add("http://localbrand.co.id/store_data/LBXArgyle/products/pinnaple-jumper-01-white/f002.MG1699.jpg");
        mNames.add("Pinnaple Jumper 01 White");
        mDesc.add("Outwear");
        penjelasan.add("LB X Argyle dan Oxford brand lokal yang mengeluarkan koleksi pakaian pria. Gaya kasualmu akan cocok dengan koleksi Ludger yang nyaman untuk dipakai dan desain yang beragam. Lengan pendek dan berbahan katunn. \n" +
                "Outerwear adalah fashion item yang wajib ada dilemari cewek sebab outerwear adalah jenis pakaian yang berupa atasan yang paling luar digunakan dalam sebuah outfit. Outerwear dapat berupa berbagai jaket, hoodie, coat, blazer, cardigan, rompi, sweater bahkan kemeja sekalipun.");

        gambarUrls.add("http://localbrand.co.id/store_data/Fonbelt/products/fbbr30074-brn-khk-cream/f001.MG0253.jpg");
        mNames.add("Fonbelt Brown");
        mDesc.add("Accessories");
        penjelasan.add("Fonbelt adalah brand lokal yang mengeluarkan berbagai jenis ikat pinggang. Beragam koleksi dengan desain yang unik bisa kamu dapatkan di Fonbelt. Padukan ikat pinggang berwarna abu-abu berbahan polyester dengan gaya kasual!\n" +
                "Ikat Pinggang berwarna coklat ini sangat pas dipakai dengan outfit kita sehari - hari. Jadi ikat pinggang merupakan aksesoris yang pas dengan putfit kita.");

        initRecyclerView();

    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecycleViewAdapter adapter = new RecycleViewAdapter(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);
    }

    private void showRecyleList() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListActivity adapter = new ListActivity(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);

    }

    private void showRecyclerGrid() {
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        GridActivity adapter = new GridActivity(this, mNames, gambarUrls, mDesc, penjelasan);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_list:
                setActionBarTitle("Mode List");
                showRecyleList();
                break;
            case R.id.action_grid:
                setActionBarTitle("Mode Grid");
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                setActionBarTitle("Mode Card View");
                initRecyclerView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

    }
}