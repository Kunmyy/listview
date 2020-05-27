package com.example.listview

import android.app.PendingIntent.getActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listview.adapter.CustomAdapter
import com.example.listview.interfaces.Clicklistener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Clicklistener {

    lateinit var adapter:CustomAdapter
    lateinit var userList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView.adapter = CustomAdapter (userList,this)
        listView.adapter=adapter

        val listView = findViewById<RecyclerView>(R.id.listView)
        listView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    private fun populate() {
        val users=ArrayList<User>()

        users.add(User("The Voice Newspaper", R.drawable.ic_the_voice,"https://thevoicenews.com.ng/"))
        users.add(User("Blueprint Newspaper", R.drawable.ic_blueprint,"https://www.blueprint.ng/"))
        users.add(User("Business Day", R.drawable.ic_business_day,"https://businessday.ng/"))
        users.add(User("Compass Newspaper", R.drawable.ic_compass_news,"https://www.compassnewspaper.com.ng/"))
        users.add(User("Complete Sports", R.drawable.ic_complete_sport,"https://www.completesports.com/"))
        users.add(User("Daily Post", R.drawable.ic_daily_post,"https://dailypost.ng/"))
        users.add(User("Daily Times of Nigeria", R.drawable.ic_daily_times,"https://dailytimes.ng/"))
        users.add(User("Daily Trust", R.drawable.ic_daily_trust,"https://www.dailytrust.com.ng/"))
        users.add(User("Daylight Nigeria", R.drawable.ic_daylight,"https://daylightng.com/"))
        users.add(User("Entertainment Express", R.drawable.ic_express,"https://express.ng/" ))
        users.add(User("Guardian", R.drawable.ic_guardian, "https://guardian.ng/"))
        users.add(User("Independent", R.drawable.ic_guardian , "https://www.independent.ng/"))
        users.add(User("Leadership", R.drawable.ic_leadership, "https://leadership.ng/"))
        users.add(User("Mirror", R.drawable.ic_national_mirror, "https://www.nationalmirror.net/"))
        users.add(User("The Nation", R.drawable.ic_the_nation, "https://thenationonlineng.net/"))
        users.add(User("National Network", R.drawable.ic_national_network, "https://nationalnetworkonline.com/en/"))
        users.add(User("Punch", R.drawable.ic_punch, "https://punchng.com/"))
        users.add(User("Sahara Reporters", R.drawable.ic_sahara, "https://saharareporters.com/"))
        users.add(User("Tribune", R.drawable.ic_tribune, "https://tribuneonlineng.com/"))
        users.add(User("Vanguard", R.drawable.ic_vanguard, "https://www.vanguardngr.com/"))
        users.add(User("Premium Times", R.drawable.ic_premium_times, "https://www.premiumtimesng.com/"))
        users.add(User("Osun Defender", R.drawable.ic_osun, "https://www.osundefenders.com/"))
        users.add(User("P.M. News", R.drawable.ic_pm_news, "https://www.pmnewsnigeria.com/"))
        users.add(User("Peoples Daily", R.drawable.ic_peoples_daily, "https://www.peoplesdailyng.com/"))
        users.add(User("Observer", R.drawable.ic_observer, "https://nigerianobservernews.com/"))
        users.add(User("Newswatch", R.drawable.ic_news_watch, "https://www.newswatch.ng/"))
        users.add(User("New Telegraph", R.drawable.ic_new_telegraph, "https://www.newtelegraphng.com/"))
        users.add(User("Nigerian Entertainment Today", R.drawable.ic_net, "https://thenet.ng/"))
        users.add(User("Tell Magazine", R.drawable.ic_tell, "https://tell.ng/"))
        users.add(User("Thisday", R.drawable.ic_this_day, "https://www.thisdaylive.com/"))
        users.add(User("The Sun", R.drawable.ic_the_sun, "https://www.sunnewsonline.com/?p=*****"))

    }

    override fun setOnClickListener(url: String) {
        showWebView(url)
    }
}
