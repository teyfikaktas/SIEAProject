package com.example.crpito;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.crpito.User.User;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Properties;

public class RgractivityActivity extends AppCompatActivity {
    TextInputEditText username;
    TextInputEditText pass;
    public static FirebaseAuth firebaseAuth;
    public static FirebaseUser firebaseUser;
    TextInputEditText passs;
    TextInputEditText usernamee;
    ProgressDialog progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rgractivity);


        findViewById(R.id.lgn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
                progressBar = new ProgressDialog(RgractivityActivity.this);
                progressBar.show();
                progressBar.setContentView(R.layout.progress);
                progressBar.setCancelable(false);

                progressBar.getWindow().setBackgroundDrawableResource(
                        android.R.color.transparent
                );
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progressBar.cancel();
                    }
                },2000);
                final String usernameee="aktasteyf@gmail.com";
                final String passwordd = "T.aktas22";
                String message = "Bu bir test mesajidir eger " +
                        "ben bunu basarabilirsem uygulamam otomatik " +
                        "olarak mail atmistir tesekkurler.";
                Properties properties = new Properties();
                properties.put("mail.smtp.auth","true");
                properties.put("mail.smtp.starttls.enable","true");
                properties.put("mail.smtp.host","smtp.gmail.com");
                properties.put("mail.smtp.port","587");
                Session session = Session.getInstance(properties, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return  new PasswordAuthentication(usernameee,passwordd);
                    }

                });
        /*        try {
                    Message message1 = new MimeMessage(session);
                    message1.setFrom(new InternetAddress(usernameee));
                    message1.setRecipients(Message.RecipientType.TO,InternetAddress.parse("teyfikaktas@outlook.com"));
                    message1.setSubject("TEST");
                    message1.setText(message);
                    Transport.send(message1);

                } catch (AddressException e) {
                    e.printStackTrace();
                } catch (MessagingException e) {
                    e.printStackTrace();
                }
*/
                username = findViewById(R.id.et_mail);
                pass = findViewById(R.id.et_pass);
                String usernamee = username.getText().toString();
                String passs = pass.getText().toString();
                firebaseAuth = FirebaseAuth.getInstance();
                if(!TextUtils.isEmpty(usernamee)&&!TextUtils.isEmpty(passs)){
                    firebaseAuth.signInWithEmailAndPassword(usernamee,passs).addOnSuccessListener(RgractivityActivity.this
                            , new OnSuccessListener<AuthResult>() {
                                @Override
                                public void onSuccess(AuthResult authResult) {
                                    Intent intent = new Intent(RgractivityActivity.this,MainActivity.class);
                                    startActivity(intent);
                                    firebaseUser = firebaseAuth.getCurrentUser();
                                    System.out.println();
                                }
                            }).addOnFailureListener(RgractivityActivity.this, new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            System.out.println("failure");
                        }
                    });
                }            }
        });
    }
}