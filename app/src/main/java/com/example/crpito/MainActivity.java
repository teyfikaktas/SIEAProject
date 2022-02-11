package com.example.crpito;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.crpito.databinding.ActivityMainBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    OutputStream outputStream;
    public static boolean First = true;

    static StringBuilder ValueStr = new StringBuilder();
    static StringBuilder SB = new StringBuilder();
    static StringBuilder Key = new StringBuilder();
    static int hata;
    static String Valur;

    TextView textView2;
    Uri uri;
    ImageView img2;
    TextInputEditText textInputEditText;
    ImageView img;
    private  AppBarConfiguration appBarConfiguration;
    private  ActivityMainBinding binding;





    public long MemoryFinder() {
        Debug.MemoryInfo memInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memInfo);
        long res = memInfo.getTotalPrivateDirty();

        res += memInfo.getTotalPrivateClean();

        return (res * 1024L);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        openactivty();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        setContentView(R.layout.activity_main);
        textInputEditText = findViewById(R.id.txt);
        textView2 = findViewById(R.id.textView);
        findViewById(R.id.button).setVisibility(View.INVISIBLE);
        findViewById(R.id.ChooseImg).setVisibility(View.VISIBLE);
        try {
            FirebaseAuth mAuth = FirebaseAuth.getInstance();
            System.out.println(Objects.requireNonNull(mAuth.getCurrentUser()).getEmail());

            textView2.setText(Objects.requireNonNull(mAuth.getCurrentUser()).getEmail());

        }
        catch (NullPointerException n){
            System.out.println("hata");
        }
        findViewById(R.id.ChooseImg).setOnClickListener(v -> {
           // ValueStr.setLength(0);
            img = findViewById(R.id.imgimg);
            img2 = findViewById(R.id.imageView2);
            ArrayList<Integer> arrayList;
            ArrayList<Integer> arrayList2;
            ArrayList<Integer> arrayListt;

            String text = Long.toString(MemoryFinder());
            text = encrypt.Sha3Algorithm(text);
            String  textx = encrypt.Converty(text);
            System.out.println(textx);
            Bitmap bitmap1 =((BitmapDrawable) img2.getDrawable()).getBitmap();

            Bitmap mutableBitmap = bitmap1.copy(Bitmap.Config.ARGB_8888, true);
            String SelectedValue = textx.substring(0, 128);
            String SelectedValue2 = textx.substring(128, 256);
            String ChooseTransformission = textx.substring(256, 384);
            String ChooseTransformissionf = textx.substring(384, 512);
            int selectablePretty = binaryToInteger(SelectedValue2);
            int selectablePretty1 = binaryToInteger(SelectedValue);
            int ChooseTransformissionInt = binaryToInteger(ChooseTransformission);
            int ChooseValueF = Math.abs(selectablePretty1%7);
            int chosen = Math.abs(selectablePretty%3);
            int ChooseValueFF = Math.abs(ChooseTransformissionInt%4);
            StringBuilder svv= new StringBuilder();
            arrayList2 = binerilization.convertBinaries(bitmap1);
            StringBuilder SBX = binerilization.ConvertBinary(arrayList2);
            double xn;
            double a;
            if (chosen == 0) {
                System.out.println(1);
                if (ChooseValueF == 0) {
                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_PSO_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else  if (ChooseValueF == 1) {
                    System.out.println("ttt");

                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_ACO_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else   if (ChooseValueF == 2) {
                    System.out.println("ttt");

                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;

                    a = OptiAlg.LOG_DE_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else   if (ChooseValueF == 3) {

                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_GSA_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else    if (ChooseValueF == 4) {
                    System.out.println("ttt");

                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_HS_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else  if (ChooseValueF == 5) {
                    System.out.println("ttt");
                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_SOS_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else  {
                    System.out.println("ttt");
                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_GOLD_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }


            }   else if (chosen == 1) {
                System.out.println(2);
                if (ChooseValueF == 0) {
                    xn = OptiAlg.TENT_PSO_XN;
                    a = OptiAlg.TENT_PSO_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);
                }  if (ChooseValueF == 1) {
                    xn = OptiAlg.TENT_ACO_XN;
                    a = OptiAlg.TENT_ACO_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);

                }  if
                (ChooseValueF == 2) {
                    hata = 3;

                    xn = OptiAlg.TENT_DE_XN;
                    a = OptiAlg.TENT_DE_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);

                }  if (ChooseValueF == 3) {
                    hata = 3;
                    xn = OptiAlg.TENT_GSA_XN;
                    a = OptiAlg.TENT_GSA_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);
                }  if (ChooseValueF == 4) {
                    xn = OptiAlg.TENT_HS_XN;
                    a = OptiAlg.TENT_HS_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);

                }  if (ChooseValueF == 5) {
                    xn = OptiAlg.TENT_SOS_XN;
                    a = OptiAlg.TENT_SOS_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);
                }  if (ChooseValueF == 6) {
                    xn = OptiAlg.TENT_GOLD_XN;
                    a = OptiAlg.TENT_GOLD_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);
                }
            }
            else  {
                System.out.println(3);
                if (ChooseValueF == 0) {
                    xn = OptiAlg.SINE_PSO_XN;
                    a = OptiAlg.SINE_PSO_A;
                    svv= helpermethotds.SineCalc(SBX.length(), xn, a);
                }  if (ChooseValueF == 1) {
                    xn = OptiAlg.SINE_ACO_XN;
                    a = OptiAlg.SINE_ACO_A;
                    svv=       helpermethotds.SineCalc(SBX.length(), xn, a);

                }  if
                (ChooseValueF == 2) {
                    xn = OptiAlg.SINE_DE_XN;
                    a = OptiAlg.SINE_DE_A;
                    svv=       helpermethotds.SineCalc(SBX.length(), xn, a);

                }  if (ChooseValueF == 3) {
                    xn = OptiAlg.SINE_GSA_XN;
                    a = OptiAlg.SINE_GSA_A;
                    svv=       helpermethotds.SineCalc(SBX.length(), xn, a);

                }  if (ChooseValueF == 4) {
                    xn = OptiAlg.SINE_HS_XN;
                    a = OptiAlg.SINE_HS_A;
                    svv=       helpermethotds.SineCalc(SBX.length(), xn, a);

                }  if (ChooseValueF == 5) {
                    hata = 5;
                    xn = OptiAlg.SINE_SOS_XN;
                    a = OptiAlg.SINE_SOS_A;
                    svv=       helpermethotds.SineCalc(SBX.length(), xn, a);
                }  if (ChooseValueF == 6) {
                    hata = 6;
                    xn = OptiAlg.SINE_GOLD_XN;
                    a = OptiAlg.SINE_GOLD_A;
                    svv=helpermethotds.SineCalc(SBX.length(), xn, a);
                }
            }
            StringBuilder str;
            str = helpermethotds.XOREncoder(SBX,svv);
            arrayList = Decoder.Try(str);
            if(ChooseValueFF==0){
                arrayListt=   Decoder.ARrraySplit(arrayList);

            }
            else if(ChooseValueFF==1){
                arrayListt=  Decoder.DArraySplit(arrayList);
            }
            else if(ChooseValueFF==2){

                arrayListt=  Decoder.RDiagonel(arrayList);
            }
            else {
                arrayListt=   Decoder.ZLDiagonel(arrayList);
            }

            Bitmap bitmap =  Decoder.ImageCreateBitmap(arrayListt,mutableBitmap);
            //   img2.setImageDrawable(mDrawable);
           // img2.setImageDrawable(mDrawable);
          //  img2 = findViewById(R.id.imgimg);
            img2.setImageBitmap(bitmap);

        });
        findViewById(R.id.button3).setOnClickListener(v -> {
            findViewById(R.id.button).setVisibility(View.INVISIBLE);
            findViewById(R.id.ChooseImg).setVisibility(View.VISIBLE);

        });
        findViewById(R.id.clicker).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.button).setVisibility(View.VISIBLE);
                findViewById(R.id.ChooseImg).setVisibility(View.INVISIBLE);
            }
        });
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.R)
            @Override
            public void onClick(View view) {

                ArrayList<Integer> arrayList1 = new ArrayList<>();
                ArrayList<Integer> arrayList2 = new ArrayList<>();

                img = findViewById(R.id.imgimg);
                img2 = findViewById(R.id.imageView2);
                Bitmap bitmap = ((BitmapDrawable) img2.getDrawable()).getBitmap();
                Debug.MemoryInfo memInfo = new Debug.MemoryInfo();
                Debug.getMemoryInfo(memInfo);
                long res = memInfo.getTotalPrivateDirty();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
                    res += memInfo.getTotalPrivateClean();
                textInputEditText = findViewById(R.id.txt);
                 String sha3Algorithm = encrypt.Sha3Algorithm(textInputEditText.getText().toString());
                System.out.println(sha3Algorithm);
                Valur = encrypt.Converty(sha3Algorithm);
                System.out.println("ValurFirst" + sha3Algorithm);
                bitmap = Bitmap.createScaledBitmap(bitmap,900,900,true);

                arrayList1 = binerilization.convertBinaries(bitmap);
                //  Trans = binerilization.convertBinaries(bitmap);
                Bitmap mutableBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                StringBuilder svv = new StringBuilder();
                String SelectedValue = Valur.substring(0, 128);
                String SelectedValue2 = Valur.substring(128, 256);
                String ChooseTransformission = Valur.substring(256, 384);
                String ChooseTransformissionf = Valur.substring(384, 512);
                int selectablePretty = binaryToInteger(SelectedValue2);
                int selectablePretty1 = binaryToInteger(SelectedValue);
                int ChooseTransformissionInt = binaryToInteger(ChooseTransformission);
                int ChooseValueF = Math.abs(selectablePretty1%7);
                int chosen = Math.abs(selectablePretty%3);
                int ChooseValueFF = Math.abs(ChooseTransformissionInt%4);
                if(ChooseValueFF==0){
                    System.out.println("1");
                  arrayList2 =  Decoder.ArraySplit(arrayList1);
                }
               else if(ChooseValueFF==1){
                    System.out.println("2");
                    arrayList2 = Decoder.ZArraySplit(arrayList1);
                }
                else if(ChooseValueFF==2){
                    System.out.println("3");
                    arrayList2 =   Decoder.ZDiagonel(arrayList1);
                }
                else {
                    arrayList2 =   Decoder.LDiagonel(arrayList1);
                }

                System.out.println();
                StringBuilder SBX = binerilization.ConvertBinary(arrayList2);
                double xn;
                double a;
                if (chosen == 0) {
                    System.out.println(1);
                    if (ChooseValueF == 0) {
                        System.out.println("ttt");
                        xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                        a = OptiAlg.LOG_PSO_A;
                        svv=    helpermethotds.LogCalc(SBX.length(), xn, a);
                    }
                   else  if (ChooseValueF == 1) {
                        System.out.println("ttt");

                        xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                        a = OptiAlg.LOG_ACO_A;
                        svv=    helpermethotds.LogCalc(SBX.length(), xn, a);
                    }
                  else   if (ChooseValueF == 2) {
                        System.out.println("ttt");

                        xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;

                        a = OptiAlg.LOG_DE_A;
                        svv=    helpermethotds.LogCalc(SBX.length(), xn, a);
                    }
                  else   if (ChooseValueF == 3) {
                        System.out.println("ttt");

                        xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                        a = OptiAlg.LOG_GSA_A;
                        svv=    helpermethotds.LogCalc(SBX.length(), xn, a);
                    }
                 else    if (ChooseValueF == 4) {
                        System.out.println("ttt");

                        xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                        a = OptiAlg.LOG_HS_A;
                        svv=    helpermethotds.LogCalc(SBX.length(), xn, a);
                    }
                   else  if (ChooseValueF == 5) {
                        System.out.println("ttt");
                        xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                        a = OptiAlg.LOG_SOS_A;
                        svv=    helpermethotds.LogCalc(SBX.length(), xn, a);
                    }
                     else  {
                        System.out.println("ttt");
                        xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                        a = OptiAlg.LOG_GOLD_A;
                        svv=    helpermethotds.LogCalc(SBX.length(), xn, a);
                    }


                }   else if (chosen == 1) {

                    if (ChooseValueF == 0) {
                        xn = OptiAlg.TENT_PSO_XN;
                        a = OptiAlg.TENT_PSO_A;
                     svv =   helpermethotds.TentMap(SBX.length(), xn, a);
                    }  if (ChooseValueF == 1) {
                        xn = OptiAlg.TENT_ACO_XN;
                        a = OptiAlg.TENT_ACO_A;
                        svv =   helpermethotds.TentMap(SBX.length(), xn, a);

                    }  if
                    (ChooseValueF == 2) {
                        hata = 3;

                        xn = OptiAlg.TENT_DE_XN;
                        a = OptiAlg.TENT_DE_A;
                        helpermethotds.TentMap(SBX.length(), xn, a);

                    }  if (ChooseValueF == 3) {
                        hata = 3;
                        xn = OptiAlg.TENT_GSA_XN;
                        a = OptiAlg.TENT_GSA_A;
                        svv =   helpermethotds.TentMap(SBX.length(), xn, a);
                    }  if (ChooseValueF == 4) {
                        xn = OptiAlg.TENT_HS_XN;
                        a = OptiAlg.TENT_HS_A;
                        svv =   helpermethotds.TentMap(SBX.length(), xn, a);

                    }  if (ChooseValueF == 5) {
                        xn = OptiAlg.TENT_SOS_XN;
                        a = OptiAlg.TENT_SOS_A;
                        svv =   helpermethotds.TentMap(SBX.length(), xn, a);
                    }  if (ChooseValueF == 6) {
                        xn = OptiAlg.TENT_GOLD_XN;
                        a = OptiAlg.TENT_GOLD_A;
                        svv =   helpermethotds.TentMap(SBX.length(), xn, a);
                    }
                }
                 else  {
                    System.out.println(3);
                    if (ChooseValueF == 0) {
                        xn = OptiAlg.SINE_PSO_XN;
                        a = OptiAlg.SINE_PSO_A;
                    svv=    helpermethotds.SineCalc(SBX.length(), xn, a);
                    }  if (ChooseValueF == 1) {
                        xn = OptiAlg.SINE_ACO_XN;
                        a = OptiAlg.SINE_ACO_A;
                        svv=    helpermethotds.SineCalc(SBX.length(), xn, a);

                    }  if
                    (ChooseValueF == 2) {
                        xn = OptiAlg.SINE_DE_XN;
                        a = OptiAlg.SINE_DE_A;
                        svv=    helpermethotds.SineCalc(SBX.length(), xn, a);

                    }  if (ChooseValueF == 3) {
                        xn = OptiAlg.SINE_GSA_XN;
                        a = OptiAlg.SINE_GSA_A;
                        svv=    helpermethotds.SineCalc(SBX.length(), xn, a);

                    }  if (ChooseValueF == 4) {
                        xn = OptiAlg.SINE_HS_XN;
                        a = OptiAlg.SINE_HS_A;
                        svv=    helpermethotds.SineCalc(SBX.length(), xn, a);

                    }  if (ChooseValueF == 5) {
                        hata = 5;
                        xn = OptiAlg.SINE_SOS_XN;
                        a = OptiAlg.SINE_SOS_A;
                        svv=    helpermethotds.SineCalc(SBX.length(), xn, a);
                    }  if (ChooseValueF == 6) {
                        hata = 6;
                        xn = OptiAlg.SINE_GOLD_XN;
                        a = OptiAlg.SINE_GOLD_A;
                        svv=    helpermethotds.SineCalc(SBX.length(), xn, a);
                    }
                }
                /*
                   } // çok düzenli
                    else if(ChooseValueF==2){
                        xn= OptiAlg.TENT_DE_XN;
                        a= OptiAlg.TENT_DE_A;
                        MainActivity.sv = helpermethotds.TentMap(Trans,xn,a);
                    }
                    else if(ChooseValueF==3){
                        xn= OptiAlg.TENT_GSA_XN;
                        a= OptiAlg.TENT_GSA_A;
                        MainActivity.sv = helpermethotds.TentMap(Trans,xn,a);

                    }
                    else if(ChooseValueF==4){
                        xn= OptiAlg.TENT_HS_XN;
                        a= OptiAlg.TENT_HS_A;
                        MainActivity.sv = helpermethotds.TentMap(Trans,xn,a);

                    }
                    else if(ChooseValueF==5){
                        xn= OptiAlg.TENT_SOS_XN;
                        a= OptiAlg.TENT_SOS_A;
                        MainActivity.sv = helpermethotds.TentMap(Trans,xn,a);

                    }
                    else if(ChooseValueF==6){
                        xn= OptiAlg.TENT_GOLD_XN;
                        a= OptiAlg.TENT_GOLD_A;
                        MainActivity.sv = helpermethotds.TentMap(Trans,xn,a);

                    }
                }
                  else {
                    if(ChooseValueF==0){
                        xn= OptiAlg.SINE_PSO_XN;
                        a= OptiAlg.SINE_PSO_A;
                    MainActivity.sv = helpermethotds.SineCalc(Trans,xn,a);

                    }
                    else if(ChooseValueF==1){
                        xn=OptiAlg.SINE_ACO_XN;
                        a= OptiAlg.SINE_ACO_A;
                        MainActivity.sv = helpermethotds.SineCalc(Trans,xn,a);

                    }
                    else if(ChooseValueF==2){
                        xn= OptiAlg.SINE_DE_XN;
                        a= OptiAlg.SINE_DE_A;
                        MainActivity.sv = helpermethotds.SineCalc(Trans,xn,a);

                    }
                    else if(ChooseValueF==3){
                        xn= OptiAlg.SINE_GSA_XN;
                        a= OptiAlg.SINE_GSA_A;
                       MainActivity.sv = helpermethotds.SineCalc(Trans,xn,a);

                    }
                    else if(ChooseValueF==4){
                        xn= OptiAlg.SINE_HS_XN;
                        a= OptiAlg.SINE_HS_A;
                       MainActivity.sv = helpermethotds.SineCalc(Trans,xn,a);

                    }
                    else if(ChooseValueF==5){
                              xn= OptiAlg.SINE_SOS_XN;
                        a= OptiAlg.SINE_SOS_A;
                        MainActivity.sv = helpermethotds.SineCalc(Trans,xn,a);

                    }
                    else if(ChooseValueF==6){
                        xn= OptiAlg.SINE_GOLD_XN;
                        a= OptiAlg.SINE_GOLD_A;
                        MainActivity.sv = helpermethotds.SineCalc(Trans,xn,a);

                    }
                }

                    */
                Key = helpermethotds.XOREncoder(SBX, svv);
                ArrayList<Integer> arrayList = Decoder.Try(Key);
                Bitmap bitmap1 = Decoder.ImageCreateBitmap(arrayList, mutableBitmap);
                Drawable mDrawable = new BitmapDrawable(getResources(), bitmap1);
                 img2.setImageDrawable(mDrawable);
                Bitmap bitmap3 = ((BitmapDrawable) img2.getDrawable()).getBitmap();
                File filepath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
                File dir = new File(filepath.getAbsolutePath());
                dir.mkdirs();
                @SuppressLint("DefaultLocale") String filename = String.format("%d.jpg",System.currentTimeMillis());
                File file = new File(dir,filename);
                try {
                    outputStream = new FileOutputStream(file);

                    bitmap3.compress(Bitmap.CompressFormat.PNG,100,outputStream);
                    outputStream.flush();
                    outputStream.close();
                    Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
                    intent.setData(Uri.fromFile(file));
                    sendBroadcast(intent);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Toast.makeText(getApplicationContext(),"Image Saved disk",Toast.LENGTH_SHORT).show();

           //     img2.setImageBitmap(bitmap1);
               ValueStr.setLength(0);
/*           for (int i = 0; i <256 ; i++) {
                    System.out.print(Trans1.charAt(i)+" ");
                }
                System.out.println();
               StringBuilder result=  helpermethotds.XOREncoder(Trans1,svv);
                for (int i = 0; i <256 ; i++) {
                    System.out.print(svv.charAt(i)+" ");
                }
                System.out.println();
                for (int i = 0; i <256 ; i++) {
                    System.out.print(result.charAt(i)+" ");
                }
                ArrayList<Integer> arrayList = Decoder.Try(result);

            }

 */
            }
        });
        img2 = findViewById(R.id.imgimg);
        img2.setOnClickListener(v -> {
            if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
            } else {
                Intent photo = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(photo, 2);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Intent photo = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(photo, 2);
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2 && resultCode == RESULT_OK && data != null) {
            uri = data.getData();
            img2 = findViewById(R.id.imageView2);
            try {
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                img2.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void openactivty() {


    }

    public static Integer binaryToInteger(String binary) {
        char[] numbers = binary.toCharArray();
        int result = 0;
        int count = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[i] == '1') result += (int) Math.pow(2, count);
            count++;
        }
        return result;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void imageChain(){

            // ValueStr.setLength(0);
            img = findViewById(R.id.imgimg);
            img2 = findViewById(R.id.imageView2);
            ArrayList<Integer> arrayList;
            ArrayList<Integer> arrayList2;
            ArrayList<Integer> arrayListt;

            String text = Long.toString(MemoryFinder());
            text = encrypt.Sha3Algorithm(text);
            String  textx = encrypt.Converty(text);
            System.out.println(textx);
            Bitmap bitmap1 =((BitmapDrawable) img2.getDrawable()).getBitmap();

            Bitmap mutableBitmap = bitmap1.copy(Bitmap.Config.ARGB_8888, true);
            String SelectedValue = textx.substring(0, 128);
            String SelectedValue2 = textx.substring(128, 256);
            String ChooseTransformission = textx.substring(256, 384);
            String ChooseTransformissionf = textx.substring(384, 512);
            int selectablePretty = binaryToInteger(SelectedValue2);
            int selectablePretty1 = binaryToInteger(SelectedValue);
            int ChooseTransformissionInt = binaryToInteger(ChooseTransformission);
            int ChooseValueF = Math.abs(selectablePretty1%7);
            int chosen = Math.abs(selectablePretty%3);
            int ChooseValueFF = Math.abs(ChooseTransformissionInt%4);
            StringBuilder svv= new StringBuilder();
            arrayList2 = binerilization.convertBinaries(bitmap1);
            StringBuilder SBX = binerilization.ConvertBinary(arrayList2);
            double xn;
            double a;
            if (chosen == 0) {
                System.out.println(1);
                if (ChooseValueF == 0) {
                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_PSO_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else  if (ChooseValueF == 1) {
                    System.out.println("ttt");

                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_ACO_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else   if (ChooseValueF == 2) {
                    System.out.println("ttt");

                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;

                    a = OptiAlg.LOG_DE_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else   if (ChooseValueF == 3) {

                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_GSA_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else    if (ChooseValueF == 4) {
                    System.out.println("ttt");

                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_HS_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else  if (ChooseValueF == 5) {
                    System.out.println("ttt");
                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_SOS_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }
                else  {
                    System.out.println("ttt");
                    xn = OptiAlg.CurrentValueCreator(new StringBuilder(ChooseTransformissionf))/1000;
                    a = OptiAlg.LOG_GOLD_A;
                    svv =     helpermethotds.LogCalc(SBX.length(), xn, a);
                }


            }   else if (chosen == 1) {
                System.out.println(2);
                if (ChooseValueF == 0) {
                    xn = OptiAlg.TENT_PSO_XN;
                    a = OptiAlg.TENT_PSO_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);
                }  if (ChooseValueF == 1) {
                    xn = OptiAlg.TENT_ACO_XN;
                    a = OptiAlg.TENT_ACO_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);

                }  if
                (ChooseValueF == 2) {
                    hata = 3;

                    xn = OptiAlg.TENT_DE_XN;
                    a = OptiAlg.TENT_DE_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);

                }  if (ChooseValueF == 3) {
                    hata = 3;
                    xn = OptiAlg.TENT_GSA_XN;
                    a = OptiAlg.TENT_GSA_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);
                }  if (ChooseValueF == 4) {
                    xn = OptiAlg.TENT_HS_XN;
                    a = OptiAlg.TENT_HS_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);

                }  if (ChooseValueF == 5) {
                    xn = OptiAlg.TENT_SOS_XN;
                    a = OptiAlg.TENT_SOS_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);
                }  if (ChooseValueF == 6) {
                    xn = OptiAlg.TENT_GOLD_XN;
                    a = OptiAlg.TENT_GOLD_A;
                    svv =    helpermethotds.TentMap(SBX.length(), xn, a);
                }
            }
            else  {
                System.out.println(3);
                if (ChooseValueF == 0) {
                    xn = OptiAlg.SINE_PSO_XN;
                    a = OptiAlg.SINE_PSO_A;
                    svv= helpermethotds.SineCalc(SBX.length(), xn, a);
                }  if (ChooseValueF == 1) {
                    xn = OptiAlg.SINE_ACO_XN;
                    a = OptiAlg.SINE_ACO_A;
                    svv=       helpermethotds.SineCalc(SBX.length(), xn, a);

                }  if
                (ChooseValueF == 2) {
                    xn = OptiAlg.SINE_DE_XN;
                    a = OptiAlg.SINE_DE_A;
                    svv=       helpermethotds.SineCalc(SBX.length(), xn, a);

                }  if (ChooseValueF == 3) {
                    xn = OptiAlg.SINE_GSA_XN;
                    a = OptiAlg.SINE_GSA_A;
                    svv=       helpermethotds.SineCalc(SBX.length(), xn, a);

                }  if (ChooseValueF == 4) {
                    xn = OptiAlg.SINE_HS_XN;
                    a = OptiAlg.SINE_HS_A;
                    svv=       helpermethotds.SineCalc(SBX.length(), xn, a);

                }  if (ChooseValueF == 5) {
                    hata = 5;
                    xn = OptiAlg.SINE_SOS_XN;
                    a = OptiAlg.SINE_SOS_A;
                    svv=       helpermethotds.SineCalc(SBX.length(), xn, a);
                }  if (ChooseValueF == 6) {
                    hata = 6;
                    xn = OptiAlg.SINE_GOLD_XN;
                    a = OptiAlg.SINE_GOLD_A;
                    svv=helpermethotds.SineCalc(SBX.length(), xn, a);
                }
            }
            StringBuilder str;
            str = helpermethotds.XOREncoder(SBX,svv);
            arrayList = Decoder.Try(str);
            if(ChooseValueFF==0){
                arrayListt=   Decoder.ARrraySplit(arrayList);

            }
            else if(ChooseValueFF==1){
                arrayListt=  Decoder.DArraySplit(arrayList);
            }
            else if(ChooseValueFF==2){

                arrayListt=  Decoder.RDiagonel(arrayList);
            }
            else {
                arrayListt=   Decoder.ZLDiagonel(arrayList);
            }

            Bitmap bitmap =  Decoder.ImageCreateBitmap(arrayListt,mutableBitmap);
        //   img2.setImageDrawable(mDrawable);
            // img2.setImageDrawable(mDrawable);
            //  img2 = findViewById(R.id.imgimg);
            img2.setImageBitmap(bitmap);



    }
}
