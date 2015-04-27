package com.example.lkw.bluetoothtest1;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends ActionBarActivity {
    private static final String uuid = "4e3a500b-1ba9-4c3f-a5fe-76cb46608b5f";


    private Map<BluetoothDevice,BluetoothSocket>socketMap=new HashMap<>();
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {

        }
    };
    private RecyclerView recycler;
    private DeviceAdapter adapter;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = ((RecyclerView) findViewById(R.id.recycler));
        recycler.setLayoutManager(new LinearLayoutManager(this));
        adapter = new DeviceAdapter(this,new ArrayList<BluetoothDevice>());

    }



}
