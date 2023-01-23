package kootlinfile

class ArrayListdemo {
    fun arraydemo() {
        var array = ArrayList<String>();
        array.add("Abhi");
        array.add("subhi")
        array.get(0);
        for (i in array) {
            print(i);
        }
        array.removeAt(0);
        array.clear()
        array.indexOf("Abhishek") - 1

        var arraylist = arrayListOf<String>("abhi", "amit", "atul")
        var it = array.iterator();
        while (it.hasNext()) {
            print(it.next());
        }
        var hashMap: HashMap<Int, String> = HashMap<Int, String>();
        hashMap.put(1, "delhi");
        hashMap.put(1, "maihar");
        hashMap.get(1);
        hashMap.remove(1);
        hashMap.keys
        hashMap.values
        for (key in hashMap.keys) {
            print("$key")
        }
        hashMap.clear()
        var hashMap2 = hashMapOf<Int,String>(1 to "surya", 2 to "nitin")
        hashMap.containsKey(1)
        hashMap.containsValue("")
    }
}