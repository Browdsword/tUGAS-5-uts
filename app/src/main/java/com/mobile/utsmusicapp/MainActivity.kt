package com.mobile.utsmusicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Musiclist = listOf<Music>(
            Music(
                R.drawable.avenged,
                "Avenged Sevenfold",
                "Avenged Sevenfold (abbreviated as A7X) is an American heavy metal band from Huntington Beach, California, formed in 1999. The band's current lineup consists of lead vocalist M. Shadows, rhythm guitarist and backing vocalist Zacky Vengeance, lead guitarist and backing vocalist Synyster Gates, bassist and backing vocalist Johnny Christ, and drummer Brooks Wackerman."
            ),

            Music(
                R.drawable.alesana,
                "Alesana",
                "Alesana (/ˌælɪsˈænə/ AL-iss-AN-ə) is an American post-hardcore band from Raleigh, North Carolina. The group was founded by Shawn Milke, Dennis Lee and Patrick Thompson during the fall of 2004, and is currently signed to Revival Recordings and Artery Recordings. Alesana has collectively released three EPs and five full-length studio albums. The band gained a wide audience after their debut, On Frail Wings of Vanity and Wax was released, featuring a musical style shifting between light and heavy sounds along with a wide influence ranging from pop, punk, metal and even classic rock bands such as the Beatles."
            ),

            Music(
                R.drawable.bullet,
                "Bullet for My Valentine",
                "Bullet for My Valentine, often abbreviated as BFMV, are a Welsh heavy metal band from Bridgend, formed in 1998. The band is currently composed of Matthew Tuck (lead vocals, rhythm guitar), Michael Paget (lead guitar, backing vocals), Jason Bowld (drums) and Jamie Mathias (bass guitar, backing vocals). Former members include Michael Thomas, Jason James and Nick Crandle; the latter were on bass."
            ),
            Music(
                R.drawable.burger,
                "Burgerkill",
                "Burgerkill is a metalcore band from the city of Bandung, West Java, initiated since May 11, 1995 by Aries Tanto (commonly called Ebenz) with his school friends. The band's name is taken from an American ready-to-eat restaurant namely Burger King, which they later parodied into \"Burgerkill\". From more than two decades of musical journey, Burgerkill was named Metal as F*ck at the 2013 Metal Hammer Golden Gods Awards in the UK[1] then selected as one of the 50 best metal bands in the world by Metal Hammer magazine in 2020[2][3] and became the only Indonesian band to make the list."
            ),
            Music(
                R.drawable.guns,
                "Guns N' Roses",
                "Guns N' Roses (GNR) is an American hard rock band founded in 1984 and inaugurated in March 1985.\n" +
                        "\n" +
                        "With the most famous personnel Axl Rose - lead vocal (1985-present), Slash - lead guitar (1985-1996,2016-present), Izzy Stradlin - rhythm guitar (1985-1991), Duff McKagan - bass (1985-1998,2016-present) and Steven Adler - drums (1985-1990). Members and founders of guns N Roses are Axl Rose who is a former vocalist of Hollywood Rose and Tracii Guns who is also a former guitarist of L.A Guns. The group, which was founded in Los Angeles, United States, had changed personnel and even guitarist and founder of GNR, namely Tracii Guns, left the group."
            ),
            Music(
                R.drawable.linkin,
                "Linkin Park",
                "Linkin Park is a rock band from the United States. Currently the band is fronted by Mike Shinoda as vocalist / multi-instrumentalist, Brad Delson as guitarist, Dave Farrell as bassist, Joe Hahn as DJ / programmer, and Rob Bourdon as drummer, who is the founder of the band. The former band members are Chester Bennington and Mark Wakefield as lead vocalists as well as bassist Kyle Christner. As an alternative rock band, Linkin Park has experimented in its music and included heavy metal, hard rock, hip hop, pop, and electronica genres"
            ),
            Music(
                R.drawable.metalica,
                "Metallica",
                "Metallica is an American band founded in Los Angeles as The Young of Metal Attack. A few months later the group changed its name to Metallica which is said to be a combination of the words Metal and Vodca. Metallica is actually the name proposed for a music magazine stolen by Lars Ulrich before the magazine got the name.\n" +
                        "\n" +
                        "Metallica's first lineup was Lars Ulrich (drums), James Hetfield (vocals and guitar), Lloyd Grant (guitar) and Ron McGovney (bass). It was this formation that gave birth to the first song titled Hit The Lights, then entered the rock compilation album Metal Massacre in 1981."
            ),
            Music(
                R.drawable.muse,
                "Muse",
                "Muse is an English alternative rock band. The band formed in 1994 with members consisting of Matthew Bellamy (lead vocals, guitar, piano), Christopher Wolstenholme (bass, backing vocals), and Dominic Howard (drums). Muse has a genre of music that combines rock, progressive rock, classical music, and electronics. Muse is also known for its stunning live concerts, characterized by energetic games and awesome visual effects."
            ),
            Music(
                R.drawable.revenge,
                "Revenge",
                "Revenge is a Canadian black metal band formed in 2000 by James Read following the collapse of his previous outfit Conqueror. Revenge's chaotic black metal sound represents a direct continuation of Read's previous band's direction. Although sometimes referred to as war metal the band has never referred to themselves as war metal and has always called themselves black metal, chaotic black metal or black death metal. They have released six full-length albums to date. The band's lyrics explore among other things various militant themes of anti religion, anti humanity, self ascension and the collapse and rebuilding of mankind."
            ),
            Music(
                R.drawable.slipknot,
                "Slipknot",
                "Slipknot is an American heavy metal band formed in Des Moines, Iowa, in 1995 by percussionist Shawn Crahan, drummer Joey Jordison and bassist Paul Gray. After several lineup changes in its early years, the band settled on nine members for more than a decade: Crahan, Jordison, Gray, Craig Jones, Mick Thomson, Corey Taylor, Sid Wilson, Chris Fehn, and Jim Root. Gray died on May 24, 2010, and was replaced during 2011-2014 by guitarist Donnie Steele. Jordison was dismissed from the group on 12 December 2013."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MusicAdapter(this, Musiclist){
            val intent = Intent(this, DetailMusicActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}