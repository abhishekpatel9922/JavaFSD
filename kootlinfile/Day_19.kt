package kootlinfile

import java.sql.*

class Day_19 {
    var conn: Connection? = null;
    fun createConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "Abhishek@7693")
            if (conn != null) {
                print("connection done")
            }
            print("connect")
        } catch (e: SQLException) {
            print(e)

        }
    }
    fun createTable(){
        var prestat: PreparedStatement?=null
        var sql ="create table demo5(id int not null auto_increment,name varchar(255), age int not null, primary key(id));"
        try {
            prestat=conn!!.prepareStatement(sql);
            var status =prestat.executeUpdate();
            if(status>0){
                print("tables is create");

            }
        }catch (e:SQLException){
            print(e)
        }


    }
    fun insertIntoTable() {
        println("insert data")
        var preStat: PreparedStatement? = null
        var sql = "insert into demo(name,age) values(?,?);"
        try {
            preStat = conn!!.prepareStatement(sql);
            println("enter username")
            preStat.setString(1, readLine())
            println("enter user age")
            var age = readLine()!!.toInt()
            preStat.setInt(2, age)


            var status = preStat.executeUpdate();
            if (status == 0) {
                print(" data insert into table")
            }


        } catch (e: SQLException) {
            print(e)
        }
    }
    fun Search(){
        var stm:Statement?=null
        var res:ResultSet?=null
        println("Enter id:")
        var searchId = readLine()!!.toInt()
        var sql = "select * from demo5 where id = $searchId;"
        try {
            stm =conn!!.createStatement()
            println(res)
            res = stm!!.executeQuery(sql)
            while (res!!.next()){
                print("${res.getInt("id")}\t")
                print("${res.getInt("name")}\t")
                print("${res.getInt("age")}\t\n")


            }
        }catch (e:SQLException){
            println(e)
        }finally {
            if (res!=null){
                try {
                    res.close()
                    conn!!.close()
                }catch (e:SQLException){
                    println(e)
                }
            }
        }

    }

}
fun main(){
    var obj = Day_19();
    obj.createConnection();
    loop@ while (true) {
        println("\ncreate table:1\n insert table:2\n search:3 ")
        var num = readLine()!!.toInt()
        when (num) {
            1 -> obj.createTable()
            2 -> obj.insertIntoTable()
            3 -> obj.Search()
            4 -> break@loop
            else -> println("please enter vailed number")
        }
    }


}