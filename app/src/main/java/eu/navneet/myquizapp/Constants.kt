package eu.navneet.myquizapp

import androidx.core.content.res.TypedArrayUtils

object Constants {
    fun getQuestion(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(

            1,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina","Australia","Nepal","Austria",
            1


        )
        questionList.add(que1)

        val que2 = Question(

            2,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina","Australia","Nepal","Austria",
            2


        )
        questionList.add(que2)

        val que3 = Question(

            3,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Argentina","India","Nepal","Austria",
            2


        )
        questionList.add(que3)

        val que4 = Question(

            4,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina","Australia","Belgium","Austria",
            3


        )
        questionList.add(que4)
        val que5 = Question(

            5,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark","Australia","Nepal","Austria",
            1


        )
        questionList.add(que5)

        return questionList

    }



}
