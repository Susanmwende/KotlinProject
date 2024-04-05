import java.awt.font.NumericShaper.Range
import java.util.*

//Main function,Entry point of program
fun main(arr:Array<String>){

    //Array of subject names
    val subjectNames = arrayOf<String>("Kotlin","UXResearch" ,"UIDesign","Javascript","Python","Data Science","Product Management" )

//used to take inputs

    val scanner = Scanner(System.`in`)

  // Declare array to contain all the subjects
    val marksArray = DoubleArray(7)

    // start  input subjects marks
    println("Input Marks ->")
     for (i in marksArray.indices){
         print("${subjectNames[i]} :" )
         marksArray[i] = scanner.nextDouble()
     }
//calculate total marks in all subjects
val total = marksArray.sum()

//calculate percentage
    val percentage = marksArray.average()
    //print total and percentage
    println("Total subjects marks:$total")
    println("percentage:$percentage")


    when {
        percentage>= 100 -> println("Distiction")
        percentage >= 75 -> println("excellent")
        percentage>= 69-> println("Credit")
        percentage >= 49 -> println("Pass")
        else -> println("Fail")






    }
}