package Mentoring6_AccessMethods_MultipleClasses.b_CumleBolme;

public class textClass {

        String text1 ="techno study avrupa sınıfı";
        String text2 ="Java kursu devam ediyor";


        public  String ilkYarisi(String text){
                int baslangic =0;

                int ortasi=text.length()/2;

                return text.substring(baslangic,ortasi);

        }

        public String ikinciYarisi(String text){

                int ortasi =text.length()/2;

                return text.substring(ortasi);
        }


        }



