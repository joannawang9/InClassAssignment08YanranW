package com.example.android.inclassassignment08_yanranw;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.android.inclassassignment08_yanranw.Question;
import com.example.android.inclassassignment08_yanranw.QuestionViewHolder;

import java.util.List;

/**
 * Created by joan on 3/23/18.
 */

public class QuestionAdapter extends RecyclerView.Adapter<QuestionViewHolder> {
    private List<Question> questions;
    private Context context;

    public QuestionAdapter(List<Question>questions, Context context){
        this.questions = questions;
        this.context = context;
    }
    @Override
    public QuestionViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_cournty, parent,false);
        return new QuestionViewHolder(view,context);
    }
    @Override
    public void onBindViewHolder (QuestionViewHolder holder, int position){
        final Question question = questions.get(position);
        holder.questionCountry.setText(question.location);
        holder.countryQuestion.setText(question.question);
        holder.countryImage.setImageResource(question.photoId);
        holder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (question.isTrue()){
                    Toast.makeText(context,"True",Toast.LENGTH_SHORT).show();
                }
                else { Toast.makeText(context,"False",Toast.LENGTH_SHORT).show();}}});}

    public int getItemCount(){
        return questions.size();
    }
}
