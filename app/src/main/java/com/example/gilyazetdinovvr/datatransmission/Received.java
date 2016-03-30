package com.example.gilyazetdinovvr.datatransmission;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Received extends AppCompatActivity {
    private TextView mReceivedTextView;
    private TextView mSenderReceivedTextView;
    private String mUser;
    private String mGift;
    private String mSender;
    public final static String USER = "com.example.gilyazetdinovvr.datatransmission.USER";
    public final static String MESSAGE = "com.example.gilyazetdinovvr.datatransmission.MESSAGE";
    public final static String SENDER = "com.example.gilyazetdinovvr.datatransmission.SENDER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mUser = getIntent().getStringExtra(USER);
        mGift = getIntent().getStringExtra(MESSAGE);
        mSender = getIntent().getStringExtra(SENDER);
        mReceivedTextView = (TextView)findViewById(R.id.receivedTextView);
        mSenderReceivedTextView = (TextView)findViewById(R.id.senderTextView);
        mReceivedTextView.setText(mUser + ", вам передали " + mGift);
        mSenderReceivedTextView.setText("С уважением, " + mSender);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
