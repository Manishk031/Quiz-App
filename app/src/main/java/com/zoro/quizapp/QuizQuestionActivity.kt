package com.zoro.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionActivity : AppCompatActivity()

{
    private var progressBar : ProgressBar? =null
    private var tvProgressBar:TextView?=null
    private var ivImage:ImageView?=null
    private var tvQuestion:TextView?=null


    private var tvOptionOne: TextView?=null
    private var tvOptionTwo: TextView?=null
    private var tvOptionThree: TextView?=null
    private var tvOptionFour: TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)


        progressBar=findViewById(R.id.ProgressBar)
        tvProgressBar=findViewById(R.id.tv_progress)
        ivImage=findViewById(R.id.iv_image)
        tvQuestion=findViewById(R.id.tv_question)
        tvOptionOne=findViewById(R.id.tv_option_one)
        tvOptionTwo=findViewById(R.id.tv_option_two)
        tvOptionThree=findViewById(R.id.tv_option_three)
        tvOptionFour=findViewById(R.id.tv_option_four)




        val questionList = Constants.getQuestions()
        Log.i("QuestionList Size is" , "${questionList.size}")
    }
}