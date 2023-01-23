package kootlinfile

class college {
    var clgName = ""
    var clgPlace = ""
    fun displayCollege(){
        println("collage name is $clgName and place is $clgPlace")
    }

    inner class Branch {
        var branchName = ""
        var branchId = 123
        fun displaybranch() {
            println("branch name is $branchName and id is $branchId")
        }
    }

    inner class Student {
        var studentName = ""
        var studentPlace = ""
        fun showStuds() {
            println("Student name is $studentName and place is $studentPlace")
        }
    }

}

fun main(){
    var clgobj = college();
    clgobj.clgName="SATI"
    clgobj.clgPlace="Vidisha"

    var branch = clgobj.Branch()
    branch.branchName = "cse"
    branch.branchId =28399

    var student = clgobj.Student()
    student.studentPlace ="Maihar"
    student.studentName ="Abhishek"

    clgobj.displayCollege()
    branch.displaybranch()
    student.showStuds()
}