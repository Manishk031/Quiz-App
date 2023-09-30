package com.zoro.quizapp

object Constants {


    fun getQuestions(): ArrayList<Question>{


        val questionList = ArrayList<Question>()

         val ques1 = Question(
             1,"What country does this flag belong to?",
             R.drawable.ic_flag_of_india,
             "India", "SriLanka","Japan"," China", 1
         )
        questionList.add(ques1)

        // val 2
        val ques2 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_nepal,
            "China", "Russia","New York","Nepal", 4
        )
        questionList.add(ques2)

        //val 3
        val ques3 = Question(
            1,"What country does this flag belong to?",
            R.drawable.ic_flag_of_russsia,
            "Samoa", "Russia","Egypt","Argentina", 2
        )
        questionList.add(ques3)
        // val 4
        val ques4 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_pakistan,
            "Pakistan", "San Marino", " Romania","Peru",1
        )
        questionList.add(ques4)
        // val 5
        val ques5 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_china,
            "China", "India", "Poland","None of these",1)
        questionList.add(ques5)

        // val 6
        val ques6 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_palau,
            "Peru", "Paula", "Poland","Portugal",2)
              questionList.add(ques6)
             // val 7
        val ques7 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Nepal", "Norway", "Kuwait","None of these",3)
        questionList.add(ques7)
      // val 8
        val ques8 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_republicofchina,
            "Samoa", "Myanmar", "Pakistan","Republic Of China",4)
            questionList.add(ques8)
         //val 9
        val ques9 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_newzealand,
            "Australia", "New Zealand", "Anguilla","Andorra",2)
     questionList.add(ques9)
       // val 10
        val ques10 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_thailand,
            "India", "Thailand", "Egypt","None of these",2)
             questionList.add(ques10)


            return questionList

    }



}