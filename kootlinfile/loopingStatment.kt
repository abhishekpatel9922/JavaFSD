package kootlinfile
 fun main(){
     for(i in (1..5)){
         println(i)

     }
     for (i in 1..10 step 2){
         println(i)
     }
     for (i in 10 downTo 1 step 2){
         println(1)
     }
     for (i in 10..1){
         println(i)
     }
     for (i in arrayOf(1,2,3,4,5,6,7,8)){
         println(i)
     }
     var data = arrayOf(1,2,3,4,5,6,7,8);
     for (i in data.indices){
         println(data[i])
     }
     for (i in 1..5){
         for(j in 1..5){
             println("i value $i and j value $j");
                if (j==2){
                    break;
                }
         }
     }
}