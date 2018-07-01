package com.example.android.gridtesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView ques ;
    private RadioGroup radioGrp;
   // private RadioButton radioButton;
    private RadioButton radioOption1;
    private RadioButton radioOption2;
    private RadioButton radioOption3;
    private RadioButton radioOption4;
    Button quesNext ;


    //ArrayList<String> QUESTIONS = new ArrayList<String>();

   // ArrayList[][]  ANSWERS = new ArrayList[4][4];

    // ArrayList<String>  Correct_Answers = new ArrayList<String>();


    String [] QUESTIONS = { "The first expression in a for loop is?",
                             "Break statement is used for ?",
                              "Continue statement used for ?",
                           "Due to variable scope in c"};

    String [][] ANSWERS = {{"Step value of loop","Value of the counter variable","Any of above","None of above"},
                        {"Quit a program", "Quit the current iteration", "Both of above", "None of above"},
            {"To continue to the next line of code", "To stop the current iteration and begin the next iteration from the beginning",
                    "To handle run time error", "None of above"},
            {"Variables created in a function cannot be used another function", "Variables created in a function can be used in another function",
                    "Variables created in a function can only be used in the main function", "None of above"}};

   int [] Correct_Answers = {R.id.radioOption2,R.id.radioOption2,R.id.radioOption2,R.id.radioOption1};

   /* String [] Correct_Answers = {"Value of the counter variable",
                               "Quit the current iteration",
             "To stop the current iteration and begin the next iteration from the beginning",
             "Variables created in a function cannot be used another function"};
*/
    // ArrayList<String> recieved_answers;

   private int correctCount ;
   private int incorrectCount;
   private int quesId ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correctCount = 0 ;
        incorrectCount =0 ;
          quesId = 0;
        /*ques = findViewById(R.id.ques);
        quesNext = findViewById(R.id.quesNext);
        radioGrp = findViewById(R.id.radioGrp);
        radioOption1 = findViewById(R.id.radioOption1);
        radioOption2 = findViewById(R.id.radioOption2);
        radioOption3 = findViewById(R.id.radioOption3);
        radioOption4 = findViewById(R.id.radioOption4);
        Log.d("Entering onCreate","I am inside");
        setQuestAndAns(quesId);
*/        init();

       // userSubmit(quesId);
    }

    // ==== initialise === ///

    public void init()
    {
        ques = findViewById(R.id.ques);
        quesNext = findViewById(R.id.quesNext);
        radioGrp = findViewById(R.id.radioGrp);
        radioOption1 = findViewById(R.id.radioOption1);
        radioOption2 = findViewById(R.id.radioOption2);
        radioOption3 = findViewById(R.id.radioOption3);
        radioOption4 = findViewById(R.id.radioOption4);
        Log.d("Entering init","I am inside");
        setQuestAndAns(quesId);

    }

    // ====  takes the input ==== //
    public void userSubmit(final int quesId) {

        Log.d("Entering userSubmit","I am inside"+quesId);

              int usranswer = radioGrp.getCheckedRadioButtonId();

             /* ques.setText(QUESTIONS[quesId]);
               radioOption1.setText(ANSWERS[quesId][0]);
               radioOption2.setText(ANSWERS[quesId][1]);
               radioOption3.setText(ANSWERS[quesId][2]);
               radioOption4.setText(ANSWERS[quesId][3]);
*/
                  //(radioGrp.getCheckedRadioButtonId())
              /*radioButton = findViewById(usranswer);
              Log.d("text ","="+radioButton.getText());
              String text = radioButton.getText().toString();
              if(text==Correct_Answers[quesId])
              {
                  correctCount++;
                  Log.d("Ok I am Correct","Here I am moving a head");
              }
              else
              {
                  incorrectCount++;
                  Log.d("Ok I am InCorrect","Here I am moving a head");
              }*/

              //=============
             /* String text = radioBu.toString();

              Log.d("text  ","="+text);
          //   quesId = 0 ;
                            //  for (quesId = 0; quesId < Correct_Answers.length; quesId++) {

                  if(text==Correct_Answers[quesId])
                  {
                      correctCount++;
                      Log.d("Ok I am Correct","Here I am moving a head");
                  }
                  else
                  {
                      incorrectCount++;
                      Log.d("Ok I am InCorrect","Here I am moving a head");
                  }*/
            if (usranswer==Correct_Answers[quesId]) {
                correctCount++;
                Log.d("usranswer","="+usranswer);
                Log.d("Correct_Answer 0","="+Correct_Answers[quesId]);

               Log.d("Ok I am Correct","Here I am moving a head");

            }
            else
                { incorrectCount++;
               Log.d("Ok I am InCorrect","Here I am moving a head");
            }
            quesNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        int tmp =  (quesId)+1;
                    Toast.makeText(MainActivity.this, "Button is clicked", Toast.LENGTH_SHORT).show();
                           setQuestAndAns(tmp);

                    Log.d("Exiting userSubmit","I am outside");
                }
            });
         // }
        Log.d("Exiting all stmt","byeee"+correctCount+incorrectCount);
    }

    // ======== set the ques and ans === //
   public void setQuestAndAns(int quesId)
   {
       //Log.d("Entering setQuestAndAns","I am inside");
      // for(quesId=0;quesId<QUESTIONS.length;quesId++) {

           Log.d("Entering inside loop ","I am inside"+quesId);
           Log.d("quesId ","="+quesId);
           Log.d("QUESTIONS.length ","="+QUESTIONS.length);
       if(quesId <QUESTIONS.length)
       {
           /*QUESTIONS.add("The first expression in a for loop is?");
           QUESTIONS.add("Break statement is used for ?");
           QUESTIONS.add("Continue statement used for ?");
           QUESTIONS.add("Due to variable scope in c");*/

           /*ANSWERS[0][0] = new ArrayList();

           ANSWERS.add("\"Step value of loop\",\"Value of the counter variable\",\"Any of above\",\"None of above\"");
           ANSWERS.add("");
           ANSWERS.add("");
           ANSWERS.add("");*/

          /* Correct_Answers.add("");
           Correct_Answers.add("");
           Correct_Answers.add("");
           Correct_Answers.add("");*/

          ques.setText(QUESTIONS[quesId]);
               radioOption1.setText(ANSWERS[quesId][0]);
               radioOption2.setText(ANSWERS[quesId][1]);
               radioOption3.setText(ANSWERS[quesId][2]);
               radioOption4.setText(ANSWERS[quesId][3]);

       userSubmit(quesId);
       }
   }
}
