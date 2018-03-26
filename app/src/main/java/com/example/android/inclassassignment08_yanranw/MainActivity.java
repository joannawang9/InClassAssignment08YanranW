package com.example.android.inclassassignment08_yanranw;

import android.support.v7.app.AppCompatActivity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.inclassassignment08_yanranw.QuestionAdapter;
import com.example.android.inclassassignment08_yanranw.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<com.example.android.inclassassignment08_yanranw.Question> questions;
    RecyclerView recyclerView;
    QuestionAdapter questionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initialData();

        try {
            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            questionAdapter = new QuestionAdapter(questions,this);
            recyclerView.setAdapter(questionAdapter);}
            catch (Exception e){return;}



    }
    private void initialData() {
        questions = new ArrayList<>();
        questions.add(new com.example.android.inclassassignment08_yanranw.Question(R.string.australia, R.string.question_australia, R.drawable.australia, true));
        questions.add(new com.example.android.inclassassignment08_yanranw.Question(R.string.africa, R.string.question_africa, R.drawable.africa, false));
        questions.add(new com.example.android.inclassassignment08_yanranw.Question(R.string.asia, R.string.question_asia, R.drawable.asia, true));
        questions.add(new com.example.android.inclassassignment08_yanranw.Question(R.string.mideast, R.string.question_mideast, R.drawable.mideast, false));
        questions.add(new com.example.android.inclassassignment08_yanranw.Question(R.string.oceans, R.string.question_oceans, R.drawable.oceans, true));
        questions.add(new com.example.android.inclassassignment08_yanranw.Question(R.string.americas, R.string.question_americas, R.drawable.americas, true));
    }

}




