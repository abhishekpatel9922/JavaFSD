package kootlinfile
import java.io.File
import java.io.FileInputStream
import java.sql.*


class JdbcDemo {
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
    fun createTableUsingStatement(){
        var stm:Statement?=null;
        var sql ="create table demo2(id int not null auto_increment,name varchar(255), age int not null, primary key(id));"
        try {
            stm=conn!!.createStatement();
            stm.execute(sql);
            print("table is create")
        }catch (e:SQLException){
            print(e)
        }

    }

    fun createTable(){
        var prestat:PreparedStatement?=null
        var sql ="create table demo(id int not null auto_increment,name varchar(255), age int not null, primary key(id));"
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
    fun insertIntoTable(){
        println("insert data")
        var preStat:PreparedStatement?=null
        var sql =  "insert into demo(name,age) values(?,?);"
        try {
            preStat=conn!!.prepareStatement(sql);
            println("enter username")
            preStat.setString(1, readLine())
            println("enter user age")
            var age = readLine()!!.toInt()
            preStat.setInt(2,age)


            var status =preStat.executeUpdate();
            if (status==0){
                print(" data insert into table")
            }


        }catch (e:SQLException){
            print(e)
        }
    }
    fun update(){
        var preStat:PreparedStatement?=null
        var sql = "update demo SET where id = ?";
        try {
            preStat=conn!!.prepareStatement(sql)
            var name = readLine()
            preStat.setString(1,name)
            var id = readLine()!!.toInt()
            preStat.setInt(2,id)
            var status=preStat.executeUpdate();
            if(status>0){
                println("table is update")

            }
        }catch (e:SQLException){
            println(e)
        }
    }
    fun deleteData(){
        var preStat:PreparedStatement?=null
        var sql = "DELETE FROM demo where id = ?";
        try {
            preStat=conn!!.prepareStatement(sql)
            var id = readLine()!!.toInt()
            preStat.setInt(1,id)
            var status=preStat.executeUpdate();
            if(status>0){
                println("table is update")

            }
        }catch (e:SQLException){
            println(e)
        }

    }
    fun dropTable(){
        var preStat:PreparedStatement?=null
        var sql ="DROP TABLE ?"
        try {
            preStat=conn!!.prepareStatement(sql)
            var name = readLine()
            preStat.setString(1,name)

            var status =preStat.executeUpdate();
            if(status>0){
                print("tables is drop");

            }
        }catch (e:SQLException){
            print(e)
        }

    }
    fun truncateTable(){
        var prestat:PreparedStatement?=null
        var sql ="TRUNCATE TABLE ?"
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
    fun insertImage(){
        var preStat:PreparedStatement?=null
        var sql = "insert into demo(imagename, image) value(?,?);"
        try {
            var ImageFile:File=File("image1.png");
            var readImageFile = FileInputStream(ImageFile)
            preStat=conn!!.prepareStatement(sql)
            preStat.setString(1,"demo")
            preStat.setBinaryStream(2,readImageFile)
            preStat.executeUpdate();
        }catch (e:Exception){
            println(e)
        }
    }


    fun connectionClose() {
        if (conn != null) {
        }
    }

//    fun excuteQueryOfDataBase() {
//        var stm: Statement? = null
//        var res: ResultSet? = null
//        var id = readLine()!!.toInt();
//        var sql = "select * from accounttables;"
//       // var sql = "select * from account where bankid>"+id+";"
//
//        try {
//            stm = conn!!.createStatement()
//
//
//            //print(res)
//            res = stm!!.executeQuery(sql);
//            //print(res)
//            while (res!!.next()) {
//                println(res.getString("Tables_in_banksystem"))
//                }
//
//        } catch (e: SQLException) {
//            print(e)
//
//        } finally {
//            try {
//                res!!.close()
//                conn!!.close()
//            } catch (e: SQLException) {
//                print(e)
//            }
//        }
//


}

fun main(){
    var jdbcObj = JdbcDemo();
    jdbcObj.createConnection()
    //jdbcObj.excuteQueryOfDataBase()
    //jdbcObj.createTable()
    //jdbcObj.createTableUsingStatement()
    jdbcObj.insertIntoTable()
}