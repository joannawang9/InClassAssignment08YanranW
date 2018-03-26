/**
 * Created by joan on 3/23/18.
 */
package com.example.android.inclassassignment08_yanranw;

import android.content.Context;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;

import com.example.android.inclassassignment08_yanranw.R;

public class QuestionViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView questionCountry;
    public TextView countryQuestion;
    public ImageView countryImage;

    public QuestionViewHolder(View itemView, final Context context){
        super(itemView);
        cardView = (CardView)itemView.findViewById(R.id.card_view_country);
        questionCountry = (TextView)itemView.findViewById(R.id.question_country);
        countryQuestion = (TextView)itemView.findViewById(R.id.country_question);
        countryImage = (ImageView)itemView.findViewById(R.id.country_image);

        }}


