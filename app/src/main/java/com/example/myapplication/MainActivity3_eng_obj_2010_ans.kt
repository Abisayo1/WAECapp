package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main_activity3_eng_obj_2010_ans.*
import kotlinx.android.synthetic.main.activity_main_activity3_eng_obj_2010_ans.tabLayout
import kotlinx.android.synthetic.main.activity_main_activity3_eng_obj_2010_ans.view_pager

class MainActivity3_eng_obj_2010_ans : AppCompatActivity() {
    private lateinit var liste: ArrayList<englishObj2010>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity3_eng_obj_2010_ans)
        loadCards()

        TabLayoutMediator(tabLayout, view_pager) { tab, position ->
            //To get the first name of doppelganger celebrities
            tab.text = "${position + 1}"
        }.attach()
    }

    private fun loadCards() {
        liste = ArrayList()
        liste.add(englishObj2010(1, getText(R.string.Question1), 0, "(A)\t ugly", "(B)\t meagre", "(C)\t modest", "(D)\t lowly", 2, 0, null))
        liste.add(englishObj2010(2, getText(R.string.Question2), 0, "(A)\t neglect", "(B)\t ignorance", "(C)\t poverty", "(D)\t obscurity", 4, 0, null))
        liste.add(englishObj2010(3, getText(R.string.Question3), 0, "(A)\t apprentice", "(B)\t probationer", "(C)\t newcomer", "(D)\t veteran", 4, 0, null))
        liste.add(englishObj2010(4, getText(R.string.Question4), 0, "(A)\t minute", "(B)\t crucial", "(C)\t compulsory", "(D)\t marvellous", 2, 0, null))
        liste.add(englishObj2010(5, getText(R.string.Question5), 0, "(A)\t flexible", "(B)\t frank", "(C)\t irresponsible", "(D)\t careless", 1, 0, null))
        liste.add(englishObj2010(6, getText(R.string.Question6), 0, "(A)\t clear", "(B)\t turgid", "(C)\t timid", "(D)\t incoherent", 4, 0, null))
        liste.add(englishObj2010(7, getText(R.string.Question7), 0, "(A)\t unfaithful", "(B)\t unkind", "(C)\t selfish", "(D)\t hostile", 1, 0, null))
        liste.add(englishObj2010(8, getText(R.string.Question8), 0, "(A)\t blamed", "(B)\t dismissed", "(C)\t upheld", "(D)\t acquitted", 4, 0, null))
        liste.add(englishObj2010(9, getText(R.string.Question9), 0, "(A)\t dividing", "(B)\t destroying", "(C)\t separating", "(D)\t isolating", 3, 0, null))
        liste.add(englishObj2010(10, getText(R.string.Question10), 0, "(A)\t persisted", "(B)\t deteriorated", "(C)\t deepened", "(D)\t decreased", 2, 0, null))
        liste.add(englishObj2010(11, getText(R.string.Question11), 0, "(A)\t communal", "(B)\t individual", "(C)\t mutual", "(D)\t personal", 3, 0, null))
        liste.add(englishObj2010(12, getText(R.string.Question12), 0, "(A)\t alternatively", "(B)\t simultaneously", "(C)\t consecutively", "(D)\t separately", 2, 0, null))
        liste.add(englishObj2010(13, getText(R.string.Question13), 0, "(A)\t lengthy", "(B)\t current", "(C)\t lasting", "(D)\t strong", 3, 0, null))
        liste.add(englishObj2010(14, getText(R.string.Question14), 0, "(A)\t distraction", "(B)\t commotion", "(C)\t confusion", "(D)\t rivalry", 4, 0, null))
        liste.add(englishObj2010(15, getText(R.string.Question15), 0, "(A)\t literally", "(B)\t simply", "(C)\t frankly", "(D)\t directly", 4, 0, null))
        liste.add(englishObj2010(16, getText(R.string.Question16), 0, "(A)\t clarity", "(B)\t authenticity", "(C)\t formality", "(D)\t simplicity", 2, 0, null))
        liste.add(englishObj2010(17, getText(R.string.Question17), 0, "(A)\t picture", "(B)\t appearance", "(C)\t expression", "(D)\t sight", 3, 0, null))
        liste.add(englishObj2010(18, getText(R.string.Question18), 0, "(A)\t inspired", "(B)\t generated", "(C)\t conceived", "(D)\t revealed", 3, 0, null))
        liste.add(englishObj2010(19, getText(R.string.Question19), 0, "(A)\t hold-up", "(B)\t blockade", "(C)\t stand still", "(D)\t suspense", 3, 0, null))
        liste.add(englishObj2010(20, getText(R.string.Question20), 0, "(A)\t memoranda", "(B)\t decisions", "(C)\t resolutions", "(D)\t actions", 3, 0, null))
        liste.add(englishObj2010(21, getText(R.string.Question21), 0, "(A)\t were always angry with each other", "(B)\t always wore daggers", "(C)\t were good at drawing daggers", "(D)\t were fighting everybody", 1, 0, null))
        liste.add(englishObj2010(22, getText(R.string.Question22), 0, "(A)\t the corners of the pages of my book are crumpled", "(B)\t my book is designed like dog's ears", "(C)\t my book is torn", "(D)\t my book is indispensable", 3, 0, null))
        liste.add(englishObj2010(23, getText(R.string.Question23), 0, "(A)\t a kind of capitalist", "(B)\t a thoughtful capitalist", "(C)\t an old capitalist", "(D)\t an unbending capitalist;", 4, 0, null))
        liste.add(englishObj2010(24, getText(R.string.Question24), 0, "(A)\t respect me", "(B)\t hate herself", "(C)\t apologize", "(D)\t be ashamed", 4, 0, null))
        liste.add(englishObj2010(25, getText(R.string.Question25), 0, "(A)\t about buying things from the shop", "(B)\t about their job", "(C)\t all the time", "(D)\t about taking me to the shop", 3, 0, null))
        liste.add(englishObj2010(26, getText(R.string.Question26), 0, "(A)\t yielded positive results", "(B)\t cost him a lot of money", "(C)\t was unsuccessful", "(D)\t caused him some trouble", 1, 0, null))
        liste.add(englishObj2010(27, getText(R.string.Question27), 0, "(A)\t always paints her fingers green", "(B)\t is good at growing plants", "(C)\t turns everything she touches to green", "(D)\t likes keeping green objects", 2, 0, null))
        liste.add(englishObj2010(28, getText(R.string.Question28), 0, "(A)\t father's ill health would have made me to visit you", "(B)\t father's ill health prevented me from visiting you", "(C)\t father threatened to fall ill if I visited you", "(D)\t father did not fall ill, so I couldn't visit you.", 2, 0, null))
        liste.add(englishObj2010(29, getText(R.string.Question29), 0, "(A)\t become more economical", "(B)\t adjusted her belt", "(C)\t become very aggressive", "(D)\t become very greedy", 1, 0, null))
        liste.add(englishObj2010(30, getText(R.string.Question30), 0, "(A)\t prepare hard for them", "(B)\t do not worry about them", "(C)\t find them insurmountable", "(D)\t are familiar with them", 2, 0, null))
        liste.add(englishObj2010(31, getText(R.string.Question31), 0, "(A)\t a lasting", "(B)\t an immediate", "(C)\t a terrifying", "(D)\t a momentous", 2, 0, null))
        liste.add(englishObj2010(32, getText(R.string.Question32), 0, "(A)\t fine", "(B)\t strange", "(C)\t strong", "(D)\t tired", 4, 0, null))
        liste.add(englishObj2010(33, getText(R.string.Question33), 0, "(A)\t ignores", "(B)\t denies", "(C)\t snubs", "(D)\t rejects", 4, 0, null))
        liste.add(englishObj2010(34, getText(R.string.Question34), 0, "(A)\t affluence", "(B)\t sincerity", "(C)\t charity", "(D)\t association", 3, 0, null))
        liste.add(englishObj2010(35, getText(R.string.Question35), 0, "(A)\t unhelpful", "(B)\t unimportant", "(C)\t harmful", "(D)\t useless", 3, 0, null))
        liste.add(englishObj2010(36, getText(R.string.Question36), 0, "(A)\t suitable", "(B)\t accommodating", "(C)\t responsible", "(D)\t interesting", 1, 0, null))
        liste.add(englishObj2010(37, getText(R.string.Question37), 0, "(A)\t lively", "(B)\t fascinating", "(C)\t precious", "(D)\t lifeless", 4, 0, null))
        liste.add(englishObj2010(38, getText(R.string.Question38), 0, "(A)\t verbose", "(B)\t precise", "(C)\t unsatisfactory", "(D)\t unconditional", 3, 0, null))
        liste.add(englishObj2010(39, getText(R.string.Question39), 0, "(A)\t trusted", "(B)\t critical", "(C)\t affluent", "(D)\t strong", 4, 0, null))
        liste.add(englishObj2010(40, getText(R.string.Question40), 0, "(A)\t quick", "(B)\t brief", "(C)\t frank", "(D)\t hurried", 3, 0, null))
        liste.add(englishObj2010(41, getText(R.string.Question41), 0, "(A)\t of", "(B)\t at", "(C)\t about", "(D)\t with", 1, 0, null))
        liste.add(englishObj2010(42, getText(R.string.Question42), 0, "(A)\t doesn't", "(B)\t don't", "(C)\t do", "(D)\t did", 2, 0, null))
        liste.add(englishObj2010(43, getText(R.string.Question43), 0, "(A)\t me", "(B)\t I", "(C)\t myself", "(D)\t mine", 1, 0, null))
        liste.add(englishObj2010(44, getText(R.string.Question44), 0, "(A)\t in", "(B)\t at", "(C)\t under", "(D)\t on", 2, 0, null))
        liste.add(englishObj2010(45, getText(R.string.Question45), 0, "(A)\t go", "(B)\t have gone", "(C)\t went", "(D)\t should go", 3, 0, null))

        liste.add(englishObj2010(46, getText(R.string.Question46), 0, "(A)\t sit in", "(B)\t sit at", "(C)\t sit", "(D)\t sit to", 1, 0, null))
        liste.add(englishObj2010(47, getText(R.string.Question47), 0, "(A)\t is", "(B)\t are", "(C)\t have been", "(D)\t were", 1, 0, null))
        liste.add(englishObj2010(48, getText(R.string.Question48), 0, "(A)\t lives", "(B)\t lived", "(C)\t live", "(D)\t living", 3, 0, null))
        liste.add(englishObj2010(49, getText(R.string.Question49), 0, "(A)\t secretaries general", "(B)\t secretary generals", "(C)\t secretaries generals", "(D)\t secretary generals'", 1, 0, null))
        liste.add(englishObj2010(50, getText(R.string.Question50), 0, "(A)\t round wooden beautiful table", "(B)\t wooden round beautiful table", "(C)\t beautiful wooden round table", "(D)\t beautiful round wooden table", 4, 0, null))
        liste.add(englishObj2010(51, getText(R.string.Question51), 0, "(A)\t do they", "(B)\t don't they", "(C)\t didn't they", "(D)\t isn't it", 1, 0, null))
        liste.add(englishObj2010(52, getText(R.string.Question52), 0, "(A)\t more", "(B)\t longer", "(C)\t again", "(D)\t always", 2, 0, null))
        liste.add(englishObj2010(53, getText(R.string.Question53), 0, "(A)\t up", "(B)\t by", "(C)\t out", "(D)\t about", 4, 0, null))
        liste.add(englishObj2010(54, getText(R.string.Question54), 0, "(A)\t very", "(B)\t too", "(C)\t so", "(D)\t much", 2, 0, null))
        liste.add(englishObj2010(55, getText(R.string.Question55), 0, "(A)\t to", "(B)\t by", "(C)\t with", "(D)\t for", 1, 0, null))
        liste.add(englishObj2010(56, getText(R.string.Question56), 0, "(A)\t ground", "(B)\t grind", "(C)\t grinds", "(D)\t grounded", 1, 0, null))
        liste.add(englishObj2010(57, getText(R.string.Question57), 0, "(A)\t tell", "(B)\t told", "(C)\t am telling", "(D)\t will tell", 2, 0, null))
        liste.add(englishObj2010(58, getText(R.string.Question58), 0, "(A)\t between", "(B)\t with", "(C)\t among", "(D)\t to", 3, 0, null))
        liste.add(englishObj2010(59, getText(R.string.Question59), 0, "(A)\t one other", "(B)\t themselves", "(C)\t the other", "(D)\t one another", 3, 0, null))
        liste.add(englishObj2010(60, getText(R.string.Question60), 0, "(A)\t a little", "(B)\t a few", "(C)\t little", "(D)\t few", 1, 0, null))
        liste.add(englishObj2010(61, getText(R.string.Question61), 0, "(A)\t girl guides", "(B)\t girls guide", "(C)\t girls guides", "(D)\t girl guide", 2, 0, null))
        liste.add(englishObj2010(62, getText(R.string.Question62), 0, "(A)\t are", "(B)\t have been", "(C)\t is", "(D)\t were", 3, 0, null))
        liste.add(englishObj2010(63, getText(R.string.Question63), 0, "(A)\t will not treat us like that", "(B)\t would not treat us like that", "(C)\t will not have treated us like that", "(D)\t would not have treated us like that", 4, 0, null))
        liste.add(englishObj2010(64, getText(R.string.Question64), 0, "(A)\t recite", "(B)\t recited", "(C)\t recites", "(D)\t reciting", 1, 0, null))
        liste.add(englishObj2010(65, getText(R.string.Question65), 0, "(A)\t has had", "(B)\t have had", "(C)\t are having", "(D)\t have", 1, 0, null))
        liste.add(englishObj2010(66, getText(R.string.Question66), 0, "(A)\t chalks", "(B)\t a chalk", "(C)\t some chalk", "(D)\t many chalks", 3, 0, null))
        liste.add(englishObj2010(67, getText(R.string.Question67), 0, "(A)\t on", "(B)\t out", "(C)\t up", "(D)\t in", 2, 0, null))
        liste.add(englishObj2010(68, getText(R.string.Question68), 0, "(A)\t is", "(B)\t have been", "(C)\t are", "(D)\t were", 1, 0, null))
        liste.add(englishObj2010(69, getText(R.string.Question69), 0, "(A)\t were starting", "(B)\t had started", "(C)\t started", "(D)\t should start", 3, 0, null))
        liste.add(englishObj2010(70, getText(R.string.Question70), 0, "(A)\t are", "(B)\t was", "(C)\t is", "(D)\t were", 3, 0, null))
        liste.add(englishObj2010(71, getText(R.string.Question71), 0, "(A)\t by", "(B)\t with", "(C)\t from", "(D)\t for", 2, 0, null))
        liste.add(englishObj2010(72, getText(R.string.Question72), 0, "(A)\t in", "(B)\t by", "(C)\t from", "(D)\t within", 3, 0, null))
        liste.add(englishObj2010(73, getText(R.string.Question73), 0, "(A)\t at", "(B)\t with", "(C)\t for", "(D)\t by", 2, 0, null))
        liste.add(englishObj2010(74, getText(R.string.Question74), 0, "(A)\t did not", "(B)\t could not have", "(C)\t should not have", "(D)\t will not have", 2, 0, null))
        liste.add(englishObj2010(75, getText(R.string.Question75), 0, "(A)\t that", "(B)\t when", "(C)\t as", "(D)\t then", 4, 0, null))
        liste.add(englishObj2010(76, getText(R.string.Question76), 0, "(A)\t routine", "(B)\t effective", "(C)\t serious", "(D)\t necessary", 2, 0, null))
        liste.add(englishObj2010(77, getText(R.string.Question77), 0, "(A)\t movement", "(B)\t ruling", "(C)\t construction", "(D)\t administration", 4, 0, null))
        liste.add(englishObj2010(78, getText(R.string.Question78), 0, "(A)\t delegated", "(B)\t promised", "(C)\t allowed", "(D)\t slated", 1, 0, null))
        liste.add(englishObj2010(79, getText(R.string.Question79), 0, "(A)\t work", "(B)\t jobs", "(C)\t duties", "(D)\t choices", 3, 0, null))
        liste.add(englishObj2010(80, getText(R.string.Question80), 0, "(A)\t social", "(B)\t academic", "(C)\t extra-curricular", "(D)\t special", 3, 0, null))
        liste.add(englishObj2010(81, getText(R.string.Question81), 0, "(A)\t association", "(B)\t indiscipline", "(C)\t relationship", "(D)\t behaviour", 2, 0, null))
        liste.add(englishObj2010(82, getText(R.string.Question82), 0, "(A)\t supervision", "(B)\t assignment", "(C)\t administering", "(D)\t planning", 3, 0, null))
        liste.add(englishObj2010(83, getText(R.string.Question83), 0, "(A)\t evaluation", "(B)\t attendance", "(C)\t diligence", "(D)\t studies", 2, 0, null))
        liste.add(englishObj2010(84, getText(R.string.Question84), 0, "(A)\t operated", "(B)\t ruled", "(C)\t manipulated", "(D)\t evolved", 1, 0, null))
        liste.add(englishObj2010(85, getText(R.string.Question85), 0, "(A)\t limit", "(B)\t duplicated", "(C)\t decrease", "(D)\t minimize", 4, 0, null))
        liste.add(englishObj2010(86, getText(R.string.Question86), 0, "(A)\t feeling", "(B)\t sign", "(C)\t tone", "(D)\t design", 2, 0, null))
        liste.add(englishObj2010(87, getText(R.string.Question87), 0, "(A)\t records", "(B)\t courses", "(C)\t deeds", "(D)\t functions", 4, 0, null))
        liste.add(englishObj2010(88, getText(R.string.Question88), 0, "(A)\t implement", "(B)\t feature", "(C)\t tool", "(D)\t device", 3, 0, null))
        liste.add(englishObj2010(89, getText(R.string.Question89), 0, "(A)\t union", "(B)\t village", "(C)\t community", "(D)\t group", 4, 0, null))
        liste.add(englishObj2010(90, getText(R.string.Question90), 0, "(A)\t connect", "(B)\t ring", "(C)\t stir", "(D)\t wake", 2, 0, null))
        liste.add(englishObj2010(91, getText(R.string.Question91), 0, "(A)\t card", "(B)\t mobile", "(C)\t line", "(D)\t set", 2, 0, null))
        liste.add(englishObj2010(92, getText(R.string.Question92), 0, "(A)\t received", "(B)\t dialled", "(C)\t inserted", "(D)\t scrolled", 2, 0, null))
        liste.add(englishObj2010(93, getText(R.string.Question93), 0, "(A)\t handset", "(B)\t call", "(C)\t  number", "(D)\t phone", 3, 0, null))
        liste.add(englishObj2010(94, getText(R.string.Question94), 0, "(A)\t operator", "(B)\t receiver", "(C)\t caller", "(D)\t subscriber", 1, 0, null))
        liste.add(englishObj2010(95, getText(R.string.Question95), 0, "(A)\t credit", "(B)\t money", "(C)\t account", "(D)\t fund", 1, 0, null))
        liste.add(englishObj2010(96, getText(R.string.Question96), 0, "(A)\t tone", "(B)\t phone", "(C)\t sound", "(D)\t call", 4, 0, null))
        liste.add(englishObj2010(97, getText(R.string.Question97), 0, "(A)\t on", "(B)\t in", "(C)\t through", "(D)\t out", 3, 0, null))
        liste.add(englishObj2010(98, getText(R.string.Question98), 0, "(A)\t application", "(B)\t recharge", "(C)\t calling", "(D)\t dialing", 2, 0, null))
        liste.add(englishObj2010(99, getText(R.string.Question99), 0, "(A)\t make", "(B)\t try", "(C)\t receive", "(D)\t register", 1, 0, null))
        liste.add(englishObj2010(100, getText(R.string.Question100), 0, "(A)\t billing", "(B)\t fixing", "(C)\t loading", "(D)\t applying", 3, 0, null))






        val adapter = ViewPagerEng2010ObjAns(liste)
        view_pager.adapter = adapter

//        val indicator = findViewById<CircleIndicator3>(R.id.indicator)
//        indicator.setViewPager(view_pager)

    }
}