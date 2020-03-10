    # আমরা কিভাবে আমাদের অ্যাপ্লিকেশান এর মধ্যে একটা ListView যুক্ত করতে পারি :
        ListView তৈরি করার সিস্টেম :
          ১। প্রথমেই আমাদের xml ফাইল তৈরি করে নিতে হবে এবং একটা id দিতে হবে - 
          ২। আমাদের প্রথমেই id টাকে আমাদের ক্লাস এর মধ্যে নিয়ে আসতে হবে
          ৩। আমরা যেই ডাটা listview এর মধ্যে দেখতে চাই সেটাকে একটা ArrayList এর মধ্যে আনতে হবে 
          ৪। আমাদের একটা ArrayAdapter তৈরি করতে হবে যেটা কিছু parameter নিবে যেমন - 
              ```java 
                      ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                          MainActivity.this, android.R.layout.simple_list_item_2, arrayList
                      );
                      // MainActivity.this -> আমরা যেই context এ আছি সেটা
                      // android.R.layout.simple_list_item_1 -> ডিফল্ট view, listview এর
                      // arrayList -> ডাটা এর উৎস
              ```
              ৫। ধাপ ২ থেকে পাওয়া variable এর সাথে আমাদের ArrayAdapter এর সেট করে দিতে হবে -
              ```java
                listView.setAdapter(arrayAdapter);
              ```
              ৬। এখন আমরা চাই যখন একটা লিস্ট এর আইটেম এ ক্লিক করা হবে তখন একটা Toast দেখাবে এর জন্যে
              ```java
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                  @Override
                  public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                      Toast.makeText(MainActivity.this, arrayList.get(position), Toast.LENGTH_SHORT).show();
                  }
                  // MainActivity.this -> এখানে this দিলে হবে না সম্পূর্ণ context দিতে হবে 
                  // arrayList.get(position) -> লিস্ট এর ওই position এ থাকা element এর নাম দেখাবে
                });
              ```
